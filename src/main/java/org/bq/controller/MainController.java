package org.bq.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bq.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value = "login.do")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, User user) {
		String username = user.getName();
		ModelAndView mv = new ModelAndView("index", "command",
				"LOGIN SUCCESS, " + username);
		return mv;
	}
}
