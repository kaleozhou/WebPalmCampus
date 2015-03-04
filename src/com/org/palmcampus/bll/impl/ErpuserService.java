package com.org.palmcampus.bll.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import com.org.palmcampus.bll.ErpuserIService;
import com.org.palmcampus.dao.ErpuserIDAO;
import com.org.palmcampus.md5.MD5;
import com.org.palmcampus.pojo.Erpuser;



/** 
* @ClassName: ErpuserService 
* @Description: �û����Ľӿ�ʵ���� 
* @author: kaleo 
* @date 2014-8-13 ����9:52:33 
*  
*/ 
public class ErpuserService implements ErpuserIService {
	private String Tag="ErpuserService";
	private static Logger logger=Logger.getLogger(ErpuserService.class.getName());
	private ErpuserIDAO userId;
	public void setUserId(ErpuserIDAO userId) {
		this.userId = userId;
	}




	/**
	 * @Title: PhoneLogin
	 * @Description: TODO(�ֻ��˵�¼�ӿ�)
	 * @param @param username
	 * @param @param password
	 * @param @return i 0����¼�ɹ� 1����¼�û��������� 2���������   3���Ѿ���¼
	 * @return int    ��������
	 * @throws ��
	 */
	@Override
	public int updateLogin(String username, String password) {
		// TODO Auto-generated method stub
		int i=1;

		List ls=userId.findByTrueName(username);
		if(ls!=null&&ls.size()>=1)
		{
			Erpuser u=(Erpuser)ls.get(0);
			MD5 md5=new MD5();
			
			if(u.getUserPwd().equals(md5.getMD5ofStr(password)))
			{
				if(u.getIfLogin().equals("��"))
				{
				i=0;
				logger.info(username+"��¼�ɹ�");
				}
				else
				{
					i=3;
					
				}	
				//u.setIfLogin("��");
				//userId.update(u);
			}
			else
			{
				i=2;
				logger.info(username+"��¼ʧ�ܣ��������");
			}
			
			
		}
		else
		{
		logger.info(username+"��¼ʧ�ܣ��û���������");
		
		}
		logger.info(i+"������ֵ");
		return i;
		
	}


	
	/* (�� Javadoc) 
	* <p>Title: findByUname</p>
	* <p>Description: </p>
	* @param username
	* @return 
	* @see com.org.palmcampus.bll.ErpuserIService#findByUname(java.lang.String) 
	*/ 
	@Override
	public Erpuser findByTrueName(String username) {
		// TODO Auto-generated method stub
		Erpuser u=null;
		List ls=userId.findByTrueName(username);
		logger.info("��ѯ����"+ls.size());
		if(ls.size()>=1)
		{
			 u=(Erpuser)ls.get(0);
			 logger.info("�ҵ��û�"+username);
			
		}
		else
		{
		logger.info("û���ҵ�"+username);
		}
		return u;
	}




	/* (�� Javadoc) 
	* <p>Title: updateUser</p>
	* <p>Description: </p>
	* @param u
	* @return 
	* @see com.org.palmcampus.bll.ErpuserIService#updateUser(com.org.palmcampus.pojo.Erpuser) 
	*/ 
	
	@Override
	public void updateUser(Erpuser u) {
		// TODO Auto-generated method stub
		userId.update(u);
	}




	/* (�� Javadoc) 
	* <p>Title: findallusername</p>
	* <p>Description: </p>
	* @return 
	* @see com.org.palmcampus.bll.ErpuserIService#findallusername() 
	*/ 
	
	@Override
	public List<Erpuser> findAllUserName() {
		// TODO Auto-generated method stub
		List<Erpuser> ls=userId.findAll();

		
		
		return ls;
	}








}


