package com.entities;

import java.io.Serializable;

/**
 * @author Created  by wxl on 2018/1/31 0031.
 */
public class MenusBean implements Serializable {
    private int id;
    private String name;
    private String url;
    private String permission;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "MenusBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
