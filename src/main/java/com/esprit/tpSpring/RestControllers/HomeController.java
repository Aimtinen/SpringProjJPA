package com.esprit.tpSpring.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.tpSpring.entity.User;
import com.esprit.tpSpring.services.Impl.UserService;

@RestController
public class HomeController {

	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public String createNewUser(@RequestBody User user) {
		
		String msg="";
		User userExists = userService.findUserByUserName(user.getUserName());
		if (userExists != null) {
			msg="There is already a user registered with the user name provided";
		}else {
			userService.saveUser(user);
			msg="OK";
		}
		
		
		return msg;	
		
	}
}
