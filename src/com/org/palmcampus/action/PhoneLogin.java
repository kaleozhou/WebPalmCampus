package com.org.palmcampus.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.processors.JsonBeanProcessor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.org.palmcampus.bll.ErpuserIService;


/** 
* @ClassName: PhoneLogin 
* @Description: 实现登录的Action
* @author: kaleo 
* @date 2014-8-12 上午9:27:02 
*  
*/ 
@SuppressWarnings("serial")
public class PhoneLogin extends ActionSupport {
	private static Logger logger=Logger.getLogger(PhoneLogin.class.getName());
	/**  
	* @Fields password : TODO(用户密码)  
	* @Fields username : TODO(用户名) 
	*/ 
	private String username,password;
	/**  
	* @Fields userIs : TODO(用户表的服务接口)  
	*/ 
	private ErpuserIService userIs;
	private HttpServletRequest request;
	private HttpServletResponse response;
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

	public ErpuserIService getUserIs() {
		return userIs;
	}

	public void setUserIs(ErpuserIService userIs) {
		this.userIs = userIs;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		response=ServletActionContext.getResponse();
		request=ServletActionContext.getRequest();
		
		 
		logger.info("POST");
	
		BufferedReader reader = request.getReader();
	
		  StringBuffer buffer = new StringBuffer();
		 
		  String string;
		  while ((string = reader.readLine()) != null) {
		   buffer.append(string);
		  }
		  reader.close();
		  JSONObject object = JSONObject.fromObject(buffer.toString());
		  username=object.getString("username");
		  password=object.getString("password");
		  logger.info("用户名："+username+" 密码："+password);
		  PrintWriter out=response.getWriter();
		  //新建json用来存储返回数据
		  JSONObject result=new JSONObject();
		  //调用登录方法，获得登录结果
		  int i=0;
		  i=userIs.updateLogin(username, password);	
		  result.put("i", i);
		  if(i==0||i==3)
		  {
			  result.put("user", userIs.findByTrueName(username));
		  }
		  //设置数据格式
		  out.print(URLEncoder.encode(result.toString(),"utf-8"));
		  logger.info("返回数据"+result.toString());
		  out.close();
		 
		 
		  
	
		 
		 
		  
		

		return null;
	}
}