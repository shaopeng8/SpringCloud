package com.springcloud.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.web.core.BaseVO;

@FeignClient(name = "springCloud-api")
public interface APIClient {

	@GetMapping(value = "/toFeignTest")
	@ResponseBody
	BaseVO<String> toFeignTest(@RequestParam(value = "userName", required = true) String userName);

}