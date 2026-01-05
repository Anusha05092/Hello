package com.Welcome.Welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/data/view")
	public String view() {
		return "Hi";
	}

}
