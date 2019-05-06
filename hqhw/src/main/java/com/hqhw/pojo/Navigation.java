package com.hqhw.pojo;

public class Navigation {
    private Integer id;

    private String navigationname;

    private String navigationName;

    public Navigation(Integer id, String navigationname, String navigationName2) {
		super();
		this.id = id;
		this.navigationname = navigationname;
		navigationName = navigationName2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavigationname() {
        return navigationname;
    }

    public void setNavigationname(String navigationname) {
        this.navigationname = navigationname == null ? null : navigationname.trim();
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName == null ? null : navigationName.trim();
    }
}