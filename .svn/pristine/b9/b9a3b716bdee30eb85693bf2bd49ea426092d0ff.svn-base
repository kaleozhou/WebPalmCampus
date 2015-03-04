package com.org.palmcampus.action;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.org.palmcampus.bll.ErpgongGaoIService;
import com.org.palmcampus.bll.ErpuserIService;
import com.org.palmcampus.pojo.Erpuser;



/** 
* @ClassName: GongGaoLiuYan 
* @Description: 公告里面的留言
* @author: kaleo 
* @date 2014-9-10 下午3:11:59 
*  
*/ 
@SuppressWarnings("serial")
public class GetEmailContact extends ActionSupport {
	private static Logger logger=Logger.getLogger(GetEmailContact.class.getName());
	String Tag="GetEmailContact";
	private ErpuserIService userIs;
	public ErpuserIService getUserIs() {
		return userIs;
	}
	public void setUserIs(ErpuserIService userIs) {
		this.userIs = userIs;
	}
	private HttpServletRequest request;
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
		  JSONObject.fromObject(buffer.toString());
		  logger.info(Tag+buffer.toString());
		  PrintWriter out=response.getWriter(); 
		  //新建json对象
		  
		 JSONArray jar=new JSONArray();
		 List<Erpuser> ls= userIs.findAllUserName();
		 for(Erpuser s:ls)
		 {
			 JSONObject result=new JSONObject();
			 result.put("userName", s.getUserName());
			 result.put("department", s.getDepartment());
			 result.put("jiaose", s.getJiaoSe());
			 if(s.getZhiWei()!=null)
			 {
			 result.put("zhiwei", s.getZhiWei());
			 }
			 else
			 {
				 result.put("zhiwei", "无");
			 }
			 jar.add(result);
		 }
		  
	
		  //设置数据格式
		  out.print(URLEncoder.encode(jar.toString(),"utf-8"));
		  logger.info("返回数据"+jar.toString());
		return null;
	}
}