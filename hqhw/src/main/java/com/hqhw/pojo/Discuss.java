package com.hqhw.pojo;

import java.util.Date;

public class Discuss {
    private Integer id;

    private Integer uid;

    private Integer outid;

    private Integer belongnews;

    private Integer vid;

    private Integer activityid;

    private String visitorname;

    private String content;

    private Date time;

    private String visitorName;

    private Integer activityId;

    private Integer outId;

    private Integer uId;

    private Integer vId;

    public Discuss(Integer id, Integer uid, Integer outid, Integer belongnews, Integer vid, Integer activityid,
			String visitorname, String content, Date time, String visitorName2, Integer activityId2, Integer outId2,
			Integer uId2, Integer vId2) {
		super();
		this.id = id;
		this.uid = uid;
		this.outid = outid;
		this.belongnews = belongnews;
		this.vid = vid;
		this.activityid = activityid;
		this.visitorname = visitorname;
		this.content = content;
		this.time = time;
		visitorName = visitorName2;
		activityId = activityId2;
		outId = outId2;
		uId = uId2;
		vId = vId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Integer getBelongnews() {
        return belongnews;
    }

    public void setBelongnews(Integer belongnews) {
        this.belongnews = belongnews;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname == null ? null : visitorname.trim();
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

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName == null ? null : visitorName.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }
}