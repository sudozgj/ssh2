package org.model;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private Integer id;
	private String authority;
	private String ailas;

	// Constructors

	/** default constructor */
	public Authority() {
	}

	/** minimal constructor */
	public Authority(String authority) {
		this.authority = authority;
	}

	/** full constructor */
	public Authority(String authority, String ailas) {
		this.authority = authority;
		this.ailas = ailas;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getAilas() {
		return this.ailas;
	}

	public void setAilas(String ailas) {
		this.ailas = ailas;
	}

}