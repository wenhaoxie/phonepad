package com.antra.phonepad.combination.service;

import com.antra.phonepad.combination.dao.Mapper;
import com.antra.phonepad.combination.dao.WordSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.stream.Collectors;



@Service("NumLetterMapperService")
public class NumLetterMapperServiceImpl implements NumLetterMapperService{
    @Autowired
    private Mapper mapper;
    @Autowired
    private WordSet wordSet;
    @Override
    public List<String> Mapper(String num, Integer pageNo, Integer rows, String orderBy) {
        List<String> raw = mapper.mapper(num);
        List<String>  res = raw.stream().filter(i->(wordSet.isValidWord(i.substring(0,3)) || wordSet.isValidWord(i.substring(3,6)) ) || wordSet.isValidWord(i.substring(6,10)) ).map(e->e.substring(0,3) +"-"+e.substring(3,6)+"-"+e.substring(6)).collect(Collectors.toList());
        return res.size() > 10 ? res.subList(0,10) : res;
    }
}
