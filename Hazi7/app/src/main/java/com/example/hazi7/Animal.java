package com.example.hazi7;

public class Animal {
    private String name;
    private String info;
    private int kep;

    public Animal(String name, String info, int kep){
        this.name = name;
        this.info = info;
        this.kep = kep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getKep() {
        return kep;
    }

    public void setKep(int kep) {
        this.kep = kep;
    }
}
