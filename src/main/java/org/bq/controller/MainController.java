package org.bq.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value = "login.do")
	public ModelAndView login(@RequestParam("name") String name,
			HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("name", name);
		try {
			name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
