package org.model;

/**
 * RoleAuthority entity. @author MyEclipse Persistence Tools
 */

public class RoleAuthority implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer roleid;
	private Integer authority;

	// Constructors

	/** default constructor */
	public RoleAuthority() {
	}

	/** full constructor */
	public RoleAuthority(Integer roleid, Integer authority) {
		this.roleid = roleid;
		this.authority = authority;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getAuthority() {
		return this.authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

}