package OOP;

public class Auther {
	private String name;
	private String email;

	public Auther(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Auther [name=" + name + ", email=" + email + "]";
	}

}
