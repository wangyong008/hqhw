package com.hqhw.pojo;

public class Webinformation {
    private Integer id;

    private String webname;

    private String picture;

    private String topwords;

    private String microblogaddress;

    private String hwlink;

    private String servicephone;

    private String webdescribe;

    private String webbottom;

    private String microBlogAddress;

    private String servicePhone;

    private String topWords;

    private String webBottom;

    private String webDescribe;

    private String webName;

    public Webinformation(Integer id, String webname, String picture, String topwords, String microblogaddress,
			String hwlink, String servicephone, String webdescribe, String webbottom, String microBlogAddress2,
			String servicePhone2, String topWords2, String webBottom2, String webDescribe2, String webName2) {
		super();
		this.id = id;
		this.webname = webname;
		this.picture = picture;
		this.topwords = topwords;
		this.microblogaddress = microblogaddress;
		this.hwlink = hwlink;
		this.servicephone = servicephone;
		this.webdescribe = webdescribe;
		this.webbottom = webbottom;
		microBlogAddress = microBlogAddress2;
		servicePhone = servicePhone2;
		topWords = topWords2;
		webBottom = webBottom2;
		webDescribe = webDescribe2;
		webName = webName2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getTopwords() {
        return topwords;
    }

    public void setTopwords(String topwords) {
        this.topwords = topwords == null ? null : topwords.trim();
    }

    public String getMicroblogaddress() {
        return microblogaddress;
    }

    public void setMicroblogaddress(String microblogaddress) {
        this.microblogaddress = microblogaddress == null ? null : microblogaddress.trim();
    }

    public String getHwlink() {
        return hwlink;
    }

    public void setHwlink(String hwlink) {
        this.hwlink = hwlink == null ? null : hwlink.trim();
    }

    public String getServicephone() {
        return servicephone;
    }

    public void setServicephone(String servicephone) {
        this.servicephone = servicephone == null ? null : servicephone.trim();
    }

    public String getWebdescribe() {
        return webdescribe;
    }

    public void setWebdescribe(String webdescribe) {
        this.webdescribe = webdescribe == null ? null : webdescribe.trim();
    }

    public String getWebbottom() {
        return webbottom;
    }

    public void setWebbottom(String webbottom) {
        this.webbottom = webbottom == null ? null : webbottom.trim();
    }

    public String getMicroBlogAddress() {
        return microBlogAddress;
    }

    public void setMicroBlogAddress(String microBlogAddress) {
        this.microBlogAddress = microBlogAddress == null ? null : microBlogAddress.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getTopWords() {
        return topWords;
    }

    public void setTopWords(String topWords) {
        this.topWords = topWords == null ? null : topWords.trim();
    }

    public String getWebBottom() {
        return webBottom;
    }

    public void setWebBottom(String webBottom) {
        this.webBottom = webBottom == null ? null : webBottom.trim();
    }

    public String getWebDescribe() {
        return webDescribe;
    }

    public void setWebDescribe(String webDescribe) {
        this.webDescribe = webDescribe == null ? null : webDescribe.trim();
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName == null ? null : webName.trim();
    }
}