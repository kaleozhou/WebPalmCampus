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
import com.org.palmcampus.bll.ErplanEmailIService;
import com.org.palmcampus.bll.ErpuserIService;
import com.org.palmcampus.bll.impl.ErplanEmailService;
import com.org.palmcampus.pojo.ErplanEmail;
import com.org.palmcampus.pojo.Erpuser;


/** 
* @ClassName: PhoneLogin 
* @Description: 实现登录的Action
* @author: kaleo 
* @date 2014-8-12 上午9:27:02 
*  
*/ 
@SuppressWarnings("serial")
public class SendEmail extends ActionSupport {
	private static Logger logger=Logger.getLogger(SendEmail.class.getName());
	private String content,to,empNo,title,from,cc;

	/**  
	* @Fields userIs : TODO(邮件表的服务接口)  
	*/ 
	private ErplanEmailIService lanemailIs;
	public ErplanEmailIService getLanemailIs() {
		return lanemailIs;
	}



	public void setLanemailIs(ErplanEmailIService lanemailIs) {
		this.lanemailIs = lanemailIs;
	}



	private HttpServletRequest request;


	private HttpServletResponse response;



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

		  JSONObject obj = JSONObject.fromObject(buffer.toString());
		  logger.info("返回数据"+buffer.toString());
		  content =obj.getString("content");
		  String tos =obj.getString("to");
		  String[] toss=tos.split(",");
		  from =obj.getString("from");
		  empNo =obj.getString("empNo");
		  cc =obj.getString("cc");
		  title =obj.getString("title");
		  for(int i=0;i<toss.length;i++)
		  {
		  ErplanEmail email=new ErplanEmail();
		  email.setEmailContent(content);
		  to=toss[i];
		  email.setToUser(to);
		  email.setCc(cc);
		  email.setEmailTitle(title);
		  email.setFromUser(from);
		  //调用邮件插入方法
		  lanemailIs.addLanemail(email);
		  }
		  logger.info("内容"+obj.getString("content"));
		  PrintWriter out=response.getWriter();
		  //新建json用来存储返回数据
		  JSONObject result=new JSONObject();

		  result.put("res", true);
		 
//			  设置数据格式
		  out.print(URLEncoder.encode(result.toString(),"utf-8"));
		  logger.info("返回数据"+result.toString());
		  out.close();
		 
		 
		  
	
		 
		 
		  
		

		return null;
	}
}