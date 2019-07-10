package com.springcloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * <pre>
 * API Test
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableConfigurationProperties
@ComponentScan("com.springcloud.api")
public class SpringcloudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApiApplication.class, args);
	}

}
