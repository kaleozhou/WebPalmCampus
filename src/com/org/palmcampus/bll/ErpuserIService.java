package com.org.palmcampus.bll;

import java.util.List;

import com.org.palmcampus.pojo.ErpgongGao;
import com.org.palmcampus.pojo.Erpuser;

public interface ErpuserIService {
	/**
	 * @Title: PhoneLogin
	 * @Description: TODO(手机端登录接口)
	 * @param @param username
	 * @param @param password
	 * @param @return i 0、登录成功 1、登录用户名不存在 2、密码错误    3、已经登录，不允许重复登录
	 * @return int    返回类型
	 * @throws 无
	 */
	public int updateLogin(String username,String password);
	/** 
	* @Title: findByUname 
	* @Description: TODO(根据用户名差找用户) 
	* @param @param username
	* @param @return    用户
	* @return Erpuser    返回类型
	* @throws 无
	*/ 
	public Erpuser findByTrueName(String userName);
	/** 
	* @Title: updateUser 
	* @Description: TODO(修改用户表) 
	* @param @return    设定文件
	* @return Erpuser    返回类型
	* @throws 
	*/ 
	public void updateUser(Erpuser u);
	/** 
	* @Title: findallusername 
	* @Description: TODO(查找所有联系人姓名) 
	* @param @return    设定文件
	* @return List    返回类型
	* @throws 
	*/ 
	public List<Erpuser> findAllUserName();
	

}

