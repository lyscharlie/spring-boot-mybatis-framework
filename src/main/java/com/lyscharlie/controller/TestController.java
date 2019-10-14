package com.lyscharlie.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@GetMapping("redirect.htm")
	public void redirect(HttpServletRequest request, HttpServletResponse response) {
		String baseHost = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
		// return "redirect:" + baseHost + "user";
		String url = baseHost + "user";
		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("redirect2.htm")
	public String redirect2(HttpServletRequest request, HttpServletResponse response) {
		String baseHost = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
		// return "redirect:" + baseHost + "user";
		String url = baseHost + "user";
		// return "redirect: " + baseHost + "user";
		return "redirect:http://www.baidu.com";
	}

}
