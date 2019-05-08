package com.qf.springcloud_eureka_client_9090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class SpringcloudEurekaClient9090Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClient9090Application.class, args);
	}

}
