package com.springcloud.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * <pre>
 * API Client Server
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@FeignClient(name = "SPRINGCLOUD-API", fallback = APIClientFallBack.class)
public interface APIClient {

	@GetMapping(value = "/toFeignTest")
	@ResponseBody
	String toFeignTest(@RequestParam(value = "userName") String userName);

	@GetMapping(value = "/toHystrixTest")
	String toHystrixTest(@RequestParam(value = "userName") String userName);

}