package com.hqhw.pojo;

public class Specialsort {
    private Integer id;

    private String name;

    private String seokeyword;

    private String seodescription;

    private Integer reorder;

    private Integer contributenum;

    public Specialsort(Integer id, String name, String seokeyword, String seodescription, Integer reorder,
			Integer contributenum) {
		super();
		this.id = id;
		this.name = name;
		this.seokeyword = seokeyword;
		this.seodescription = seodescription;
		this.reorder = reorder;
		this.contributenum = contributenum;
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

    public String getSeokeyword() {
        return seokeyword;
    }

    public void setSeokeyword(String seokeyword) {
        this.seokeyword = seokeyword == null ? null : seokeyword.trim();
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