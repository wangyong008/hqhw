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

    private Date addTime;

    private String nPassReson;

    private String pictureAddress;

    private Integer vedioBad;

    private Integer vedioGood;

    private Integer vedioKeep;

    private Integer vedioNumber;

    private String videoAddress;

    private String videoDescription;

    private String videoKeyWord;

    private Integer viewFlag;

    private Integer belongAccount;

    private Integer belongSort;

    public Videomanager(Integer id, String pictureaddress, String videoaddress, Integer belongsort, String title,
			String videokeyword, String videodescription, Date addtime, Integer viewflag, Integer belongaccount,
			String npassreson, String source, Integer vedionumber, Integer vediogood, Integer vediobad,
			Integer vediokeep, Date addTime2, String nPassReson2, String pictureAddress2, Integer vedioBad2,
			Integer vedioGood2, Integer vedioKeep2, Integer vedioNumber2, String videoAddress2,
			String videoDescription2, String videoKeyWord2, Integer viewFlag2, Integer belongAccount2,
			Integer belongSort2) {
		super();
		this.id = id;
		this.pictureaddress = pictureaddress;
		this.videoaddress = videoaddress;
		this.belongsort = belongsort;
		this.title = title;
		this.videokeyword = videokeyword;
		this.videodescription = videodescription;
		this.addtime = addtime;
		this.viewflag = viewflag;
		this.belongaccount = belongaccount;
		this.npassreson = npassreson;
		this.source = source;
		this.vedionumber = vedionumber;
		this.vediogood = vediogood;
		this.vediobad = vediobad;
		this.vediokeep = vediokeep;
		addTime = addTime2;
		nPassReson = nPassReson2;
		pictureAddress = pictureAddress2;
		vedioBad = vedioBad2;
		vedioGood = vedioGood2;
		vedioKeep = vedioKeep2;
		vedioNumber = vedioNumber2;
		videoAddress = videoAddress2;
		videoDescription = videoDescription2;
		videoKeyWord = videoKeyWord2;
		viewFlag = viewFlag2;
		belongAccount = belongAccount2;
		belongSort = belongSort2;
	}

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getnPassReson() {
        return nPassReson;
    }

    public void setnPassReson(String nPassReson) {
        this.nPassReson = nPassReson == null ? null : nPassReson.trim();
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress == null ? null : pictureAddress.trim();
    }

    public Integer getVedioBad() {
        return vedioBad;
    }

    public void setVedioBad(Integer vedioBad) {
        this.vedioBad = vedioBad;
    }

    public Integer getVedioGood() {
        return vedioGood;
    }

    public void setVedioGood(Integer vedioGood) {
        this.vedioGood = vedioGood;
    }

    public Integer getVedioKeep() {
        return vedioKeep;
    }

    public void setVedioKeep(Integer vedioKeep) {
        this.vedioKeep = vedioKeep;
    }

    public Integer getVedioNumber() {
        return vedioNumber;
    }

    public void setVedioNumber(Integer vedioNumber) {
        this.vedioNumber = vedioNumber;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress == null ? null : videoAddress.trim();
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription == null ? null : videoDescription.trim();
    }

    public String getVideoKeyWord() {
        return videoKeyWord;
    }

    public void setVideoKeyWord(String videoKeyWord) {
        this.videoKeyWord = videoKeyWord == null ? null : videoKeyWord.trim();
    }

    public Integer getViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
    }

    public Integer getBelongAccount() {
        return belongAccount;
    }

    public void setBelongAccount(Integer belongAccount) {
        this.belongAccount = belongAccount;
    }

    public Integer getBelongSort() {
        return belongSort;
    }

    public void setBelongSort(Integer belongSort) {
        this.belongSort = belongSort;
    }
}