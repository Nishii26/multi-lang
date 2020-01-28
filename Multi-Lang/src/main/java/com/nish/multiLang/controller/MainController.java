package com.nish.multiLang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	 @RequestMapping(value = "/{locale:en|fr|vi}/login")
	    public String login(Model model) {
	        return "login";
	    }
}
