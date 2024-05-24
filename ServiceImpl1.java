package com.java.training1.service.impl;

import com.java.training1.constant.ConstantClass;
import com.java.training1.dto.RequestDto;
import com.java.training1.dto.ResponseDto;
import com.java.training1.service.ServiceConversion;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Service
public class ServiceImpl1 implements ServiceConversion {
    private final Map<String,Function<Double,Double>> conversionMap=new HashMap<>();


    public ResponseDto convert(RequestDto request) {
        double convertedValue=0;
        switch (request.getFromUnit().toLowerCase()+"_to_"+request.getToUnit().toLowerCase()){
            case "km_to_miles":
                convertedValue=request.getValue() * ConstantClass.KM_TO_MILES;
                break;

            case "miles_to_km":
                convertedValue= request.getValue()/ConstantClass.KM_TO_MILES;
                break;

            case "celsius_to_fahrenheit":
                convertedValue=(request.getValue()*9/5)+32;
                break;

            case "fahrenheit_to_celsius":
                convertedValue=(request.getValue()-32)*5/9;
                break;


            case "kg_to_pounds":
                convertedValue= request.getValue()*ConstantClass.KG_TO_POUNDS;
                break;

            case "pounds_to_kg":
                convertedValue= request.getValue()/ConstantClass.KG_TO_POUNDS;
                break;

            default:
                throw new IllegalArgumentException("Not supported");
        }


        return new ResponseDto(request.getFromUnit(), request.getToUnit(), request.getValue(), convertedValue);
    }




}
