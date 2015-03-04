package com.org.palmcampus.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.org.palmcampus.dao.ErpuserIDAO;
import com.org.palmcampus.pojo.Erpuser;

/**
 * A data access object (DAO) providing persistence and search support for
 * Erpuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.org.palmcampus.pojo.Erpuser
 * @author MyEclipse Persistence Tools
 */

public class ErpuserDAO extends HibernateDaoSupport implements ErpuserIDAO{
	private static final Logger log = LoggerFactory.getLogger(ErpuserDAO.class);
	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_PWD = "userPwd";
	public static final String TRUE_NAME = "trueName";
	public static final String SERILS = "serils";
	public static final String DEPARTMENT = "department";
	public static final String JIAO_SE = "jiaoSe";
	public static final String ZHI_WEI = "zhiWei";
	public static final String ZAI_GANG = "zaiGang";
	public static final String EMAIL_STR = "emailStr";
	public static final String IF_LOGIN = "ifLogin";
	public static final String SEX = "sex";
	public static final String BACK_INFO = "backInfo";
	public static final String BIRTH_DAY = "birthDay";
	public static final String MING_ZU = "mingZu";
	public static final String SFZSERILS = "sfzserils";
	public static final String HUN_YING = "hunYing";
	public static final String ZHENG_ZHI_MIAN_MAO = "zhengZhiMianMao";
	public static final String JI_GUAN = "jiGuan";
	public static final String HU_KOU = "huKou";
	public static final String XUE_LI = "xueLi";
	public static final String ZHI_CHENG = "zhiCheng";
	public static final String BI_YE_YUAN_XIAO = "biYeYuanXiao";
	public static final String ZHUAN_YE = "zhuanYe";
	public static final String CAN_JIA_GONG_ZUO_TIME = "canJiaGongZuoTime";
	public static final String JIA_RU_BEN_DAN_WEI_TIME = "jiaRuBenDanWeiTime";
	public static final String JIA_TING_DIAN_HUA = "jiaTingDianHua";
	public static final String JIA_TING_ADDRESS = "jiaTingAddress";
	public static final String GANG_WEI_BIAN_DONG = "gangWeiBianDong";
	public static final String JIAO_YUE_BEI_JING = "jiaoYueBeiJing";
	public static final String GONG_ZUO_JIAN_LI = "gongZuoJianLi";
	public static final String SHE_HUI_GUAN_XI = "sheHuiGuanXi";
	public static final String JIANG_CHENG_JI_LU = "jiangChengJiLu";
	public static final String ZHI_WU_QING_KUANG = "zhiWuQingKuang";
	public static final String PEI_XUN_JI_LU = "peiXunJiLu";
	public static final String DAN_BAO_JI_LU = "danBaoJiLu";
	public static final String NAO_DONG_HE_TONG = "naoDongHeTong";
	public static final String SHE_BAO_JIAO_NA = "sheBaoJiaoNa";
	public static final String TI_JIAN_JI_LU = "tiJianJiLu";
	public static final String BEI_ZHU_STR = "beiZhuStr";
	public static final String FU_JIAN = "fuJian";
	public static final String POP3USER_NAME = "pop3userName";
	public static final String POP3USER_PWD = "pop3userPwd";
	public static final String POP3SERVER = "pop3server";
	public static final String POP3PORT = "pop3port";
	public static final String SMTPUSER_NAME = "smtpuserName";
	public static final String SMTPUSER_PWD = "smtpuserPwd";
	public static final String SMTPSERVER = "smtpserver";
	public static final String SMTPFROM_EMAIL = "smtpfromEmail";
	public static final String TI_XING_TIME = "tiXingTime";
	public static final String IF_TI_XING = "ifTiXing";

	protected void initDao() {
		// do nothing
	}

