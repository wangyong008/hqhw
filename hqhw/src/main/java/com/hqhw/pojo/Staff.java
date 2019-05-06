package com.hqhw.pojo;

public class Staff {
    private Integer id;

    private String number;

    private String name;

    private String sex;

    private String age;

    private String department;

    private String position;

    private String education;

    private String phone;

    private String region;

    private String address;

    private String supervisephone;

    private Integer belongid;

    private String photo;

    private Integer viewflag;

    private String remark;

    public Staff(Integer id, String number, String name, String sex, String age, String department, String position,
			String education, String phone, String region, String address, String supervisephone, Integer belongid,
			String photo, Integer viewflag, String remark) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.department = department;
		this.position = position;
		this.education = education;
		this.phone = phone;
		this.region = region;
		this.address = address;
		this.supervisephone = supervisephone;
		this.belongid = belongid;
		this.photo = photo;
		this.viewflag = viewflag;
		this.remark = remark;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSupervisephone() {
        return supervisephone;
    }

    public void setSupervisephone(String supervisephone) {
        this.supervisephone = supervisephone == null ? null : supervisephone.trim();
    }

    public Integer getBelongid() {
        return belongid;
    }

    public void setBelongid(Integer belongid) {
        this.belongid = belongid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getViewflag() {
        return viewflag;
    }

    public void setViewflag(Integer viewflag) {
        this.viewflag = viewflag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}