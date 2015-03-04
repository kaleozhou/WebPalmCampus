package com.org.palmcampus.dao;

import java.util.List;

import com.org.palmcampus.pojo.Erpuser;

public interface ErpuserIDAO {
	
	
	/**
	 * @Title: findAll
	 * @Description: TODO(查询所有用户)
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findAll() ;


	/** 
	* @Title: insert 
	* @Description: TODO(添加用户) 
	* @param @param transientInstance    设定文件
	* @return void    返回类型
	* @throws 
	*/ 
	public void insert(Erpuser transientInstance);


	/**
	 * @Title: delete
	 * @Description: TODO(删除一个用户)
	 * @param @param persistentInstance    用户
	 * @return void    返回类型
	 * @throws 无
	 */ 
	public void delete(Erpuser persistentInstance);
	/**
	 * @Title: findById
	 * @Description: TODO(根据Id查询用户)
	 * @param @param id
	 * @param @return    用户
	 * @return Erpuser    返回类型
	 * @throws 无
	 */
	public void update(Erpuser persistentInstance);
	public Erpuser findById(java.lang.Integer id);
	/**
	 * @Title: findByUserName
	 * @Description: TODO(根据用户名查询用户)
	 * @param @param userName
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByUserName(Object userName);
	public List findByUserPwd(Object userPwd);
	/**
	 * @Title: findByTrueName
	 * @Description: TODO(根据真实姓名查询用户)
	 * @param @param trueName
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByTrueName(Object trueName) ;
	/**
	 * @Title: findBySerils
	 * @Description: TODO(根据编号查询用户)
	 * @param @param serils
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySerils(Object serils);
	/**
	 * @Title: findByDepartment
	 * @Description: TODO(根据部门查询用户)
	 * @param @param department
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByDepartment(Object department);
	/**
	 * @Title: findByJiaoSe
	 * @Description: TODO(根据角色查询用户)
	 * @param @param jiaoSe
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiaoSe(Object jiaoSe);
	/**
	 * @Title: findByZhiWei
	 * @Description: TODO(根据职位查询用户)
	 * @param @param zhiWei
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZhiWei(Object zhiWei);
	/**
	 * @Title: findByZaiGang
	 * @Description: TODO(根据是否在岗查询用户)
	 * @param @param zaiGang
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZaiGang(Object zaiGang);
	/**
	 * @Title: findByEmailStr
	 * @Description: TODO(根据用邮箱账号查询用户)
	 * @param @param emailStr
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByEmailStr(Object emailStr);
	/**
	 * @Title: findByIfLogin
	 * @Description: TODO(根据是否登录查询用户)
	 * @param @param ifLogin
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByIfLogin(Object ifLogin);
	/**
	 * @Title: findBySex
	 * @Description: TODO(根据用性别查询用户)
	 * @param @param sex
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySex(Object sex);
	/**
	 * @Title: findByBackInfo
	 * @Description: TODO(根据背景信息查询用户)
	 * @param @param backInfo
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws  无
	 */
	public List findByBackInfo(Object backInfo);
	/**
	 * @Title: findByBirthDay
	 * @Description: TODO(根据生日查询用户)
	 * @param @param birthDay
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByBirthDay(Object birthDay);
	/**
	 * @Title: findByMingZu
	 * @Description: TODO(根据名族查询用户)
	 * @param @param mingZu
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByMingZu(Object mingZu);
	/**
	 * @Title: findBySfzserils
	 * @Description: TODO(根据全球唯一号查询用户)
	 * @param @param sfzserils
	 * @param @return    用户
	 * @return List     返回类型
	 * @throws 无
	 */
	public List findBySfzserils(Object sfzserils) ;
	/**
	 * @Title: findByHunYing
	 * @Description: TODO(根据婚姻状态查询用户)
	 * @param @param hunYing
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByHunYing(Object hunYing) ;
	/**
	 * @Title: findByZhengZhiMianMao
	 * @Description: TODO(根据政治面貌查询用户)
	 * @param @param zhengZhiMianMao
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZhengZhiMianMao(Object zhengZhiMianMao);
	/**
	 * @Title: findByJiGuan
	 * @Description: TODO(根据籍贯查询用户)
	 * @param @param jiGuan
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiGuan(Object jiGuan);
	/**
	 * @Title: findByHuKou
	 * @Description: TODO(根据户口查询用户)
	 * @param @param huKou
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByHuKou(Object huKou);
	/**
	 * @Title: findByXueLi
	 * @Description: TODO(根据用学历查询用户)
	 * @param @param xueLi
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByXueLi(Object xueLi);
	/**
	 * @Title: findByZhiCheng
	 * @Description: TODO(根据职称查询用户)
	 * @param @param zhiCheng
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZhiCheng(Object zhiCheng) ;
	/**
	 * @Title: findByBiYeYuanXiao
	 * @Description: TODO(根据毕业学校查询用户)
	 * @param @param biYeYuanXiao
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByBiYeYuanXiao(Object biYeYuanXiao);
	/**
	 * @Title: findByZhuanYe
	 * @Description: TODO(根据专业查询用户)
	 * @param @param zhuanYe
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZhuanYe(Object zhuanYe);
	/**
	 * @Title: findByCanJiaGongZuoTime
	 * @Description: TODO(根据参加工作时间查询用户)
	 * @param @param canJiaGongZuoTime
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByCanJiaGongZuoTime(Object canJiaGongZuoTime) ;
	/**
	 * @Title: findByJiaRuBenDanWeiTime
	 * @Description: TODO(根据加入本单位时间查询用户)
	 * @param @param jiaRuBenDanWeiTime
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiaRuBenDanWeiTime(Object jiaRuBenDanWeiTime);
	/**
	 * @Title: findByJiaTingDianHua
	 * @Description: TODO(根据家庭电话查询用户)
	 * @param @param jiaTingDianHua
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiaTingDianHua(Object jiaTingDianHua);
	/**
	 * @Title: findByJiaTingAddress
	 * @Description: TODO(根据家庭地址查询用户)
	 * @param @param jiaTingAddress
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiaTingAddress(Object jiaTingAddress);
	/**
	 * @Title: findByGangWeiBianDong
	 * @Description: TODO(根据岗位变动查询用户)
	 * @param @param gangWeiBianDong
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByGangWeiBianDong(Object gangWeiBianDong);
	/**
	 * @Title: findByJiaoYueBeiJing
	 * @Description: TODO(根据用户名查询用户)
	 * @param @param jiaoYueBeiJing
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiaoYueBeiJing(Object jiaoYueBeiJing);
	/**
	 * @Title: findByGongZuoJianLi
	 * @Description: TODO(根据工作简历查询用户)
	 * @param @param gongZuoJianLi
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByGongZuoJianLi(Object gongZuoJianLi);
	/**
	 * @Title: findBySheHuiGuanXi
	 * @Description: TODO(根据社会关系查询用户)
	 * @param @param sheHuiGuanXi
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySheHuiGuanXi(Object sheHuiGuanXi);
	/**
	 * @Title: findByJiangChengJiLu
	 * @Description: TODO(根据奖惩情况查询用户)
	 * @param @param jiangChengJiLu
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByJiangChengJiLu(Object jiangChengJiLu) ;
	/**
	 * @Title: findByZhiWuQingKuang
	 * @Description: TODO(根据职务情况查询用户)
	 * @param @param zhiWuQingKuang
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByZhiWuQingKuang(Object zhiWuQingKuang);
	/**
	 * @Title: findByPeiXunJiLu
	 * @Description: TODO(根据培训记录查询用户)
	 * @param @param peiXunJiLu
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByPeiXunJiLu(Object peiXunJiLu);
	/**
	 * @Title: findByDanBaoJiLu
	 * @Description: TODO(根据担保记录查询用户)
	 * @param @param danBaoJiLu
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByDanBaoJiLu(Object danBaoJiLu);
	/**
	 * @Title: findByNaoDongHeTong
	 * @Description: TODO(根据劳动合同查询用户)
	 * @param @param naoDongHeTong
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByNaoDongHeTong(Object naoDongHeTong);
	/**
	 * @Title: findBySheBaoJiaoNa
	 * @Description: TODO(根据社保缴纳查询用户)
	 * @param @param sheBaoJiaoNa
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySheBaoJiaoNa(Object sheBaoJiaoNa) ;
	/** 
	 * @Title: findByTiJianJiLu
	 * @Description: TODO(根据体检记录查询用户)
	 * @param @param tiJianJiLu
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByTiJianJiLu(Object tiJianJiLu);
	/**
	 * @Title: findByBeiZhuStr
	 * @Description: TODO(根据备注查询用户)
	 * @param @param beiZhuStr
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByBeiZhuStr(Object beiZhuStr) ;
	/**
	 * @Title: findByFuJian
	 * @Description: TODO(根据附件查询用户)
	 * @param @param fuJian
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByFuJian(Object fuJian);
	/**
	 * @Title: findByPop3userName
	 * @Description: TODO(根据pop3用户名查询用户)
	 * @param @param pop3userName
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByPop3userName(Object pop3userName);
	/**
	 * @Title: findByPop3userPwd
	 * @Description: TODO(根据pop3密码查询用户)
	 * @param @param pop3userPwd
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByPop3userPwd(Object pop3userPwd);
	/**
	 * @Title: findByPop3server
	 * @Description: TODO(根据用户名查询用户)
	 * @param @param pop3server
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByPop3server(Object pop3server);
	/**
	 * @Title: findByPop3port
	 * @Description: TODO(根据端口查询用户)
	 * @param @param pop3port
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByPop3port(Object pop3port);
	/**
	 * @Title: findBySmtpuserName
	 * @Description: TODO(根据smt用户名查询用户)
	 * @param @param smtpuserName
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySmtpuserName(Object smtpuserName);
	/**
	 * @Title: findBySmtpuserPwd
	 * @Description: TODO(根据smt密码查询用户)
	 * @param @param smtpuserPwd
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySmtpuserPwd(Object smtpuserPwd);
	/**
	 * @Title: findBySmtpserver
	 * @Description: TODO(根据smt服务器查询用户)
	 * @param @param smtpserver
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySmtpserver(Object smtpserver);
	/**
	 * @Title: findBySmtpfromEmail
	 * @Description: TODO(根据用smt邮件查询用户)
	 * @param @param smtpfromEmail
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findBySmtpfromEmail(Object smtpfromEmail);
	/**
	 * @Title: findByTiXingTime
	 * @Description: TODO(根据提醒时间查询用户)
	 * @param @param tiXingTime
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByTiXingTime(Object tiXingTime);
	/**
	 * @Title: findByIfTiXing
	 * @Description: TODO(根据是否 提醒查询用户)
	 * @param @param ifTiXing
	 * @param @return    用户
	 * @return List    返回类型
	 * @throws 无
	 */
	public List findByIfTiXing(Object ifTiXing);

	
	
	
	

}
