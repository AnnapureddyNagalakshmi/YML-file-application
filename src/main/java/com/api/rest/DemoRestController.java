package com.api.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.props.AppProperties;

@RestController
public class DemoRestController {
	@Autowired
	private AppProperties props;
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String,String> messages=props.getMessages();
		String value=messages.get("welcomeMsg");
		return value;
	}
	@GetMapping("/greet")
	public String getgreetMsg() {
		Map<String,String> messages=props.getMessages();
		String value=messages.get("greetMsg");
		return value;
	}
	@GetMapping("/wish")
	public String getWishMsg() {
		return props.getMessages().get("wishMsg");
	}
	

}
