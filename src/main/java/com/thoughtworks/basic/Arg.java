package com.thoughtworks.basic;

public class Arg {
    private String flag;
    private String value;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return "flag:" + flag + " " + "value:" + value + ";";
    }
}
