package co.grandcircus.Capstone6.controller;

import java.util.List;

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
public class UserController {

	@Autowired
	UserRepo u;
	@Autowired
	TasklistRepo t;

	User loginU;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home-page");
		return mv;
	}

	@RequestMapping("login-info")
	public ModelAndView viewTask(@RequestParam("email") String email, @RequestParam("password") String password) {
		//System.out.println(email);
		User input = u.findByEmail(email);
		//System.out.println(input);

//		System.out.println(email);
//		System.out.println(password);
		if (input == null) {
			return new ModelAndView("sorry", "message", "Sorry, wrong email!");
		} else if (password != null) {

			if (!input.getPassword().equals(password)) {
				return new ModelAndView("sorry", "message", "Sorry, wrong password");
			}
		}
		loginU = input;
		List<Task> tasks = input.getTasks();
		ModelAndView mv = new ModelAndView("my-task", "userTask", tasks);
		// return new ModelAndView("home-page");
		return mv;
	}

	@RequestMapping("registration")
	public ModelAndView register(User reg) {
		return new ModelAndView("registration-page", "register", reg);
	}

	@RequestMapping("add-user")
	public ModelAndView addUser(User userDetails) {
		u.save(userDetails);
		return new ModelAndView("redirect:/");
	}
//	@RequestMapping("login-info")
//	public ModelAndView viewTask() {
//	User input = u.findById(1).orElse(null);
//	List<Task> tasks = input.getTasks();
//	ModelAndView mv = new ModelAndView("my-task", "userTask", tasks);
//	return mv;
//	}

	@RequestMapping("mark-complete")
	public ModelAndView completed(@RequestParam("id") int taskid) {
		Task temptask = t.findById(taskid).orElse(null);
		temptask.setComplete("yes");
		t.save(temptask);
		List<Task> tasks = loginU.getTasks();
		ModelAndView mv = new ModelAndView("my-task", "userTask", tasks);
		return mv;
	}
//	@RequestMapping("add-task")
//	public ModelAndView addTask(Task taskDetails) {
//		return new ModelAndView("add-task", "addTask", taskDetails);
//	}
//	@RequestMapping("add-details")
//	public ModelAndView addDetails(Task addDeets, @RequestParam("email")String email1) {
//		User users = u.findByEmail(email1);
//		addDeets.setUseremail(users.getEmail());
//		t.save(addDeets);
//		return new ModelAndView("redirect:my-task");
//	}

}
