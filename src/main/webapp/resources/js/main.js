function renderTemplate(ctx){
	console.log(ctx);
	var source   = $("#resultsTemplate").html();
	var template = Handlebars.compile(source);
	var prueba = {  
			   "responseData":{  
				      "results":[{  
				            "GsearchResultClass":"GwebSearch",
				            "unescapedUrl":"https://twitter.com/rihanna?lang\u003des",
				            "url":"https://twitter.com/rihanna%3Flang%3Des",
				            "visibleUrl":"twitter.com",
				            "cacheUrl":"http://www.google.com/search?q\u003dcache:Fc_duIJP8WoJ:twitter.com",
				            "title":"\u003cb\u003eRihanna\u003c/b\u003e (@\u003cb\u003erihanna\u003c/b\u003e) | Twitter",
				            "titleNoFormatting":"Rihanna (@rihanna) | Twitter",
				            "content":"9.721 tweets • 1.383 fotos/videos • 51,7 M seguidores. \u0026quot;New cover for @\ntheFADER out now! Read the article: ---\u0026gt; http://t.co/cS6R6VcA8J #FADER100 ..."
				         },
				         {  
				            "GsearchResultClass":"GwebSearch",
				            "unescapedUrl":"http://www.rihannanow.com/",
				            "url":"http://www.rihannanow.com/",
				            "visibleUrl":"www.rihannanow.com",
				            "cacheUrl":"http://www.google.com/search?q\u003dcache:F17Smm4oORMJ:www.rihannanow.com",
				            "title":"\u003cb\u003eRihanna\u003c/b\u003e: New Album Anti Coming Soon",
				            "titleNoFormatting":"Rihanna: New Album Anti Coming Soon",
				            "content":"Enter The Site \u0026gt; · Enter The Site \u0026gt;"
				         }],
				      "cursor":{  }
				   },
				   "responseDetails":null,
				   "responseStatus":200
				};
	var query = $('#inputQuery').val();
	console.log(query);
	$.ajax({
		   url: ctx+'/search/'+query,
		   error: function() {
		      $('#resultsDiv').html('<p>An error has occurred</p>');
		   },
		   success: function(data) {
			   var html = template(data);
				$('#resultsDiv').html(html);
		   },
		   type: 'GET'
		});
	
}