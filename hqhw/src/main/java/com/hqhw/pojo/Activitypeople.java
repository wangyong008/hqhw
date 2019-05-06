package com.hqhw.pojo;

public class Activitypeople {
    private Integer id;

    private Integer activityid;

    private Integer userid;

    private Integer numberid;

    private Integer activityId;

    private Integer numberId;

    private Integer userId;

    public Activitypeople(Integer id, Integer activityid, Integer userid, Integer numberid, Integer activityId2,
			Integer numberId2, Integer userId2) {
		super();
		this.id = id;
		this.activityid = activityid;
		this.userid = userid;
		this.numberid = numberid;
		activityId = activityId2;
		numberId = numberId2;
		userId = userId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNumberid() {
        return numberid;
    }

    public void setNumberid(Integer numberid) {
        this.numberid = numberid;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}