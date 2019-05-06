package com.hqhw.pojo;

public class Activitynumber {
    private Integer id;

    private String numbersort;

    private String numberSort;

    public Activitynumber(Integer id, String numbersort, String numberSort2) {
		super();
		this.id = id;
		this.numbersort = numbersort;
		numberSort = numberSort2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumbersort() {
        return numbersort;
    }

    public void setNumbersort(String numbersort) {
        this.numbersort = numbersort == null ? null : numbersort.trim();
    }

    public String getNumberSort() {
        return numberSort;
    }

    public void setNumberSort(String numberSort) {
        this.numberSort = numberSort == null ? null : numberSort.trim();
    }
}