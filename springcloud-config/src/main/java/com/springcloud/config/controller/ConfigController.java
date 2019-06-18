package com.springcloud.config.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.config.common.ConstantsConfig;

/**
 * 
 * <pre>
 * 常量控制器
 * </pre>
 * 
 * @author shenshao
 * @version 1.0
 */
@RestController
public class ConfigController {

	@Autowired
	private ConstantsConfig cconfig;

	@RequestMapping(value = "/getConfigByName")
	public String getConfigByName(HttpServletRequest request) {

		return cconfig.getAuthor();
	}
}
