package com.org.palmcampus.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;

import com.org.palmcampus.dao.impl.ErpgongGaoDAO;
import com.org.palmcampus.pojo.ErpgongGao;


/** 
* @ClassName: ErpgongGaoIDAO 
* @Description:  公告DAO的借口
* @author: kaleo 
* @date 2014-8-12 上午9:33:14 
*  
*/ 
public interface ErpgongGaoIDAO {
	

	/** 
	* @Title: insert 
	* @Description: TODO(增加一条公告) 
	* @param @param transientInstance    设定文件
	* @return void    返回类型
	* @throws 无
	*/ 
	public void insert(ErpgongGao transientInstance);

	/**
	 * @Title: delete
	 * @Description: TODO(删除一条公告)
	 * @param @param persistentInstance  一条公告实例
	 * @return void    返回类型
	 * @throws 无
	 */
	public void delete(ErpgongGao persistentInstance);
	/** 
	* @Title: update 
	* @Description: TODO(修改) 
	* @param @param persistentInstance    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void update(ErpgongGao persistentInstance);
	/**
	 * @Title: findById
	 * @Description: TODO(根据id查找公告)
	 * @param @param id	公告id
	 * @param @return    一条公告实例
	 * @return ErpgongGao    返回类型
	 * @throws 无
	 */
	public ErpgongGao findById(java.lang.Integer id);
	/**
	 * @Title: findByTitleStr
	 * @Description: TODO(根据标题查找公告)
	 * @param @param titleStr 标题
	 * @param @return    返回公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByTitleStr(Object titleStr);
	/**
	 * @Title: findByUserName
	 * @Description: TODO(根据发公告的人查询)
	 * @param @param userName 发公告的人名
	 * @param @return    返回公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByUserName(Object userName) ;
	/**
	 * @Title: findByUserBuMen
	 * @Description: TODO(发公告人所属部门查找)
	 * @param @param userBuMen
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByUserBuMen(Object userBuMen) ;
	/**
	 * @Title: findByFuJian
	 * @Description: TODO(根据附件查询)
	 * @param @param fuJian	附件地址
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFuJian(Object fuJian) ;
	/**
	 * @Title: findByContentStr
	 * @Description: TODO(根据内容查询)
	 * @param @param contentStr 内容
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByContentStr(Object contentStr) ;
	/**
	 * @Title: findByTypeStr
	 * @Description: TODO(根据公共类型查询)
	 * @param @param typeStr 公告类型
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByTypeStr(Object typeStr) ;
	/**
	 * @Title: findByChuanYueYiJian
	 * @Description: TODO(根据评论查询)
	 * @param @param chuanYueYiJian 评论
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByChuanYueYiJian(Object chuanYueYiJian) ;
	/**
	 * @Title: findByYiJieShouRen
	 * @Description: TODO(根据已接受人查询)
	 * @param @param yiJieShouRen
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByYiJieShouRen(Object yiJieShouRen) ;
	/**
	 * @Title: findByIsTop
	 * @Description: TODO(根据是否置顶查询)
	 * @param @param isTop
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByIsTop(Object isTop) ;
	/**
	 * @Title: findAll
	 * @Description: TODO(查询所有)
	 * @param @return    公告
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findAll() ;

	
}
