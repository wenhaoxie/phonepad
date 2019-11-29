package com.antra.phonepad.combination.dao;


import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("Mapper")
public class MapperImpl implements Mapper {
    Map<Character,List<String>> map;
    public MapperImpl() {
        map = new HashMap<>();
        map.put('0',Arrays.asList("a","b"));
        map.put('1',Arrays.asList("c","d","e"));
        map.put('2',Arrays.asList("f", "g"));
        map.put('3',Arrays.asList("h","i"));
        map.put('4',Arrays.asList("j", "k"));
        map.put('5',Arrays.asList("l","m","n"));
        map.put('6',Arrays.asList("p", "q","o"));
        map.put('7',Arrays.asList("s", "t","r"));
        map.put('8',Arrays.asList("v", "w","u"));
        map.put('9',Arrays.asList("x","y","z"));
    }
    @Override
    public List<String> mapper(String num) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(sb,res,num.length(),0, num);
        return res;
    }
    private void dfs(StringBuilder sb, List<String> res, int len, int curIndex, String num){
        if (curIndex >= len){
            res.add(sb.toString());
            return;
        };
        List<String> cur = map.get(num.charAt(curIndex));
        for (int i = 0 ;i < cur.size();i++){
            sb.append(cur.get(i));
            dfs(sb,res,len,curIndex+1,num);
            sb.setLength(Math.max(sb.length() - 1, 0));
        }
    }
}
