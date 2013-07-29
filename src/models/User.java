package models;

public class User {
	protected int user_id;
	protected String last_name;
	protected String first_name;
	protected String middle_initial;
	protected String gender;
	protected String birthday;
	protected String username;
	protected String password;
	
	public User(int user_id, 
			 String last_name, 
			 String first_name, 
			 String middle_initial, 
			 String gender, 
			 String birthday, 
			 String username, 
			 String password) {
		this.user_id = user_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.middle_initial = middle_initial;
		this.gender = gender;
		this.birthday = birthday;
		this.username = username;
		this.password = password;
	}
	
	/*****************
	 *    Setters    *
	 * **************/
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public void setFirst_name(String firs_name) {
		this.first_name = firs_name;
	}
	
	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*****************
	 *    Getters    *
	 * **************/
	
	public int getUser_id() {
		return user_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public String getMiddle_initial() {
		return middle_initial;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
}
