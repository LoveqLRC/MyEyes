package com.example.liaoruochen.myeyes.net.bean;

public class Categories {


    /**
     * id : 24
     * name : 时尚
     * description : 优雅地行走在潮流尖端
     * bgPicture : http://img.kaiyanapp.com/03bd4fa7429614df5a936f42c09e1275.png?imageMogr2/quality/60/format/jpg
     * headerImage : http://img.kaiyanapp.com/c9b19c2f0a2a40f4c45564dd8ea766d3.png
     * defaultAuthorId : 2160
     */

    private int id;
    private String name;
    private String description;
    private String bgPicture;
    private String headerImage;
    private int defaultAuthorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBgPicture() {
        return bgPicture;
    }

    public void setBgPicture(String bgPicture) {
        this.bgPicture = bgPicture;
    }



    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public int getDefaultAuthorId() {
        return defaultAuthorId;
    }

    public void setDefaultAuthorId(int defaultAuthorId) {
        this.defaultAuthorId = defaultAuthorId;
    }
}
