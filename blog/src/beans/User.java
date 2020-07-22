package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.hibernate.validator.constraints.NotBlank;

@ManagedBean(name="user")
@ViewScoped
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message="First Name must not be empty!")
	private String firstName;
	
	@NotBlank(message="Last Name must not be empty!")
	private String lastName;
	
	@NotBlank(message="Username must not be empty!")
	private String userName;
	
	@NotBlank(message="Password must not be empty!")
	private String password;
	
	@NotBlank(message="Email must not be empty!")
	private String email;
	
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.userName = "";
		this.password = "";
		this.email = "";
	}
	
	public User(String firstName, String lastName, String userName, 
			String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
