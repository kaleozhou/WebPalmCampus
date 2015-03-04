package com.org.palmcampus.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
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
* @Description: ʵ�ֵ�¼��Action
* @author: kaleo 
* @date 2014-8-12 ����9:27:02 
*  
*/ 
@SuppressWarnings("serial")
public class ReceiveEmail extends ActionSupport {
    private static Logger logger=Logger.getLogger(ReceiveEmail.class.getName());
    private static String Tag="ReceiveEmail";
    private String username;
    private int messageId;
    private HttpServletRequest request;
    private HttpServletResponse response;

    /**  
    * @Fields userIs : TODO(�ʼ���ķ���ӿ�)  
    */ 
    private ErplanEmailIService lanemailIs;
    public ErplanEmailIService getLanemailIs() {
        return lanemailIs;
    }
    public void setLanemailIs(ErplanEmailIService lanemailIs) {
        this.lanemailIs = lanemailIs;
    }

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        
        response=ServletActionContext.getResponse();
        request=ServletActionContext.getRequest();
        logger.info(Tag);
        BufferedReader reader = request.getReader();
        StringBuffer buffer = new StringBuffer();
          String string;
          while ((string = reader.readLine()) != null) {
           buffer.append(string);
          }
          reader.close();
          JSONObject obj = JSONObject.fromObject(buffer.toString());
          logger.info(Tag+"��������"+buffer.toString());
          
          username=obj.getString("username");
          messageId=obj.getInt("messageId");
          
          PrintWriter out=response.getWriter();
          //�½�json�����洢��������
          JSONObject result=new JSONObject();
          //�����ʼ����뷽��
          List<ErplanEmail> ls=lanemailIs.findNewEmail(username, messageId);
          if(ls.size()!=0)
          {
          JSONArray jsa=new JSONArray();
          result.put("res", true);
          for(int i=0;i<ls.size();i++)
          {
              jsa.add(ls.get(i)); 
          }
          
          result.put("ls", jsa);
          }
          else
          {
              result.put("res", false);
          }
         
//			  �������ݸ�ʽ
          out.print(URLEncoder.encode(result.toString(),"utf-8"));
          logger.info(Tag+"��������"+result.toString());
          out.close();
         
         
          
    
         
         
          
        

        return null;
    }
}