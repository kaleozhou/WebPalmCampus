package com.org.palmcampus.pojo;

import java.sql.Timestamp;

/**
 * ErpgongGao entity. @author MyEclipse Persistence Tools
 */

public class ErpgongGao implements java.io.Serializable {

	// Fields

	private Integer id;
	private String titleStr;
	private Timestamp timeStr;
	private String userName;
	private String userBuMen;
	private String fuJian;
	private String contentStr;
	private String typeStr;
	private String chuanYueYiJian;
	private String yiJieShouRen;
	private Boolean isTop;

	// Constructors

	/** default constructor */
	public ErpgongGao() {
	}

	/** full constructor */
	public ErpgongGao(String titleStr, Timestamp timeStr, String userName,
			String userBuMen, String fuJian, String contentStr, String typeStr,
			String chuanYueYiJian, String yiJieShouRen, Boolean isTop) {
		this.titleStr = titleStr;
		this.timeStr = timeStr;
		this.userName = userName;
		this.userBuMen = userBuMen;
		this.fuJian = fuJian;
		this.contentStr = contentStr;
		this.typeStr = typeStr;
		this.chuanYueYiJian = chuanYueYiJian;
		this.yiJieShouRen = yiJieShouRen;
		this.isTop = isTop;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitleStr() {
		return this.titleStr;
	}

	public void setTitleStr(String titleStr) {
		this.titleStr = titleStr;
	}

	public Timestamp getTimeStr() {
		return this.timeStr;
	}

	public void setTimeStr(Timestamp timeStr) {
		this.timeStr = timeStr;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserBuMen() {
		return this.userBuMen;
	}

	public void setUserBuMen(String userBuMen) {
		this.userBuMen = userBuMen;
	}

	public String getFuJian() {
		return this.fuJian;
	}

	public void setFuJian(String fuJian) {
		this.fuJian = fuJian;
	}

	public String getContentStr() {
		return this.contentStr;
	}

	public void setContentStr(String contentStr) {
		this.contentStr = contentStr;
	}

	public String getTypeStr() {
		return this.typeStr;
	}

	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}

	public String getChuanYueYiJian() {
		return this.chuanYueYiJian;
	}

	public void setChuanYueYiJian(String chuanYueYiJian) {
		this.chuanYueYiJian = chuanYueYiJian;
	}

	public String getYiJieShouRen() {
		return this.yiJieShouRen;
	}

	public void setYiJieShouRen(String yiJieShouRen) {
		this.yiJieShouRen = yiJieShouRen;
	}

	public Boolean getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

}