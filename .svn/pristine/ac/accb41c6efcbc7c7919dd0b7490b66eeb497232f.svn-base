/**  
* @Title: ReceiveGonggao.java 
* @Package com.org.palmcampus.action 
* @Description: TODO 
* @author kaleo  
* @date 2014-8-30 下午3:35:56 
* @version V1.0  
*/ 

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
import com.org.palmcampus.pojo.ErpgongGao;

/** 
 * @ClassName: ReceiveGonggao 
 * @Description:  
 * @author: kaleo 
 * @date 2014-8-30 下午3:35:56 
 *  
 */

public class ReceiveGonggao extends ActionSupport {
    private static Logger logger=Logger.getLogger(ReceiveEmail.class.getName());
    private static String Tag="ReceiveGonggao";
    private ErpgongGaoIService gonggaoIs;
    public ErpgongGaoIService getGonggaoIs() {
		return gonggaoIs;
	}

	public void setGonggaoIs(ErpgongGaoIService gonggaoIs) {
		this.gonggaoIs = gonggaoIs;
	}

	private String username;
    private int id;
    private HttpServletRequest request;
    private HttpServletResponse response;

	@Override
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
        
          username=obj.getString("username");
          id=obj.getInt("id");
          logger.info(Tag+"用户名"+username+"id"+id);
          PrintWriter out=response.getWriter();
          //新建json用来存储返回数据
          JSONObject result=new JSONObject();
          //调用邮件插入方法
          List<ErpgongGao> ls=gonggaoIs.findNewGonggao(username, id);
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
//		  设置数据格式
          out.print(URLEncoder.encode(result.toString(),"utf-8"));
          logger.info(Tag+"返回数据"+result.toString());
          out.close();
		
		return super.execute();
	}


}
