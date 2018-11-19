package com.Week6Capstone.Week6Capstone;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Week6Capstone.Week6Capstone.entity.Tasks;
import com.Week6Capstone.Week6Capstone.entity.Users;
import com.Week6Capstone.Week6Capstone.jpa.TasksRepository;
import com.Week6Capstone.Week6Capstone.jpa.UsersRepository;

@Controller
public class Cap6Controller {
	
	@Autowired
	UsersRepository uR;
	
	@Autowired
	TasksRepository tR;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping()
	public ModelAndView login(Users user, String password) {
		for (int i = 0; i < 100; i++) {
			if( uR.findById(i).equals(user)) {
				Tasks userTasks = tR.findById(i);
			return new ModelAndView("redirect:/tasklist, usertasks");
		} 
		}return new ModelAndView("redirect:/");
		
	}
	
	
	@RequestMapping("tasklist")
	public ModelAndView tasklist() {
		return new ModelAndView("tasklist");
	}
	
	@RequestMapping("newtask")
	public ModelAndView newtask() {
		return new ModelAndView("newtask");
	}

}
