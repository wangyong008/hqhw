package com.hqhw.pojo;

public class Ncarea {
    private Integer id;

    private String areaname;

    private Integer parentid;

    private String areaName;

    private Integer parentId;

    public Ncarea(Integer id, String areaname, Integer parentid, String areaName2, Integer parentId2) {
		super();
		this.id = id;
		this.areaname = areaname;
		this.parentid = parentid;
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