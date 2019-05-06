package com.hqhw.pojo;

import java.util.Date;

public class Notice {
    private Integer id;

    private String name;

    private String content;

    private Date time;

    private Integer belongid;

    private Integer belongId;

    public Notice(Integer id, String name, String content, Date time, Integer belongid, Integer belongId2) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.time = time;
		this.belongid = belongid;
		belongId = belongId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getBelongid() {
        return belongid;
    }

    public void setBelongid(Integer belongid) {
        this.belongid = belongid;
    }

    public Integer getBelongId() {
        return belongId;
    }

    public void setBelongId(Integer belongId) {
        this.belongId = belongId;
    }
}