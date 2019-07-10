package com.springcloud.web.client;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * <pre>
 * API Client FallBack
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@Component
@Slf4j
public class APIClientFallBack implements APIClient {

	@Override
	public String toFeignTest(String userName) {
		log.info("哎妈呀！toFeignTest接口，被人弄死了~");
		return "哎妈呀，上年纪了~处理不动~";
	}

	@Override
	public String toHystrixTest(String userName) {
		log.info("哎妈呀！toHystrixTest接口，被人弄死了~");
		return "哎妈呀，上年纪了~处理不动~";
	}

}
