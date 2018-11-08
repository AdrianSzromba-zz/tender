package pl.adrianszromba.app.entity;

public class UserEntity {

	private String firstName;
	private String lastName;
	private int age;
	private String login;

	public UserEntity(String firstName, String lastName, int age, String login) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
