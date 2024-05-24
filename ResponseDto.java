package com.java.training1.dto;

public class ResponseDto<S> {
    private String fromUnit;
    private String toUnit;
    private double originalValue;
    private double convertedValue;

    public ResponseDto(String fromUnit,String toUnit,double originalValue,double convertedValue){
        this.fromUnit=fromUnit;
        this.toUnit=toUnit;
        this.originalValue=originalValue;
        this.convertedValue=convertedValue;

    }
    public String getFromUnit(){
        return fromUnit;
    }
    public void setFromUnit(String fromUnit){
        this.fromUnit=fromUnit;
    }
    public String getToUnit(){
        return toUnit;
    }
    public void setToUnit(String toUnit){
        this.toUnit=toUnit;
    }
    public double getOriginalValue(){
        return originalValue;
    }
    public void setOriginalValue(double originalValue){
        this.originalValue=originalValue;
    }
    public double getConvertedValue(){
        return convertedValue;
    }
    public void setConvertedValue(double convertedValue){
        this.convertedValue=convertedValue;
    }


}
