package com.example.m821;

public class Concert {

    public String lloc;
    public String data;
    public String sitio;

    public Concert(String lloc, String data, String sitio) {
        this.lloc = lloc;
        this.data = data;
        this.sitio = sitio;
    }

    public String getLloc() {
        return lloc;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }
}
