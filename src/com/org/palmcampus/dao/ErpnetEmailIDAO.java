package com.org.palmcampus.dao;

import java.util.List;

import com.org.palmcampus.pojo.ErpnetEmail;


/**    
 *     
 * <p>项目名称：WebPalmCampus<P>    
 * <p>类名称：ErpnetEmailIDAO<p>    
 * <p>类描述：    <p>
 * <p>创建人：kaleozhou<p>  
 * <p>创建时间：2014-8-11 下午5:21:58<p>    
 * <p>修改人：kaleozhou<p>    
 * <p>修改时间：2014-8-11 下午5:21:58<p>    
 * <p>修改备注：<p>    
 * <p>@version<p>     
 *     
 */ 
public interface ErpnetEmailIDAO {
	/**
	 * @Title: findAll
	 * @Description: TODO(查询发件箱所有邮件)
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findAll();


	/**
	 * @函数功能说明
	 * @kaleozhou  2014-8-11
	 * @修改者名字 修改日期
	 * @修改内容
	 * @参数： @param transientInstance    
	 * @return void   
	 * @throws 无
	 */
	public void save(ErpnetEmail transientInstance);
	/**
	 * @Title: delete
	 * @Description: TODO(删除一条发件箱邮件)
	 * @param    发件箱邮件
	 * @return void    返回类型
	 * @throws 无
	 */
	public void delete(ErpnetEmail persistentInstance) ;
	/**
	 * @Title: findById
	 * @Description: TODO(根据ID查询发件箱邮件)
	 * @param @param id
	 * @param @return    发件箱邮件
	 * @return ErpnetEmail    返回类型
	 * @throws 无
	 */
	public ErpnetEmail findById(java.lang.Integer id);


	/**
	 * @Title: findByEmailTitle
	 * @Description: TODO(根据邮件主题查询发件箱邮件)
	 * @param @param emailTitle
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailTitle(Object emailTitle);
	/**
	 * @Title: findByEmailContent
	 * @Description: TODO(根据邮件内容查询发件箱邮件)
	 * @param @param emailContent
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailContent(Object emailContent);
	/**
	 * @Title: findByFuJian
	 * @Description: TODO(根据附件查询发件箱邮件)
	 * @param @param fuJian
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFuJian(Object fuJian);
	/**
	 * @Title: findByFromUser
	 * @Description: TODO(根据邮件发件人查询发件箱邮件)
	 * @param @param fromUser
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFromUser(Object fromUser);
	/**
	 * @Title: findByToUser
	 * @Description: TODO(根据邮件收件人查询发件箱邮件)
	 * @param @param toUser
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByToUser(Object toUser);
	/**
	 * @Title: findByEmailState
	 * @Description: TODO(根据邮件是否发送查询发件箱邮件)
	 * @param @param emailState
	 * @param @return    发件箱邮件
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailState(Object emailState);

	
	

}
