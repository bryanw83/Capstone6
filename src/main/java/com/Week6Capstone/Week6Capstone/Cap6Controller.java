package com.Week6Capstone.Week6Capstone;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Week6Capstone.Week6Capstone.entity.Tasks;
import com.Week6Capstone.Week6Capstone.entity.Users;
import com.Week6Capstone.Week6Capstone.jpa.TasksRepository;
import com.Week6Capstone.Week6Capstone.jpa.UsersRepository;

@Controller
public class Cap6Controller {
	
	@Autowired
	UsersRepository u;
	
	@Autowired
	TasksRepository t;

	@RequestMapping("/")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/login-confirmed")
	public ModelAndView loginNew(Users user) {
		ModelAndView mv = new ModelAndView("tasklist");
		u.save(user);
		return mv;
	}

	@RequestMapping("/login-request")
	public ModelAndView loginRequest(Users user, RedirectAttributes redirectAttrs) {
		ModelAndView mv = new ModelAndView("tasklist", "usertasks", t.findById(user.getUserid()));
		if (u.findByUsername(user.getUsername()) != null) {
			if (u.findByUsername(user.getUsername()).getUserpassword().equals(user.getUserpassword())) {
				return mv;
			}
			
		}else {
		
		redirectAttrs.addFlashAttribute("message", "Invalid Credentials");

		mv = new ModelAndView("redirect:/");
		}
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout(RedirectAttributes redirectAttrs) {
		ModelAndView mv = new ModelAndView("redirect:/");
		redirectAttrs.addFlashAttribute("message", "Logged out!");
		return mv;
	}
	
	
	@RequestMapping("tasklist")
	public ModelAndView tasklist() {
		return new ModelAndView("tasklist", "usertasks", t.findAll());
	}
	
	@RequestMapping("newtask")
	public ModelAndView newtask() {
		return new ModelAndView("newtask");
	}

}
