package com.hqhw.pojo;

public class Tests {
    private Integer id;

    private String name;


    
    public Tests(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
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
}