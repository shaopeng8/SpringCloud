package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEnrekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEnrekaApplication.class, args);
	}

	/**
	 * <pre>
	 * 关闭csrf
	 * </pre>
	 * @author shenshao
	 * @version 1.0
	 */
	@Configuration
	public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable();
			super.configure(http);
		}
	}
}
