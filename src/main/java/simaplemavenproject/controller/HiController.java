package simaplemavenproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@RequestMapping("/hello")
	public String displayMessage() {
		return "Hi,How are you";
	}

}
