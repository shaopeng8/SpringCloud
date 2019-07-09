package com.springcloud.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.api.core.BaseVO;

@Controller
public class FeignTestController {

	@RequestMapping(value = "/toFeignTest", method = RequestMethod.GET)
	@ResponseBody
	public BaseVO<String> queryListByObj(@RequestParam String userName) {
		BaseVO<String> result = new BaseVO<String>();
		result.setMessage("你好，" + userName + "。我是API，Feign找到我帮你把请求处理成功了~");
		return result;
	}
}
