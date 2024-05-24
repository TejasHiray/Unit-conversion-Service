package com.java.training1.controller;



import com.java.training1.dto.RequestDto;
import com.java.training1.dto.ResponseDto;
import com.java.training1.service.ServiceConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/conversion")

public class Controller {
    @Autowired
    private ServiceConversion serviceConversion;

    @GetMapping
    public ResponseDto convert(
            @RequestParam String fromUnit,
            @RequestParam String toUnit,
            @RequestParam double value){

        RequestDto requestDto=new RequestDto();
        requestDto.setFromUnit(fromUnit);
        requestDto.setToUnit(toUnit);
        requestDto.setValue(value);


        return ServiceConversion.convert(requestDto);

    }

}
