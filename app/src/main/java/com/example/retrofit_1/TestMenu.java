package com.example.retrofit_1;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TestMenu implements Serializable {

    @SerializedName("idKey")
    private String idkey;

    @SerializedName("bio")
    private BioMenu bio;

    public BioMenu getBio() {
        return bio;
    }

    public void setBio(BioMenu bio) {
        this.bio = bio;
    }

    public String getIdkey() {
        return idkey;
    }

    public void setIdkey(String idkey) {
        this.idkey = idkey;
    }
}
