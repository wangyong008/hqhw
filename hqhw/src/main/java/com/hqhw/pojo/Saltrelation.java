package com.hqhw.pojo;

public class Saltrelation {
    private Integer id;

    private Integer aid;

    private Integer sid;

    private Integer aId;

    private Integer sId;

    public Saltrelation(Integer id, Integer aid, Integer sid, Integer aId2, Integer sId2) {
		super();
		this.id = id;
		this.aid = aid;
		this.sid = sid;
		aId = aId2;
		sId = sId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
}