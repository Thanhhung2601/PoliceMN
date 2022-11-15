package com.example.loginlogout;

import java.io.Serializable;

public class CongAn implements Serializable {
    private String tenCongAn , noiCongTac ,capBac  ;
    private int image ;

    public CongAn(String tenCongAn, String noiCongTac, String capBac, int image) {
        this.tenCongAn = tenCongAn;
        this.noiCongTac = noiCongTac;
        this.capBac = capBac;
        this.image = image;
    }

    public String getTenCongAn() {
        return tenCongAn;
    }

    public void setTenCongAn(String tenCongAn) {
        this.tenCongAn = tenCongAn;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
