package com.org.palmcampus.bll.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.org.palmcampus.bll.ErpgongGaoIService;
import com.org.palmcampus.dao.ErpgongGaoIDAO;
import com.org.palmcampus.pojo.ErpgongGao;
import com.org.palmcampus.pojo.ErplanEmail;
import com.org.palmcampus.pojo.Erpuser;

public class ErpgongGaoService implements ErpgongGaoIService {
	private String Tag="ErpgongGaoService";
	private static Logger logger=Logger.getLogger(ErplanEmailService.class.getName());

	private ErpgongGaoIDAO gonggaoId;
	



	public ErpgongGaoIDAO getGonggaoId() {
		return gonggaoId;
	}



	public void setGonggaoId(ErpgongGaoIDAO gonggaoId) {
		this.gonggaoId = gonggaoId;
	}



	@Override
	public List<ErpgongGao> findAllGongGao() {
		// TODO Auto-generated method stub
		
		return gonggaoId.findAll();
	}

	@Override
	public List<ErpgongGao> findNewGonggao(String username, int gonggaooId) {
		// TODO Auto-generated method stub
		logger.info(Tag+"    Find Start" +gonggaooId);
		
		List<ErpgongGao> ls=gonggaoId.findAll();
		logger.info(Tag+ls.size());
		if(ls.size()!=0)
		{
			if(gonggaooId!=0)
			{
				List ls1=new ArrayList<ErpgongGao>();
				for(ErpgongGao g:ls)
				{
					if(g.getId()>gonggaooId)
					{
					ls1.add(g);
					}
					
				}
				
				return ls1;
			}
			else
			{
				List ls2=new ArrayList<ErpgongGao>(); 
				int j=ls.size()-1;
				for(int i=1;i<=10;i++)
				{
					
					ls2.add(ls.get(j));
					j=j-1;
					
				}
			return ls2;
			}
	
		}
		else
		{
			return ls;
		}

	}



	/* (非 Javadoc) 
	* <p>Title: updateGongGaoLiuYan</p>
	* <p>Description: 添加公告留言</p>
	* @param advice
	* @param newId 
	* @see com.org.palmcampus.bll.ErpgongGaoIService#updateGongGaoLiuYan(java.lang.String, int) 
	*/ 
	
	@Override
	public void updateGongGaoLiuYan(String advice, int newsId) {
		// TODO Auto-generated method stub
		
		ErpgongGao g=gonggaoId.findById(newsId);
		logger.info(Tag+g.getChuanYueYiJian());
		String str=g.getChuanYueYiJian()+"<br>"+advice;
		g.setChuanYueYiJian(str);
		gonggaoId.update(g);
	}



}
