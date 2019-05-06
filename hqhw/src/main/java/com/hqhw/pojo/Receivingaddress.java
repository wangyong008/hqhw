package com.hqhw.pojo;

public class Receivingaddress {
    private Integer id;

    private Integer userid;

    private String phone;

    private String address;

    private Integer state;

    private String column4;

    private Integer userId;

    public Receivingaddress(Integer id, Integer userid, String phone, String address, Integer state, String column4,
			Integer userId2) {
		super();
		this.id = id;
		this.userid = userid;
		this.phone = phone;
		this.address = address;
		this.state = state;
		this.column4 = column4;
		userId = userId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4 == null ? null : column4.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}