package com.dongyongkim.MyPortfolio.index;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class IndexController {

	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
}
