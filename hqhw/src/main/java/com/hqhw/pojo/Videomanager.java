package com.hqhw.pojo;

import java.util.Date;

public class Videomanager {
    private Integer id;

    private String pictureaddress;

    private String videoaddress;

    private Integer belongsort;

    private String title;

    private String videokeyword;

    private String videodescription;

    private Date addtime;

    private Integer viewflag;

    private Integer belongaccount;

    private String npassreson;

    private String source;

    private Integer vedionumber;

    private Integer vediogood;

    private Integer vediobad;

    private Integer vediokeep;

    private Integer addrflage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress == null ? null : pictureaddress.trim();
    }

    public String getVideoaddress() {
        return videoaddress;
    }

    public void setVideoaddress(String videoaddress) {
        this.videoaddress = videoaddress == null ? null : videoaddress.trim();
    }

    public Integer getBelongsort() {
        return belongsort;
    }

    public void setBelongsort(Integer belongsort) {
        this.belongsort = belongsort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getVideokeyword() {
        return videokeyword;
    }

    public void setVideokeyword(String videokeyword) {
        this.videokeyword = videokeyword == null ? null : videokeyword.trim();
    }

    public String getVideodescription() {
        return videodescription;
    }

    public void setVideodescription(String videodescription) {
        this.videodescription = videodescription == null ? null : videodescription.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getViewflag() {
        return viewflag;
    }

    public void setViewflag(Integer viewflag) {
        this.viewflag = viewflag;
    }

    public Integer getBelongaccount() {
        return belongaccount;
    }

    public void setBelongaccount(Integer belongaccount) {
        this.belongaccount = belongaccount;
    }

    public String getNpassreson() {
        return npassreson;
    }

    public void setNpassreson(String npassreson) {
        this.npassreson = npassreson == null ? null : npassreson.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getVedionumber() {
        return vedionumber;
    }

    public void setVedionumber(Integer vedionumber) {
        this.vedionumber = vedionumber;
    }

    public Integer getVediogood() {
        return vediogood;
    }

    public void setVediogood(Integer vediogood) {
        this.vediogood = vediogood;
    }

    public Integer getVediobad() {
        return vediobad;
    }

    public void setVediobad(Integer vediobad) {
        this.vediobad = vediobad;
    }

    public Integer getVediokeep() {
        return vediokeep;
    }

    public void setVediokeep(Integer vediokeep) {
        this.vediokeep = vediokeep;
    }

    public Integer getAddrflage() {
        return addrflage;
    }

    public void setAddrflage(Integer addrflage) {
        this.addrflage = addrflage;
    }
}