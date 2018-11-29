package com.blueduck.galleryservice.models;

import java.util.List;

public class Gallery {
    private int id;
    private List<Object> images;
    private String port;

    public Gallery() {

    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}