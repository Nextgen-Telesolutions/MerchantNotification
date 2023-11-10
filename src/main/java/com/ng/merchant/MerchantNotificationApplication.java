/**
 * 
 */
package com.ng.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sumit
 *
 */
@ComponentScan("com.ng.merchant")
@SpringBootApplication
public class MerchantNotificationApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(MerchantNotificationApplication.class, args);
	}
	
}