	public void insert(Erpuser transientInstance) {
		log.debug("saving Erpuser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	


	public void delete(Erpuser persistentInstance) {
		log.debug("deleting Erpuser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public void update(Erpuser transientInstance) {
		log.debug("saving Erpuser instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public Erpuser findById(java.lang.Integer id) {
		log.debug("getting Erpuser instance with id: " + id);
		try {
			Erpuser instance = (Erpuser) getHibernateTemplate().get(
					"com.org.palmcampus.pojo.Erpuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Erpuser instance) {
		log.debug("finding Erpuser instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		
		log.debug("finding Erpuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			
			DetachedCriteria dc = DetachedCriteria.forClass(Erpuser.class);
			dc.add(Restrictions.eq(propertyName, value));
			List ls = this.getHibernateTemplate().findByCriteria(dc);
			if(ls.size()>0)
			{
				log.info("查到"+ls.size()+"条数据");
				return ls;
			}
			else
				return null;
			
		} catch (RuntimeException re) {
			log.info("find by property name failed", re);
			
			throw re;
		}
	}

	public List findByUserName(Object userName) {		
		return findByProperty(USER_NAME, userName);
	}

	public List findByUserPwd(Object userPwd) {
		return findByProperty(USER_PWD, userPwd);
	}

	public List findByTrueName(Object trueName) {
		return findByProperty(TRUE_NAME, trueName);
	}

	public List findBySerils(Object serils) {
		return findByProperty(SERILS, serils);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List findByJiaoSe(Object jiaoSe) {
		return findByProperty(JIAO_SE, jiaoSe);
	}

	public List findByZhiWei(Object zhiWei) {
		return findByProperty(ZHI_WEI, zhiWei);
	}

	public List findByZaiGang(Object zaiGang) {
		return findByProperty(ZAI_GANG, zaiGang);
	}

	public List findByEmailStr(Object emailStr) {
		return findByProperty(EMAIL_STR, emailStr);
	}

	public List findByIfLogin(Object ifLogin) {
		return findByProperty(IF_LOGIN, ifLogin);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByBackInfo(Object backInfo) {
		return findByProperty(BACK_INFO, backInfo);
	}

	public List findByBirthDay(Object birthDay) {
		return findByProperty(BIRTH_DAY, birthDay);
	}

	public List findByMingZu(Object mingZu) {
		return findByProperty(MING_ZU, mingZu);
	}

	public List findBySfzserils(Object sfzserils) {
		return findByProperty(SFZSERILS, sfzserils);
	}

	public List findByHunYing(Object hunYing) {
		return findByProperty(HUN_YING, hunYing);
	}

	public List findByZhengZhiMianMao(Object zhengZhiMianMao) {
		return findByProperty(ZHENG_ZHI_MIAN_MAO, zhengZhiMianMao);
	}

	public List findByJiGuan(Object jiGuan) {
		return findByProperty(JI_GUAN, jiGuan);
	}

	public List findByHuKou(Object huKou) {
		return findByProperty(HU_KOU, huKou);
	}

	public List findByXueLi(Object xueLi) {
		return findByProperty(XUE_LI, xueLi);
	}

	public List findByZhiCheng(Object zhiCheng) {
		return findByProperty(ZHI_CHENG, zhiCheng);
	}

	public List findByBiYeYuanXiao(Object biYeYuanXiao) {
		return findByProperty(BI_YE_YUAN_XIAO, biYeYuanXiao);
	}

	public List findByZhuanYe(Object zhuanYe) {
		return findByProperty(ZHUAN_YE, zhuanYe);
	}

	public List findByCanJiaGongZuoTime(Object canJiaGongZuoTime) {
		return findByProperty(CAN_JIA_GONG_ZUO_TIME, canJiaGongZuoTime);
	}

	public List findByJiaRuBenDanWeiTime(Object jiaRuBenDanWeiTime) {
		return findByProperty(JIA_RU_BEN_DAN_WEI_TIME, jiaRuBenDanWeiTime);
	}

	public List findByJiaTingDianHua(Object jiaTingDianHua) {
		return findByProperty(JIA_TING_DIAN_HUA, jiaTingDianHua);
	}

	public List findByJiaTingAddress(Object jiaTingAddress) {
		return findByProperty(JIA_TING_ADDRESS, jiaTingAddress);
	}

	public List findByGangWeiBianDong(Object gangWeiBianDong) {
		return findByProperty(GANG_WEI_BIAN_DONG, gangWeiBianDong);
	}

	public List findByJiaoYueBeiJing(Object jiaoYueBeiJing) {
		return findByProperty(JIAO_YUE_BEI_JING, jiaoYueBeiJing);
	}

	public List findByGongZuoJianLi(Object gongZuoJianLi) {
		return findByProperty(GONG_ZUO_JIAN_LI, gongZuoJianLi);
	}

	public List findBySheHuiGuanXi(Object sheHuiGuanXi) {
		return findByProperty(SHE_HUI_GUAN_XI, sheHuiGuanXi);
	}

	public List findByJiangChengJiLu(Object jiangChengJiLu) {
		return findByProperty(JIANG_CHENG_JI_LU, jiangChengJiLu);
	}

	public List findByZhiWuQingKuang(Object zhiWuQingKuang) {
		return findByProperty(ZHI_WU_QING_KUANG, zhiWuQingKuang);
	}

	public List findByPeiXunJiLu(Object peiXunJiLu) {
		return findByProperty(PEI_XUN_JI_LU, peiXunJiLu);
	}

	public List findByDanBaoJiLu(Object danBaoJiLu) {
		return findByProperty(DAN_BAO_JI_LU, danBaoJiLu);
	}

	public List findByNaoDongHeTong(Object naoDongHeTong) {
		return findByProperty(NAO_DONG_HE_TONG, naoDongHeTong);
	}

	public List findBySheBaoJiaoNa(Object sheBaoJiaoNa) {
		return findByProperty(SHE_BAO_JIAO_NA, sheBaoJiaoNa);
	}

	public List findByTiJianJiLu(Object tiJianJiLu) {
		return findByProperty(TI_JIAN_JI_LU, tiJianJiLu);
	}

	public List findByBeiZhuStr(Object beiZhuStr) {
		return findByProperty(BEI_ZHU_STR, beiZhuStr);
	}

	public List findByFuJian(Object fuJian) {
		return findByProperty(FU_JIAN, fuJian);
	}

	public List findByPop3userName(Object pop3userName) {
		return findByProperty(POP3USER_NAME, pop3userName);
	}

	public List findByPop3userPwd(Object pop3userPwd) {
		return findByProperty(POP3USER_PWD, pop3userPwd);
	}

	public List findByPop3server(Object pop3server) {
		return findByProperty(POP3SERVER, pop3server);
	}

	public List findByPop3port(Object pop3port) {
		return findByProperty(POP3PORT, pop3port);
	}

	public List findBySmtpuserName(Object smtpuserName) {
		return findByProperty(SMTPUSER_NAME, smtpuserName);
	}

	public List findBySmtpuserPwd(Object smtpuserPwd) {
		return findByProperty(SMTPUSER_PWD, smtpuserPwd);
	}

	public List findBySmtpserver(Object smtpserver) {
		return findByProperty(SMTPSERVER, smtpserver);
	}

	public List findBySmtpfromEmail(Object smtpfromEmail) {
		return findByProperty(SMTPFROM_EMAIL, smtpfromEmail);
	}

	public List findByTiXingTime(Object tiXingTime) {
		return findByProperty(TI_XING_TIME, tiXingTime);
	}

	public List findByIfTiXing(Object ifTiXing) {
		return findByProperty(IF_TI_XING, ifTiXing);
	}

	public List findAll() {
		log.debug("finding all Erpuser instances");
		try {
			String queryString = "from Erpuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Erpuser merge(Erpuser detachedInstance) {
		log.debug("merging Erpuser instance");
		try {
			Erpuser result = (Erpuser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Erpuser instance) {
		log.debug("attaching dirty Erpuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Erpuser instance) {
		log.debug("attaching clean Erpuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ErpuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ErpuserDAO) ctx.getBean("ErpuserDAO");
	}
}