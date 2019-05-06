package com.hqhw.pojo;

public class Aarea {
    private Integer id;

    private String areaname;

    private String areadescribe;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getAreadescribe() {
        return areadescribe;
    }

    public void setAreadescribe(String areadescribe) {
        this.areadescribe = areadescribe == null ? null : areadescribe.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}