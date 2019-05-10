package com.hqhw.pojo;

public class Substation {
    private Integer id;

    private String name;

    private String dutie;

    private Integer aid;

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

    public String getDutie() {
        return dutie;
    }

    public void setDutie(String dutie) {
        this.dutie = dutie == null ? null : dutie.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}