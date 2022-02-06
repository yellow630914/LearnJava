package project1;
/**
 * @Description Customer為實體物件,來封裝客戶信息。
 * @author Jin
 * @version
 * @date 2021年1月19日18:36
 *
 */
public class Customer {
	//屬性
	String name;
	char gender;
	int age;
	String phone;
	String email;
	//構造器
	public Customer() {
	}
	
	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	//get,set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
