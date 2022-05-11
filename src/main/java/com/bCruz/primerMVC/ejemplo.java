package com.bCruz.primerMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ejemplo {

	@GetMapping("/")
	public String Saludo() {
		return "ejemplo";
	}
}
