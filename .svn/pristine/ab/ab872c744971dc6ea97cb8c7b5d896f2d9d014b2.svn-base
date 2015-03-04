package com.org.palmcampus.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.org.palmcampus.dao.ErplanEmailIDAO;
import com.org.palmcampus.pojo.ErplanEmail;

/**
 * A data access object (DAO) providing persistence and search support for
 * ErplanEmail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.org.palmcampus.pojo.ErplanEmail
 * @author MyEclipse Persistence Tools
 */

public class ErplanEmailDAO extends HibernateDaoSupport implements ErplanEmailIDAO{
	private static final Logger log = LoggerFactory
			.getLogger(ErplanEmailDAO.class);
	
	// property constants
	public static final String EMAIL_TITLE = "emailTitle";
	public static final String EMAIL_CONTENT = "emailContent";
	public static final String FU_JIAN = "fuJian";
	public static final String FROM_USER = "fromUser";
	public static final String TO_USER = "toUser";
	public static final String EMAIL_STATE = "emailState";
	public static final String CC = "cc";
	public static final String BCC = "bcc";
	public static final String RECEIPT = "receipt";
	public static final String SEND_TO_LIST = "sendToList";

	protected void initDao() {
		// do nothing
	}

	public void insert(ErplanEmail transientInstance) {
		log.debug("saving ErplanEmail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(ErplanEmail transientInstance) {
		log.debug("saving ErplanEmail instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ErplanEmail persistentInstance) {
		log.debug("deleting ErplanEmail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ErplanEmail findById(java.lang.Integer id) {
		log.debug("getting ErplanEmail instance with id: " + id);
		try {
			ErplanEmail instance = (ErplanEmail) getHibernateTemplate().get(
					"com.org.palmcampus.pojo.ErplanEmail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ErplanEmail instance) {
		log.debug("finding ErplanEmail instance by example");
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
		log.info("finding ErplanEmail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			DetachedCriteria dc = DetachedCriteria.forClass(ErplanEmail.class);
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

	public List findByCc(Object cc) {
		return findByProperty(CC, cc);
	}

	public List findByBcc(Object bcc) {
		return findByProperty(BCC, bcc);
	}

	public List findByReceipt(Object receipt) {
		return findByProperty(RECEIPT, receipt);
	}

	public List findBySendToList(Object sendToList) {
		return findByProperty(SEND_TO_LIST, sendToList);
	}

	public List findAll() {
		log.debug("finding all ErplanEmail instances");
		try {
			String queryString = "from ErplanEmail";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ErplanEmail merge(ErplanEmail detachedInstance) {
		log.debug("merging ErplanEmail instance");
		try {
			ErplanEmail result = (ErplanEmail) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ErplanEmail instance) {
		log.debug("attaching dirty ErplanEmail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ErplanEmail instance) {
		log.debug("attaching clean ErplanEmail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ErplanEmailDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ErplanEmailDAO) ctx.getBean("ErplanEmailDAO");
	}
}