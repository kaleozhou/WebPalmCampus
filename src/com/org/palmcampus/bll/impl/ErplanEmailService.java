package com.org.palmcampus.bll.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.org.palmcampus.action.PhoneLogin;
import com.org.palmcampus.bll.ErplanEmailIService;
import com.org.palmcampus.dao.ErplanEmailIDAO;
import com.org.palmcampus.pojo.ErplanEmail;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;




public class ErplanEmailService implements ErplanEmailIService {
	private String Tag="ErplanEmailService";
	private static Logger logger=Logger.getLogger(ErplanEmailService.class.getName());
	private ErplanEmailIDAO lanemailId;



	@Override
	public List<?> findAllLanEmail() {
		// TODO Auto-generated method stub
		return lanemailId.findAll();
	}



	public ErplanEmailIDAO getLanemailId() {
		return lanemailId;
	}



	public void setLanemailId(ErplanEmailIDAO lanemailId) {
		this.lanemailId = lanemailId;
	}



	
	@Override
	public void addLanemail(ErplanEmail lanemail) {
		// TODO Auto-generated method stub
		Date d=new Date();
		Timestamp timeStr=new Timestamp(d.getTime());
		lanemail.setTimeStr(timeStr);
		lanemail.setEmailState("未读");
		lanemailId.insert(lanemail);
	}



	/* (非 Javadoc) 
	* <p>Title: findNewEmail</p>
	* <p>Description: </p>
	* @param username
	* @param messageId
	* @return 
	* @see com.org.palmcampus.bll.ErplanEmailIService#findNewEmail(java.lang.String, int) 
	*/ 
	
	@Override
	public List<ErplanEmail> findNewEmail(String username, int messageId) {
		// TODO Auto-generated method stub
		logger.info(Tag+"    Find Start");
		
		List<ErplanEmail> ls=lanemailId.findByToUser(username);
		if(ls.size()!=0)
		{
			if(messageId!=0)
			{
				List ls1=new ArrayList<ErplanEmail>();
				for(ErplanEmail u:ls)
				{
					if(u.getId()>messageId)
					{
					ls1.add(u);
					}
					
				}
				logger.info(Tag+"返回数值"+ls1.size()+messageId);
				return ls1;
			}
			else
			{
			
		
			return ls;
			}
		}
		else
		{
			return ls;
		}
	}
 
}



