package com.springcloud.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.web.client.APIClient;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * <pre>
 * Demo Controller
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@Controller
@Slf4j
public class ShenshaopengDemo {

	@Resource
	private APIClient api;

	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/toDemoPage", method = RequestMethod.GET)
	@ResponseBody
	public String toDemoPage(@RequestParam(value = "userName") String userName) {
		return api.toHystrixTest(userName);
	}

	@ResponseBody
	@RequestMapping(value = "/toDemoResBody")
	public String toDemoResBody(@RequestParam(value = "userName", defaultValue = "shenshao") String userName) {
		return "您好~" + userName + "，您此次访问WEB服务的端口是：" + port;
	}

	@RequestMapping(value = "/abcd.html")
	public String toDemoPageByabcd(HttpServletRequest request) {
		log.info("端口：" + request.getLocalPort());
		return "index.html";
	}

	@SuppressWarnings("static-access")
	@RequestMapping(value = "/toRibbonDemo")
	public String toRibbonDemo(HttpServletRequest request) {
		log.info("端口：" + request.getLocalPort());
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("开始跳转：" + request.getLocalPort());
		return "index.html";
	}

}
