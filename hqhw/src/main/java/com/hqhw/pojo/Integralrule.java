package com.hqhw.pojo;

public class Integralrule {
    private Integer id;

    private Integer register;

    private Integer invite;

    private Integer contribute;

    private Integer identity;

    private Integer email;

    public Integralrule(Integer id, Integer register, Integer invite, Integer contribute, Integer identity,
			Integer email) {
		super();
		this.id = id;
		this.register = register;
		this.invite = invite;
		this.contribute = contribute;
		this.identity = identity;
		this.email = email;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }

    public Integer getInvite() {
        return invite;
    }

    public void setInvite(Integer invite) {
        this.invite = invite;
    }

    public Integer getContribute() {
        return contribute;
    }

    public void setContribute(Integer contribute) {
        this.contribute = contribute;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }
}