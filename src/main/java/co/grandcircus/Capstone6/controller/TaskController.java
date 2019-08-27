package co.grandcircus.Capstone6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Capstone6.repo.TasklistRepo;
import co.grandcircus.Capstone6.repo.UserRepo;
import co.grandcircus.Capstone6.task.Task;
import co.grandcircus.Capstone6.task.User;

@Controller
public class TaskController {
	
	@Autowired
	UserRepo u;
	
	@Autowired
	TasklistRepo t;
	
	@RequestMapping("add-details")
	public ModelAndView addDetails(Task addDeets, @RequestParam("email")String email) {
		User users = u.findByEmail(email);
		addDeets.setUseremail(users.getEmail());
		t.save(addDeets);
		return new ModelAndView("redirect:my-task");
	}


}
