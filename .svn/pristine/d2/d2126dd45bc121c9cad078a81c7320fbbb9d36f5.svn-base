package com.org.palmcampus.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.org.palmcampus.dao.ErpnetEmailIDAO;
import com.org.palmcampus.pojo.ErpnetEmail;
import com.org.palmcampus.pojo.Erpuser;

/**
 * A data access object (DAO) providing persistence and search support for
 * ErpnetEmail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.org.palmcampus.pojo.ErpnetEmail
 * @author MyEclipse Persistence Tools
 */

public class ErpnetEmailDAO extends HibernateDaoSupport implements  ErpnetEmailIDAO{
	private static final Logger log = LoggerFactory
			.getLogger(ErpnetEmailDAO.class);
	// property constants
	public static final String EMAIL_TITLE = "emailTitle";
	public static final String EMAIL_CONTENT = "emailContent";
	public static final String FU_JIAN = "fuJian";
	public static final String FROM_USER = "fromUser";
	public static final String TO_USER = "toUser";
	public static final String EMAIL_STATE = "emailState";

	protected void initDao() {
		// do nothing
	}

	public void save(ErpnetEmail transientInstance) {
		log.debug("saving ErpnetEmail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ErpnetEmail persistentInstance) {
		log.debug("deleting ErpnetEmail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ErpnetEmail findById(java.lang.Integer id) {
		log.debug("getting ErpnetEmail instance with id: " + id);
		try {
			ErpnetEmail instance = (ErpnetEmail) getHibernateTemplate().get(
					"com.org.palmcampus.pojo.ErpnetEmail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ErpnetEmail instance) {
		log.debug("finding ErpnetEmail instance by example");
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
		log.debug("finding ErpnetEmail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			DetachedCriteria dc = DetachedCriteria.forClass(ErpnetEmail.class);
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

	public List findByEmailTitle(Object emailTitle) {
		return findByProperty(EMAIL_TITLE, emailTitle);
	}

	public List findByEmailContent(Object emailContent) {
		return findByProperty(EMAIL_CONTENT, emailContent);
	}

	public List findByFuJian(Object fuJian) {
		return findByProperty(FU_JIAN, fuJian);
	}

	public List findByFromUser(Object fromUser) {
		return findByProperty(FROM_USER, fromUser);
	}

	public List findByToUser(Object toUser) {
		return findByProperty(TO_USER, toUser);
	}

	public List findByEmailState(Object emailState) {
		return findByProperty(EMAIL_STATE, emailState);
	}

	public List findAll() {
		log.debug("finding all ErpnetEmail instances");
		try {
			String queryString = "from ErpnetEmail";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ErpnetEmail merge(ErpnetEmail detachedInstance) {
		log.debug("merging ErpnetEmail instance");
		try {
			ErpnetEmail result = (ErpnetEmail) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ErpnetEmail instance) {
		log.debug("attaching dirty ErpnetEmail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ErpnetEmail instance) {
		log.debug("attaching clean ErpnetEmail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ErpnetEmailDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ErpnetEmailDAO) ctx.getBean("ErpnetEmailDAO");
	}
}