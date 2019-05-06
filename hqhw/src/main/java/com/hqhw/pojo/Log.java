package com.hqhw.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;

public class Log {
    private Integer id;

    private String classname;

    private String error;

    private Date time;

    public Log(String classname, String error, Date time) {
		super();
		this.classname = classname;
		this.error = error;
		this.time = time;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error == null ? null : error.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}