package com.example.MyFirstWeb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Engineer engineer) {
		
		/* Using session ---  In servlets we use -> HttpServletRequest request
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		System.out.println("Yes I'm, "+name);
		session.setAttribute("name", name);
		*/
		/*@RequestParam("name") String myName*/
		/*We can use Object as well*/
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("obj",engineer);
		return mv;
	}
}
