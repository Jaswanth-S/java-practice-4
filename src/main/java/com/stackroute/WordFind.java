package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFind
{
    public boolean findWord(String queryString)
    {
        Pattern pattern = Pattern.compile("[H|h]arry");
        Matcher m = pattern.matcher(queryString);
        if(m.find()){
            return true;
        }
        else
            return false;
    }
}
