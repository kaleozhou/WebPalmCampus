package com.org.palmcampus.action;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.org.palmcampus.bll.ErpgongGaoIService;
import com.org.palmcampus.bll.impl.ErpuserService;



/** 
* @ClassName: GongGaoLiuYan 
* @Description: 公告里面的留言
* @author: kaleo 
* @date 2014-9-10 下午3:11:59 
*  
*/ 
@SuppressWarnings("serial")
public class Changepwd extends ActionSupport {
	private static Logger logger=Logger.getLogger(Changepwd.class.getName());
	String Tag="Changepwd";

	/**  
	* @Fields userIs : TODO(用户表的服务接口)  
	*/ 
	private ErpuserService userIs;
	private HttpServletRequest request;
	public ErpuserService getUserIs() {
		return userIs;
	}




	public void setUserIs(ErpuserService userIs) {
		this.userIs = userIs;
	}




	private HttpServletResponse response;




	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		response=ServletActionContext.getResponse();
		request=ServletActionContext.getRequest();
		
		 
		logger.info(Tag+"   POST");
	
		BufferedReader reader = request.getReader();
	
		  StringBuffer buffer = new StringBuffer();
		 
		  String string;
		  while ((string = reader.readLine()) != null) {
		   buffer.append(string);
		  }
		  reader.close();
		  JSONObject object = JSONObject.fromObject(buffer.toString());
		  logger.info(Tag+buffer.toString());
		  PrintWriter out=response.getWriter();
		  //新建json用来存储返回数据
		  JSONObject result=new JSONObject();
		  
		  //调用添加留言的方法
		  result.put("res", true);
		  result.put("data", "修改密码成功了");
		  //设置数据格式
		  out.print(URLEncoder.encode(result.toString(),"utf-8"));
		  logger.info("返回数据"+result.toString());
		  out.close();
		 

		return null;
	}
}