package com.hqhw.pojo;

public class UserInfo {
    private Integer uid;

    private String name;

    private String password;

    private String salt;

    private Byte state;

    private String username;

    public UserInfo(Integer uid, String name, String password, String salt, Byte state, String username) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.state = state;
		this.username = username;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}