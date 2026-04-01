package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Component;

@Component("mailServerConfig")
public class MailServerConfig {
private String ip;
private String login;
private String tokn;


public MailServerConfig() {
	
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


public String getTokn() {
	return tokn;
}


public void setTokn(String tokn) {
	this.tokn = tokn;
}





}
