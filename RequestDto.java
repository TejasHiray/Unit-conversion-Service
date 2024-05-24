package com.java.training1.dto;

public class RequestDto {
    private String fromUnit;
    private String toUnit;
    private double value;

    public String getFromUnit(){
        return fromUnit;

    }
    public void setFromUnit(String fromUnit){
        this.fromUnit=fromUnit;

    }
    public String getToUnit(){

        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;

    }
    public double getValue(){
        return value;
    }

    public void setValue(double value) {

        this.value = value;
    }
}
