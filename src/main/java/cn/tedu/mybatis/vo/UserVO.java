package cn.tedu.mybatis.vo;

import java.io.Serializable;

public class UserVO implements Serializable {

	private static final long serialVersionUID = -6333024194222990665L;

	private Integer uid;
	private String username;
	private String password;
	private Integer age;
	private String phone;
	private String email;
	private Integer isDelete;
	private Integer did;
	private String name;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", username=" + username + ", password=" + password + ", age=" + age + ", phone="
				+ phone + ", email=" + email + ", isDelete=" + isDelete + ", did=" + did + ", name=" + name + "]";
	}
}
