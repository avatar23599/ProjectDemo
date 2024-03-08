package com.demo.controllers.admin;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("admin/order")
public class OrderController {
	
	@RequestMapping(value = "inport", method = RequestMethod.GET)
	public String inport(ModelMap modelMap) {
		return "admin/order/import";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		
		return "admin/account/register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register() {
		return "admin/account/register";
	}

}
