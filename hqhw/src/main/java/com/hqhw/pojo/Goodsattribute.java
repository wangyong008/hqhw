package com.hqhw.pojo;

public class Goodsattribute {
    private Integer id;

    private Integer belongid;

    private String sort;

    private Integer belongId;

    public Goodsattribute(Integer id, Integer belongid, String sort, Integer belongId2) {
		super();
		this.id = id;
		this.belongid = belongid;
		this.sort = sort;
		belongId = belongId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBelongid() {
        return belongid;
    }

    public void setBelongid(Integer belongid) {
        this.belongid = belongid;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public Integer getBelongId() {
        return belongId;
    }

    public void setBelongId(Integer belongId) {
        this.belongId = belongId;
    }
}