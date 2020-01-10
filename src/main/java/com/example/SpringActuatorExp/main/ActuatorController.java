package com.example.SpringActuatorExp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ActuatorController {

	@GetMapping("message")
	@ResponseBody
	public String getMessage() {
		return "hai message";
	}
	
}
