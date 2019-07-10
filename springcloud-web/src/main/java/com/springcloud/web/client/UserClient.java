package com.springcloud.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.web.core.ResultBody;

@FeignClient(name = "user-server")
public interface UserClient {

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/getUserName")
	ResultBody getUserName(@RequestParam(value = "userId") String userId);

}