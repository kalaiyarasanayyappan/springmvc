package com.chainsys.miniproject.pojo;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionListener;
public class User implements HttpSessionBindingListener{
private String UserId;
private String password;
public String getUserId() {
	return UserId;
}
public void setUserId(String userId) {
	UserId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public void valueBound(HttpSessionBindingEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Value bound"+arg0.getName());
	System.out.println("value:"+arg0.getValue().getClass().getName());
}
@Override
public void valueUnbound(HttpSessionBindingEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Value unbound"+arg0.getName());
	
}
}
