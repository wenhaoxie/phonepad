package com.antra.phonepad.combination.dao;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository("WordSet")
public class WordSetImpl implements WordSet {
    Set<String> wordsSet;
    public WordSetImpl() throws IOException
    {
        Path path = Paths.get("src/main/resources/words.txt");
        byte[] readBytes = Files.readAllBytes(path);
        String wordListContents = new String(readBytes, StandardCharsets.UTF_8);
        String[] words = wordListContents.split("\n");
        wordsSet = new HashSet<>();
        Collections.addAll(wordsSet, words);
    }
    @Override
    public boolean isValidWord(String word) {
        return wordsSet.contains(word);
    }
}
