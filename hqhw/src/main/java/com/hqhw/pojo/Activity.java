package com.hqhw.pojo;

import java.util.Date;

public class Activity {
    private Integer id;

    private String name;

    private String arear;

    private Integer viewflag;

    private Integer sortid;

    private String source;

    private Integer uid;

    private Integer clicknum;

    private String image;

    private String seoketwords;

    private String seodescription;

    private String money;

    private Date starttime;

    private Date endtime;

    private String addreass;

    private Date jiezhitime;

    private Integer peoplenummax;

    private String video;

    private String activitytype;

    private String activityType;

    private Integer uId;

    private String content;

    
    public Activity(Integer id, String name, String arear, Integer viewflag, Integer sortid, String source, Integer uid,
			Integer clicknum, String image, String seoketwords, String seodescription, String money, Date starttime,
			Date endtime, String addreass, Date jiezhitime, Integer peoplenummax, String video, String activitytype,
			String activityType2, Integer uId2, String content) {
		super();
		this.id = id;
		this.name = name;
		this.arear = arear;
		this.viewflag = viewflag;
		this.sortid = sortid;
		this.source = source;
		this.uid = uid;
		this.clicknum = clicknum;
		this.image = image;
		this.seoketwords = seoketwords;
		this.seodescription = seodescription;
		this.money = money;
		this.starttime = starttime;
		this.endtime = endtime;
		this.addreass = addreass;
		this.jiezhitime = jiezhitime;
		this.peoplenummax = peoplenummax;
		this.video = video;
		this.activitytype = activitytype;
		activityType = activityType2;
		uId = uId2;
		this.content = content;
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

    public String getArear() {
        return arear;
    }

    public void setArear(String arear) {
        this.arear = arear == null ? null : arear.trim();
    }

    public Integer getViewflag() {
        return viewflag;
    }

    public void setViewflag(Integer viewflag) {
        this.viewflag = viewflag;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getSeoketwords() {
        return seoketwords;
    }

    public void setSeoketwords(String seoketwords) {
        this.seoketwords = seoketwords == null ? null : seoketwords.trim();
    }

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription == null ? null : seodescription.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAddreass() {
        return addreass;
    }

    public void setAddreass(String addreass) {
        this.addreass = addreass == null ? null : addreass.trim();
    }

    public Date getJiezhitime() {
        return jiezhitime;
    }

    public void setJiezhitime(Date jiezhitime) {
        this.jiezhitime = jiezhitime;
    }

    public Integer getPeoplenummax() {
        return peoplenummax;
    }

    public void setPeoplenummax(Integer peoplenummax) {
        this.peoplenummax = peoplenummax;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype == null ? null : activitytype.trim();
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}