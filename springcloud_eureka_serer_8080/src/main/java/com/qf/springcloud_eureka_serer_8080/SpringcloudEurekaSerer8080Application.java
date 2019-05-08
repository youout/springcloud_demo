package com.qf.springcloud_eureka_serer_8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaSerer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaSerer8080Application.class, args);
	}

}
