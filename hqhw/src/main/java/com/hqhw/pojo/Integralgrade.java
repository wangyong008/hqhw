package com.hqhw.pojo;

public class Integralgrade {
    private Integer id;

    private Integer one;

    private Integer two;

    private Integer three;

    private Integer fore;

    private Integer five;

    public Integralgrade(Integer id, Integer one, Integer two, Integer three, Integer fore, Integer five) {
		super();
		this.id = id;
		this.one = one;
		this.two = two;
		this.three = three;
		this.fore = fore;
		this.five = five;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getFore() {
        return fore;
    }

    public void setFore(Integer fore) {
        this.fore = fore;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }
}