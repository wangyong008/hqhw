package com.hqhw.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Integer type;

    private Date uploadtime;

    private Integer viewflag;

    private Integer stock;

    private String source;

    private String desrciptiong;

    private Double price;

    public Goods(Integer id, String name, Integer type, Date uploadtime, Integer viewflag, Integer stock, String source,
			String desrciptiong, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.uploadtime = uploadtime;
		this.viewflag = viewflag;
		this.stock = stock;
		this.source = source;
		this.desrciptiong = desrciptiong;
		this.price = price;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getViewflag() {
        return viewflag;
    }

    public void setViewflag(Integer viewflag) {
        this.viewflag = viewflag;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getDesrciptiong() {
        return desrciptiong;
    }

    public void setDesrciptiong(String desrciptiong) {
        this.desrciptiong = desrciptiong == null ? null : desrciptiong.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}