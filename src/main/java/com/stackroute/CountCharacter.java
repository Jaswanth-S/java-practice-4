package com.stackroute;
public  class CountCharacter
{
    public int countCharacter(String queryString,String character){
        if(queryString.contains(character)) {
            String[] count = queryString.split("("+character+"|"+character.toUpperCase()+")",-2);
            return (count.length-1);
        }
        else
            return 0;
    }
}