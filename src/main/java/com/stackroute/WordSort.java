package com.stackroute;
import java.util.*;

public class WordSort
{
        public String[] sortString(String queryString){
            String [] arr = queryString.trim().toLowerCase().split(" ");
            Arrays.sort(arr);
            return arr;
        }

}
