package com.in28minutes.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringCloudConfigServerApplication {


	// add comment to test conflict test


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
