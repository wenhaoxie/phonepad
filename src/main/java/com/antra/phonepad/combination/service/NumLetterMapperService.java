package com.antra.phonepad.combination.service;



import java.util.List;

public interface NumLetterMapperService {
     List<String> Mapper(String num, Integer pageNo, Integer rows, String orderBy);
}
