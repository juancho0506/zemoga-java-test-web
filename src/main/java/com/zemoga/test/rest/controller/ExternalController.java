/**
 * 
 */
package com.zemoga.test.rest.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class to consume external rest services
 * @author Rodrigo
 *
 */
@Controller
@RequestMapping(value = "/search")
public class ExternalController {
	
	
	@RequestMapping(value = "/{query}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String search(@PathVariable String query) throws IOException {
		StringBuffer result = new StringBuffer();
		try {
			query = query.replace(' ', '+');
			URL url = new URL("http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q="+query);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				result.append("{error: Malformed URL error with the word: + " +query+ "}");
				return result.toString();
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			
			System.out.println("Output from Server .... \n");
			String output = "";
			while ((output = br.readLine()) != null) {
				result.append(output);
			}

			conn.disconnect();

		  } catch (MalformedURLException e) {

			 result.append("{error: No se pudo conectar a la URL}");

		  } catch (IOException e) {

			  result.append("{error: No se pudo conectar a la URL}");

		  }

		return result.toString();
	}
}
