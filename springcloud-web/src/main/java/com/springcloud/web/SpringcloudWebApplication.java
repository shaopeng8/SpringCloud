package com.springcloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableConfigurationProperties
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringcloudWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudWebApplication.class, args);
	}

}