package pl.adrianszromba.app.service;

import org.springframework.stereotype.Service;
import pl.adrianszromba.app.entity.User;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

	private List<User> users = Arrays.asList(new User("James", "Cameron", 30, "Jamie"),
			new User("Colin", "Morta", 30, "Mortadela"),
			new User("Freddy", "Num", 30, "Numie")
	);

	public List<User> getAllUsers () {
		return users;
	}

	public User getUserByLogin (String login) {
		return users.stream().filter(u -> u.getLogin().equals(login)).findFirst().get();
	}
}
