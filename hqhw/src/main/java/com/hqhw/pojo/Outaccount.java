package com.hqhw.pojo;

public class Outaccount {
    private Integer id;

    private Integer type;

    private String nikename;

    private String odescribe;

    private String headpicture;

    private String state;

    private String banreason;

    private String npassreason;

    private String banReason;

    private String headPicture;

    private String nPassReason;

    private String nikeName;

    public Outaccount(Integer id, Integer type, String nikename, String odescribe, String headpicture, String state,
			String banreason, String npassreason, String banReason2, String headPicture2, String nPassReason2,
			String nikeName2) {
		super();
		this.id = id;
		this.type = type;
		this.nikename = nikename;
		this.odescribe = odescribe;
		this.headpicture = headpicture;
		this.state = state;
		this.banreason = banreason;
		this.npassreason = npassreason;
		banReason = banReason2;
		headPicture = headPicture2;
		nPassReason = nPassReason2;
		nikeName = nikeName2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getOdescribe() {
        return odescribe;
    }

    public void setOdescribe(String odescribe) {
        this.odescribe = odescribe == null ? null : odescribe.trim();
    }

    public String getHeadpicture() {
        return headpicture;
    }

    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture == null ? null : headpicture.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBanreason() {
        return banreason;
    }

    public void setBanreason(String banreason) {
        this.banreason = banreason == null ? null : banreason.trim();
    }

    public String getNpassreason() {
        return npassreason;
    }

    public void setNpassreason(String npassreason) {
        this.npassreason = npassreason == null ? null : npassreason.trim();
    }

    public String getBanReason() {
        return banReason;
    }

    public void setBanReason(String banReason) {
        this.banReason = banReason == null ? null : banReason.trim();
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    public String getnPassReason() {
        return nPassReason;
    }

    public void setnPassReason(String nPassReason) {
        this.nPassReason = nPassReason == null ? null : nPassReason.trim();
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }
}