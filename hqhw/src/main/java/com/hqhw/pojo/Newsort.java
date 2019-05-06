package com.hqhw.pojo;

public class Newsort {
    private Integer id;

    private String name;

    private String seodescription;

    private Integer reorder;

    private Integer contributenum;

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

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription == null ? null : seodescription.trim();
    }

    public Integer getReorder() {
        return reorder;
    }

    public void setReorder(Integer reorder) {
        this.reorder = reorder;
    }

    public Integer getContributenum() {
        return contributenum;
    }

    public void setContributenum(Integer contributenum) {
        this.contributenum = contributenum;
    }
}