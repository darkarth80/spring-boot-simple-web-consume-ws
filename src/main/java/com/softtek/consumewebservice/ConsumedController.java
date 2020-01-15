package com.softtek.consumewebservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConsumedController {

	@GetMapping("/")
	public String greeting(@RequestParam(name="texto", required=false, defaultValue="Hola") String texto, Model model) {
		model.addAttribute("texto", texto);
		return "greeting";
	}

}
