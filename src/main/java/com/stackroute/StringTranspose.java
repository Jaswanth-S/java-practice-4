package com.stackroute;

public class StringTranspose {
    public String transpose(String queryString){
        String transposeString = "";
        String [] reverse = queryString.toLowerCase().split(" ");
        for (String sub:reverse) {
            StringBuilder temp= new StringBuilder(sub);
            transposeString += temp.reverse()+" ";
        }
        return transposeString.trim() ;
    }
}
