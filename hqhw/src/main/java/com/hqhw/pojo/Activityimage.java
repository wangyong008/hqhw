package com.hqhw.pojo;

public class Activityimage {
    private Integer id;

    private Integer belongid;

    private Integer viewflage;

    private String specialpic;

    private String description;

    private Integer belongId;

    public Activityimage(Integer id, Integer belongid, Integer viewflage, String specialpic, String description,
			Integer belongId2) {
		super();
		this.id = id;
		this.belongid = belongid;
		this.viewflage = viewflage;
		this.specialpic = specialpic;
		this.description = description;
		belongId = belongId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBelongid() {
        return belongid;
    }

    public void setBelongid(Integer belongid) {
        this.belongid = belongid;
    }

    public Integer getViewflage() {
        return viewflage;
    }

    public void setViewflage(Integer viewflage) {
        this.viewflage = viewflage;
    }

    public String getSpecialpic() {
        return specialpic;
    }

    public void setSpecialpic(String specialpic) {
        this.specialpic = specialpic == null ? null : specialpic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBelongId() {
        return belongId;
    }

    public void setBelongId(Integer belongId) {
        this.belongId = belongId;
    }
}