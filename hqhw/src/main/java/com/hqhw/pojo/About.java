package com.hqhw.pojo;

public class About {
    private Integer id;

    private String name;

    private String seokeyword;

    private String seodescription;

    private Integer viewflag;

    private Integer reorder;

    private String column7;

    private String column8;

    private String seoDescription;

    private String seoKeyWord;

    private Integer viewFlag;

    private String content;

    
    public About(Integer id, String name, String seokeyword, String seodescription, Integer viewflag, Integer reorder,
			String column7, String column8, String seoDescription2, String seoKeyWord2, Integer viewFlag2,
			String content) {
		super();
		this.id = id;
		this.name = name;
		this.seokeyword = seokeyword;
		this.seodescription = seodescription;
		this.viewflag = viewflag;
		this.reorder = reorder;
		this.column7 = column7;
		this.column8 = column8;
		seoDescription = seoDescription2;
		seoKeyWord = seoKeyWord2;
		viewFlag = viewFlag2;
		this.content = content;
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

    public String getSeokeyword() {
        return seokeyword;
    }

    public void setSeokeyword(String seokeyword) {
        this.seokeyword = seokeyword == null ? null : seokeyword.trim();
    }

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription == null ? null : seodescription.trim();
    }

    public Integer getViewflag() {
        return viewflag;
    }

    public void setViewflag(Integer viewflag) {
        this.viewflag = viewflag;
    }

    public Integer getReorder() {
        return reorder;
    }

    public void setReorder(Integer reorder) {
        this.reorder = reorder;
    }

    public String getColumn7() {
        return column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7 == null ? null : column7.trim();
    }

    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8 == null ? null : column8.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public String getSeoKeyWord() {
        return seoKeyWord;
    }

    public void setSeoKeyWord(String seoKeyWord) {
        this.seoKeyWord = seoKeyWord == null ? null : seoKeyWord.trim();
    }

    public Integer getViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}