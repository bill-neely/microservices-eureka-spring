package com.blueduck.imageservice.models;

public class Image {
    private long id;
    private String title;
    private String url;
    private String port;


    public Image(long id, String title, String url, String port) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}