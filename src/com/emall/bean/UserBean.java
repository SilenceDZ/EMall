package com.emall.bean;

import java.sql.Date;

public class UserBean {
	private int userid;
	private String username;
	private String password;
	private String truename;
	private char usersex;
	private Date birthday;
	private String email;
	private String phoneno;
	private String postcade;
	private String address;
	private Date regdate;
	private char lockstate;
	private Date lastaccess;
	private int login;
	public UserBean() {
		super();
	}
	public UserBean(int userid, String username, String password,
			String truename, char usersex, Date birthday, String email,
			String phoneno, String postcade, String address, Date regdate,
			char lockstate, Date lastaccess, int login) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.truename = truename;
		this.usersex = usersex;
		this.birthday = birthday;
		this.email = email;
		this.phoneno = phoneno;
		this.postcade = postcade;
		this.address = address;
		this.regdate = regdate;
		this.lockstate = lockstate;
		this.lastaccess = lastaccess;
		this.login = login;
	}
	
	@Override
	public String toString() {
		return "UserBean [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", truename=" + truename
				+ ", usersex=" + usersex + ", birthday=" + birthday
				+ ", email=" + email + ", phoneno=" + phoneno + ", postcade="
				+ postcade + ", address=" + address + ", regdate=" + regdate
				+ ", lockstate=" + lockstate + ", lastaccess=" + lastaccess
				+ ", login=" + login + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public char getUsersex() {
		return usersex;
	}
	public void setUsersex(char usersex) {
		this.usersex = usersex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPostcade() {
		return postcade;
	}
	public void setPostcade(String postcade) {
		this.postcade = postcade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public char getLockstate() {
		return lockstate;
	}
	public void setLockstate(char lockstate) {
		this.lockstate = lockstate;
	}
	public Date getLastaccess() {
		return lastaccess;
	}
	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	
}
