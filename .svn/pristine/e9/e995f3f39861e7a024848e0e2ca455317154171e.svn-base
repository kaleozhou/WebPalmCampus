package com.org.palmcampus.bll;

import java.util.List;

import com.org.palmcampus.pojo.ErpgongGao;
import com.org.palmcampus.pojo.ErplanEmail;

public interface ErplanEmailIService {
	public List findAllLanEmail();
	/** 
	* @Title: insertLanemail 
	* @Description: TODO(添加一条邮件) 
	* @param @param lanemail    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void addLanemail(ErplanEmail lanemail);
	
	/** 
	* @Title: findNewEmail 
	* @Description: TODO(查询收件箱的制定用户的新邮件) 
	* @param @param username	用户名
	* @param @param messageId	接受过的邮件最大ID
	* @param @return    设定文件
	* @return List<ErplanEmail>    返回类型
	* @throws 
	*/ 
	public List<ErplanEmail> findNewEmail(String username,int messageId);
}
