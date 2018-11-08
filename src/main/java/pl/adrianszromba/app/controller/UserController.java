package pl.adrianszromba.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adrianszromba.app.entity.User;
import pl.adrianszromba.app.service.UserService;

import java.util.List;

@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping("/users/{login}")
	public User getUserByLogin(@PathVariable String login) {
		return userService.getUserByLogin(login);
	}
}