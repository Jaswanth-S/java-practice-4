package com.stackroute;

public class ReplaceCharacter {
    public String replaceString(String queryString)
    {
        queryString = queryString.replaceAll("[L|l]","t");
        return queryString.replaceAll("[D|d]", "f");
    }
}
