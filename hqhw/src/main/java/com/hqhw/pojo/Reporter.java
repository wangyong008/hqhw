package com.hqhw.pojo;

public class Reporter {
    private Integer id;

    private String name;

    private String idcard;

    private String phone;

    private String email;

    private String area;

    private Integer nid;

    public Reporter(Integer id, String name, String idcard, String phone, String email, String area, Integer nid) {
		super();
		this.id = id;
		this.name = name;
		this.idcard = idcard;
		this.phone = phone;
		this.email = email;
		this.area = area;
		this.nid = nid;
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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}