/**
 * 
 */
package com.zemoga.test.core.persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Rodrigo
 *
 */
@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath:spring/application-config.xml" })
public class HibernateXmlConfig{
   //
}
