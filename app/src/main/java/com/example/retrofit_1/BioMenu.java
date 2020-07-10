package com.example.retrofit_1;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BioMenu implements Serializable {

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
