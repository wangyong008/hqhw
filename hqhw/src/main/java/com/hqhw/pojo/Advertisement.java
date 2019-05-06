package com.hqhw.pojo;

import java.util.Date;

public class Advertisement {
    private Integer id;

    private String name;

    private String image;

    private String link;

    private String addre;

    private String content;

    private String video;

    private String description;

    private Date starttime;

    private Date endtime;

    private Integer isuse;

    private Integer isUse;

    public Advertisement(Integer id, String name, String image, String link, String addre, String content, String video,
			String description, Date starttime, Date endtime, Integer isuse, Integer isUse2) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.link = link;
		this.addre = addre;
		this.content = content;
		this.video = video;
		this.description = description;
		this.starttime = starttime;
		this.endtime = endtime;
		this.isuse = isuse;
		isUse = isUse2;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getAddre() {
        return addre;
    }

    public void setAddre(String addre) {
        this.addre = addre == null ? null : addre.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }
}