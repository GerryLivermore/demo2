package com.domian;

import javax.persistence.*;

/**
 * Created by Administrator on 2019\9\4 0004.
 */

@Entity
@Table(name="tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String brithday;
    private String sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getBrithday() {
        return brithday;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", brithday='" + brithday + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
