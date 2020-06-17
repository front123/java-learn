package model;

public enum Gender{
    MAN("man"),
    WOMAN("woman");

    private String desc;

    Gender(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}