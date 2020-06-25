package ru.mts;

public class AndyClass {
    private String value = "initValue";

    public AndyClass() {
    }

    public AndyClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value.equals("")){
            throw new NullPointerException();
        }
        this.value = value;
    }
}
