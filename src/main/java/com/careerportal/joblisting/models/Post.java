package com.careerportal.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String exp;
    private String desc;
    private String techs[];

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", exp='" + exp + '\'' +
                ", desc='" + desc + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public Post(String profile, String exp, String desc, String[] techs) {
        this.profile = profile;
        this.exp = exp;
        this.desc = desc;
        this.techs = techs;
    }
}
