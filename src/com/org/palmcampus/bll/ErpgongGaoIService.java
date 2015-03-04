package com.org.palmcampus.bll;

import java.util.List;

import com.org.palmcampus.pojo.ErpgongGao;
import com.org.palmcampus.pojo.Erpuser;

/**   
 *    
 * 项目名称：WebPalmCampus   
 * 类名称：ErpgongGaoIService   
 * 类描述：   公告的业务逻辑类
 * 创建人：kaleo   
 * 创建时间：2014-8-8 下午5:07:25   
 * 修改人：kaleo   
 * 修改时间：2014-8-8 下午5:07:25   
 * 修改备注：   
 * @version    
 *    
 */
public interface ErpgongGaoIService {
	
	/** 
	* @Title: findAllGongGao 
	* @Description: TODO(查找所有公告) 
	* @param @return    设定文件
	* @return List<ErpgongGao>    返回类型
	* @throws 
	*/ 
	public List<ErpgongGao> findAllGongGao();
	/** 
	* @Title: findNewGonggao 
	* @Description: TODO(根据用户名和已存公告id查找新的公告) 
	* @param @param username
	* @param @param gonggaoId
	* @param @return    设定文件
	* @return List<ErpgongGao>    返回类型
	* @throws 
	*/ 
	public List<ErpgongGao> findNewGonggao(String username, int gonggaoId);
	/** 
	* @Title: updateGongGaoLiuYan 
	* @Description: TODO(添加公告留言) 
	* @param @param advice
	* @param @param newId    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void updateGongGaoLiuYan(String advice,int newsId);
	
}
