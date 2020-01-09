package com.example.demo1.ui.main.classinfo;

public class Thongtin {
    String tenTP;
    String infoTP;
    String nhietDo;
    String doAm;
    String knm;

    public Thongtin(String tenTP, String infoTP, String nhietDo, String doAm, String knm) {
        this.tenTP = tenTP;
        this.infoTP = infoTP;
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        this.knm = knm;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public String getInfoTP() {
        return infoTP;
    }

    public void setInfoTP(String infoTP) {
        this.infoTP = infoTP;
    }

    public String getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(String nhietDo) {
        this.nhietDo = nhietDo;
    }

    public String getDoAm() {
        return doAm;
    }

    public void setDoAm(String doAm) {
        this.doAm = doAm;
    }

    public String getKnm() {
        return knm;
    }

    public void setKnm(String knm) {
        this.knm = knm;
    }
}
