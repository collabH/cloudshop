package com.huangsm.cloud.cloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * oauth2
 * @author huangsm
 * @date 2019年1月2日 22:17:30
 */

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);
	}

}

