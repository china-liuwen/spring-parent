package com.entity;

public class UserinfoEntity {
    private Integer id;
    private String sys_username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSys_username() {
        return sys_username;
    }

    public void setSys_username(String sys_username) {
        this.sys_username = sys_username;
    }

    @Override
    public String toString() {
        return "UserinfoEntity{" +
                "id=" + id +
                ", sys_username='" + sys_username + '\'' +
                '}';
    }
}
