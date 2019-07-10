package com.springcloud.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.api.core.BaseVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FeignTestController {

	@RequestMapping(value = "/toFeignTest", method = RequestMethod.GET)
	@ResponseBody
	public BaseVO<String> toFeignTest(@RequestParam String userName) {
		BaseVO<String> result = new BaseVO<String>();
		result.setMessage("你好，" + userName + "。我是API FeignTest，Feign找到我帮你把请求处理成功了~");
		return result;
	}

	@RequestMapping(value = "/toHystrixTest", method = RequestMethod.GET)
	public String toHystrixTest(@RequestParam String userName) {
		log.info("收到请求,阻塞~");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("阻塞完毕,返回请求~");
		return "你好，" + userName + "。我是API HystrixTest，Hystrix监控中~";
	}
}