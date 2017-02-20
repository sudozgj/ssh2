package org.model;

/**
 * Fileupload entity. @author MyEclipse Persistence Tools
 */

public class Fileupload implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String fileurl;
	private Long uploadtime;

	// Constructors

	/** default constructor */
	public Fileupload() {
	}

	/** full constructor */
	public Fileupload(String username, String fileurl, Long uploadtime) {
		this.username = username;
		this.fileurl = fileurl;
		this.uploadtime = uploadtime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFileurl() {
		return this.fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public Long getUploadtime() {
		return this.uploadtime;
	}

	public void setUploadtime(Long uploadtime) {
		this.uploadtime = uploadtime;
	}

}