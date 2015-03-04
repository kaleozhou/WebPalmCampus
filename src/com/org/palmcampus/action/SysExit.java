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
import com.org.palmcampus.pojo.Erpuser;



public class SysExit extends ActionSupport {
	private static Logger logger=Logger.getLogger(SysExit.class.getName());
	/**  
	* @Fields username : TODO(�û���) 
	*/ 
	private String username;
	/**  
	* @Fields userIs : TODO(�û����ķ���ӿ�)  
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

	public ErpuserIService getUserIs() {
		return userIs;
	}

	public void setUserIs(ErpuserIService userIs) {
		this.userIs = userIs;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
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
		  logger.info(username);
		  Erpuser u=userIs.findByTrueName(username);
		  // u.setIfLogin("��");
		  //userIs.updateUser(u);
		return null;
	}
}