package com.hqhw.pojo;

public class Activitypeopleinfo {
    private Integer id;

    private Integer activityid;

    private String name;

    private Integer age;

    private String relationship;

    private String idcard;

    private String phone;

    private String city;

    private String emergencycontact;

    private String emergencycontactphone;

    private String column11;

    private Integer numberid;

    private String emergencyContact;

    private String emergencyContactPhone;

    private Integer activityId;

    private Integer numberId;

    public Activitypeopleinfo(Integer id, Integer activityid, String name, Integer age, String relationship,
			String idcard, String phone, String city, String emergencycontact, String emergencycontactphone,
			String column11, Integer numberid, String emergencyContact2, String emergencyContactPhone2,
			Integer activityId2, Integer numberId2) {
		super();
		this.id = id;
		this.activityid = activityid;
		this.name = name;
		this.age = age;
		this.relationship = relationship;
		this.idcard = idcard;
		this.phone = phone;
		this.city = city;
		this.emergencycontact = emergencycontact;
		this.emergencycontactphone = emergencycontactphone;
		this.column11 = column11;
		this.numberid = numberid;
		emergencyContact = emergencyContact2;
		emergencyContactPhone = emergencyContactPhone2;
		activityId = activityId2;
		numberId = numberId2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact == null ? null : emergencycontact.trim();
    }

    public String getEmergencycontactphone() {
        return emergencycontactphone;
    }

    public void setEmergencycontactphone(String emergencycontactphone) {
        this.emergencycontactphone = emergencycontactphone == null ? null : emergencycontactphone.trim();
    }

    public String getColumn11() {
        return column11;
    }

    public void setColumn11(String column11) {
        this.column11 = column11 == null ? null : column11.trim();
    }

    public Integer getNumberid() {
        return numberid;
    }

    public void setNumberid(Integer numberid) {
        this.numberid = numberid;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone == null ? null : emergencyContactPhone.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }
}