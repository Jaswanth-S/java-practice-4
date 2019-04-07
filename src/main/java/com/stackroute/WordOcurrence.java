package com.stackroute;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOcurrence {
    public String [] wordCount(String message,String regex){
        List<String> count = new ArrayList<>();
        if(message.contains(regex)){
            Pattern pattern = Pattern.compile("\\b" + regex + "*");
            Matcher m = pattern.matcher(message);
            while (m.find()) {
                count.add(m.start() + "-" + m.end());
            }
            return count.toArray(new String[count.size()]);
        }
        else
            return null;
    }
}
