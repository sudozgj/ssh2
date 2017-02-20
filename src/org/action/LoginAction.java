package org.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.model.User;
import org.service.UserService;

import com.mysql.fabric.xmlrpc.base.Data;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private List result;
	private String username;
	private String password;
	private String name;
	private UserService userService;
	
	public String login() throws Exception{
		System.out.println("name:"+name);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("result","收到消息啦");
		map.put("msg", username+" "+password+" "+name);
		List<Map<String, String>> list = new ArrayList();
		list.add(map);
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setCreatetime(new Date().getTime());
		
		userService.addUser(user);
		
		result=list;
		
		return SUCCESS;
	}

	//————————————————————————————————
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UserService getUserService() {
		return userService;
	}
	public List getResult() {
		return result;
	}
	public void setResult(List result) {
		this.result = result;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
