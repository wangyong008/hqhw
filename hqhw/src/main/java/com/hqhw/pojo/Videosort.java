package com.hqhw.pojo;

public class Videosort {
    private Integer id;

    private String videosortname;

    private Integer vedionumber;

    private Integer vedioposition;

    private String columns;

    private String column5;

    private Integer vedioNumber;

    private Integer vedioPosition;

    private String videoSortName;

    public Videosort(Integer id, String videosortname, Integer vedionumber, Integer vedioposition, String columns,
			String column5, Integer vedioNumber2, Integer vedioPosition2, String videoSortName2) {
		super();
		this.id = id;
		this.videosortname = videosortname;
		this.vedionumber = vedionumber;
		this.vedioposition = vedioposition;
		this.columns = columns;
		this.column5 = column5;
		vedioNumber = vedioNumber2;
		vedioPosition = vedioPosition2;
		videoSortName = videoSortName2;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideosortname() {
        return videosortname;
    }

    public void setVideosortname(String videosortname) {
        this.videosortname = videosortname == null ? null : videosortname.trim();
    }

    public Integer getVedionumber() {
        return vedionumber;
    }

    public void setVedionumber(Integer vedionumber) {
        this.vedionumber = vedionumber;
    }

    public Integer getVedioposition() {
        return vedioposition;
    }

    public void setVedioposition(Integer vedioposition) {
        this.vedioposition = vedioposition;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns == null ? null : columns.trim();
    }

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5 == null ? null : column5.trim();
    }

    public Integer getVedioNumber() {
        return vedioNumber;
    }

    public void setVedioNumber(Integer vedioNumber) {
        this.vedioNumber = vedioNumber;
    }

    public Integer getVedioPosition() {
        return vedioPosition;
    }

    public void setVedioPosition(Integer vedioPosition) {
        this.vedioPosition = vedioPosition;
    }

    public String getVideoSortName() {
        return videoSortName;
    }

    public void setVideoSortName(String videoSortName) {
        this.videoSortName = videoSortName == null ? null : videoSortName.trim();
    }
}