package com.hqhw.pojo;

public class Navigationcontent {
    private Integer id;

    private String link;

    private Integer parentid;

    private String picture;

    private Integer sort;

    private Integer parentId;

    public Navigationcontent(Integer id, String link, Integer parentid, String picture, Integer sort,
			Integer parentId2) {
		super();
		this.id = id;
		this.link = link;
		this.parentid = parentid;
		this.picture = picture;
		this.sort = sort;
		parentId = parentId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}