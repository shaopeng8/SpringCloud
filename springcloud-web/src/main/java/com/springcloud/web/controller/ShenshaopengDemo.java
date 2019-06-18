package com.springcloud.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * <pre>
 * 测试
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@Controller
@Slf4j
public class ShenshaopengDemo {

	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/toDemoPage")
	public String toDemoPage(HttpServletRequest request) {
		log.info("端口：" + request.getLocalPort());
		return "index.html";
	}

	@ResponseBody
	@RequestMapping(value = "/toDemoResBody")
	public String toDemoResBody(@RequestParam(value = "name", defaultValue = "shenshao") String name) {
		return "您好~" + name + "，您此次访问WEB服务的端口是：" + port;
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