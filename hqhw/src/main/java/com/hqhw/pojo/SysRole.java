package com.hqhw.pojo;

public class SysRole {
    private Integer id;

    private Boolean available;

    private String description;

    private String role;

    public SysRole(Integer id, Boolean available, String description, String role) {
		super();
		this.id = id;
		this.available = available;
		this.description = description;
		this.role = role;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}