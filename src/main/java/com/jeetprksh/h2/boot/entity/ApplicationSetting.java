package com.jeetprksh.h2.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userEmail;
    private boolean cachingEnabled;

    ApplicationSetting() {

    }

    public ApplicationSetting(String userEmail, boolean cachingEnabled) {
        this.userEmail = userEmail;
        this.cachingEnabled = cachingEnabled;
    }

    @Override
    public String toString() {
        return "ApplicationSetting{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", cachingEnabled=" + cachingEnabled +
                '}';
    }
}
