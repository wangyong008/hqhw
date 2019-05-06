package com.hqhw.pojo;

public class Barea {
    private Integer id;

    private String areaname;

    private Integer parentid;

    private String areadescribe;

    private Integer number;

    private String areaDescribe;

    private String areaName;

    private Integer parentId;

    public Barea(Integer id, String areaname, Integer parentid, String areadescribe, Integer number,
			String areaDescribe2, String areaName2, Integer parentId2) {
		super();
		this.id = id;
		this.areaname = areaname;
		this.parentid = parentid;
		this.areadescribe = areadescribe;
		this.number = number;
		areaDescribe = areaDescribe2;
		areaName = areaName2;
		parentId = parentId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAreadescribe() {
        return areadescribe;
    }

    public void setAreadescribe(String areadescribe) {
        this.areadescribe = areadescribe == null ? null : areadescribe.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAreaDescribe() {
        return areaDescribe;
    }

    public void setAreaDescribe(String areaDescribe) {
        this.areaDescribe = areaDescribe == null ? null : areaDescribe.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}