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
* @Description: �������������
* @author: kaleo 
* @date 2014-9-10 ����3:11:59 
*  
*/ 
@SuppressWarnings("serial")
public class Changepwd extends ActionSupport {
	private static Logger logger=Logger.getLogger(Changepwd.class.getName());
	String Tag="Changepwd";

	/**  
	* @Fields userIs : TODO(�û���ķ���ӿ�)  
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
		  //�½�json�����洢��������
		  JSONObject result=new JSONObject();
		  
		  //����������Եķ���
		  result.put("res", true);
		  result.put("data", "�޸�����ɹ���");
		  //�������ݸ�ʽ
		  out.print(URLEncoder.encode(result.toString(),"utf-8"));
		  logger.info("��������"+result.toString());
		  out.close();
		 

		return null;
	}
}