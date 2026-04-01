package com.mphasis.firstspringapp.service;

public class MailServerConfig {
	private String ip;
	private String login;
	private String token;
	public MailServerConfig(String ip, String login, String token) {
		super();
		this.ip = ip;
		this.login = login;
		this.token = token;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void display() {
		System.out.print(ip);
		System.out.print(login);
		System.out.print(token);

	}

}
