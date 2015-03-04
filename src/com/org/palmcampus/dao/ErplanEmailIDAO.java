package com.org.palmcampus.dao;

import java.util.List;

import com.org.palmcampus.pojo.ErplanEmail;

public interface ErplanEmailIDAO {


	/** 
	* @Title: insert 
	* @Description: TODO(添加一条邮件) 
	* @param @param transientInstance    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void insert(ErplanEmail transientInstance);
	/**
	 * @Title: delete
	 * @Description: TODO(删除收件箱邮件)
	 * @param @param persistentInstance    收件箱邮件
	 * @return void    返回类型
	 * @throws 无
	 */
	/** 
	* @Title: update 
	* @Description: TODO(修该一条邮件) 
	* @param @param transientInstance    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void update(ErplanEmail transientInstance);
	public void delete(ErplanEmail persistentInstance);
	/**
	 * @Title: findById
	 * @Description: TODO(根据ID查询收件箱邮件)
	 * @param @param id
	 * @param @return    收件箱邮件
	 * @return ErplanEmail    返回类型
	 * @throws 无
	 */
	public ErplanEmail findById(java.lang.Integer id);
	/**
	 * @Title: findByEmailTitle
	 * @Description: TODO(根据邮件标题查询收件箱邮件)
	 * @param @param emailTitle
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailTitle(Object emailTitle);
	/**
	 * @Title: findByEmailContent
	 * @Description: TODO(根据邮件内容查询收件箱邮件)
	 * @param @param emailContent
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailContent(Object emailContent);
	/**
	 * @Title: findByFuJian
	 * @Description: TODO(根据附件查询收件箱邮件)
	 * @param @param fuJian
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFuJian(Object fuJian);
	/**
	 * @Title: findByFromUser
	 * @Description: TODO(根据发件人查询收件箱邮件)
	 * @param @param fromUser
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFromUser(Object fromUser);
	/**
	 * @Title: findByToUser
	 * @Description: TODO(根据收件人查询收件箱邮件)
	 * @param @param toUser
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByToUser(Object toUser) ;
	/**
	 * @Title: findByEmailState
	 * @Description: TODO(根据邮件是否阅读查询收件箱邮件)
	 * @param @param emailState
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailState(Object emailState);
	/**
	 * @Title: findByCc
	 * @Description: TODO(根据查询收件箱邮件)
	 * @param @param cc
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */

	public List findByBcc(Object bcc);
	/**
	 * @Title: findByReceipt
	 * @Description: TODO(根据查询收件箱邮件)
	 * @param @param receipt
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByReceipt(Object receipt);
	/**
	 * @Title: findBySendToList
	 * @Description: TODO(根据查询收件箱邮件)
	 * @param @param sendToList
	 * @param @return    收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySendToList(Object sendToList);
	/**
	 * @Title: findAll
	 * @Description: TODO(查询收件箱所有邮件)
	 * @param @return     收件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findAll();
	
	
	
}
