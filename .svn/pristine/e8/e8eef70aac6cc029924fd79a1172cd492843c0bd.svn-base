package com.org.palmcampus.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.org.palmcampus.dao.ErpgongGaoIDAO;
import com.org.palmcampus.pojo.ErpgongGao;

/**
 * A data access object (DAO) providing persistence and search support for
 * ErpgongGao entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.org.palmcampus.pojo.ErpgongGao
 * @author MyEclipse Persistence Tools
 */

public class ErpgongGaoDAO extends HibernateDaoSupport implements ErpgongGaoIDAO  {
	private static final Logger log = LoggerFactory
			.getLogger(ErpgongGaoDAO.class);
	// property constants
	public static final String TITLE_STR = "titleStr";
	public static final String USER_NAME = "userName";
	public static final String USER_BU_MEN = "userBuMen";
	public static final String FU_JIAN = "fuJian";
	public static final String CONTENT_STR = "contentStr";
	public static final String TYPE_STR = "typeStr";
	public static final String CHUAN_YUE_YI_JIAN = "chuanYueYiJian";
	public static final String YI_JIE_SHOU_REN = "yiJieShouRen";
	public static final String IS_TOP = "isTop";

	protected void initDao() {
		// do nothing
	}

	public void insert(ErpgongGao transientInstance) {
		log.debug("saving ErpgongGao instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	

	public void delete(ErpgongGao persistentInstance) {
		log.debug("deleting ErpgongGao instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public void update(ErpgongGao transientInstance) {
		log.debug("update ErpgongGao instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public ErpgongGao findById(java.lang.Integer id) {
		log.debug("getting ErpgongGao instance with id: " + id);
		try {
			ErpgongGao instance = (ErpgongGao) getHibernateTemplate().get(
					"com.org.palmcampus.pojo.ErpgongGao", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ErpgongGao instance) {
		log.debug("finding ErpgongGao instance by example");
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
		log.debug("finding ErpgongGao instance with property: " + propertyName
				+ ", value: " + value);
		try {
			DetachedCriteria dc = DetachedCriteria.forClass(ErpgongGao.class);
			dc.add(Restrictions.eq(propertyName, value));
			List ls = this.getHibernateTemplate().findByCriteria(dc);
			if(ls.size()>0)
			{
				return ls;
			}
			else
				return null;
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitleStr(Object titleStr) {
		return findByProperty(TITLE_STR, titleStr);
	}

	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List findByUserBuMen(Object userBuMen) {
		return findByProperty(USER_BU_MEN, userBuMen);
	}

	public List findByFuJian(Object fuJian) {
		return findByProperty(FU_JIAN, fuJian);
	}

	public List findByContentStr(Object contentStr) {
		return findByProperty(CONTENT_STR, contentStr);
	}

	public List findByTypeStr(Object typeStr) {
		return findByProperty(TYPE_STR, typeStr);
	}

	public List findByChuanYueYiJian(Object chuanYueYiJian) {
		return findByProperty(CHUAN_YUE_YI_JIAN, chuanYueYiJian);
	}

	public List findByYiJieShouRen(Object yiJieShouRen) {
		return findByProperty(YI_JIE_SHOU_REN, yiJieShouRen);
	}

	public List findByIsTop(Object isTop) {
		return findByProperty(IS_TOP, isTop);
	}

	public List findAll() {
		log.debug("finding all ErpgongGao instances");
		try {
			String queryString = "from ErpgongGao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ErpgongGao merge(ErpgongGao detachedInstance) {
		log.debug("merging ErpgongGao instance");
		try {
			ErpgongGao result = (ErpgongGao) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ErpgongGao instance) {
		log.debug("attaching dirty ErpgongGao instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ErpgongGao instance) {
		log.debug("attaching clean ErpgongGao instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ErpgongGaoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ErpgongGaoDAO) ctx.getBean("ErpgongGaoDAO");
	}
}