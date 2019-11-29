package com.antra.phonepad.combination.service;

import com.antra.phonepad.combination.dao.Mapper;
import com.antra.phonepad.combination.vo.PagedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ldap.PagedResultsResponseControl;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service("NumLetterMapperService")
public class NumLetterMapperServiceImpl implements NumLetterMapperService{
    @Autowired
    private Mapper mapper;
    @Override
    public List<String> Mapper(String num, Integer pageNo, Integer rows, String orderBy) {
        List<String> res = mapper.mapper(num);
        return res.size() > 50 ? res.subList(0,49) : res;
    }
}
