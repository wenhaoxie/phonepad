package com.antra.phonepad.combination.service;

import com.antra.phonepad.combination.vo.PagedResponse;

import java.util.List;

public interface NumLetterMapperService {
    public List<String> Mapper(String num, Integer pageNo, Integer rows, String orderBy);
}
