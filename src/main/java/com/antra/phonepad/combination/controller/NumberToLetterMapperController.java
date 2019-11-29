package com.antra.phonepad.combination.controller;

import com.antra.phonepad.combination.service.NumLetterMapperService;
import com.antra.phonepad.combination.vo.PagedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NumberToLetterMapperController {
    @Autowired
    NumLetterMapperService numLetterMapperService;
    @GetMapping("/number/{num}")
    public List<String> getMap( @PathVariable String num){
        List<String> s = numLetterMapperService.Mapper(num, 0, 0, "");

        return s;

    }
    @GetMapping("/test")
    public String hello(){
        return "hello wenhao";
    }
}
