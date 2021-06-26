package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a1=new String[]{"tarp", "mice", "bull"};
        String[] a2=new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(sortArr(a1,a2));

    }
    public static ArrayList<String> sortArr(String[] a1, String[] a2){
        ArrayList<String> newStringAr= new ArrayList<>();
        int numberOfTimesFound = 0;
        /*loop through the first array to check its words*/
        for(String wordInArr1: a1){
            for (int i=0; i<a2.length;i++) {
                /*Check if a word in array two contains a word from array one*/
                if (a2[i].contains(wordInArr1)) {
                    numberOfTimesFound++;

                }
                /*Check if the loop has reach it final value, then finally add the matched word*/
                if(i == a2.length-1 && numberOfTimesFound>0){
                    newStringAr.add(wordInArr1);
                }

            }

        }
        /*The collection method sort, rearranges the word in alphabetical order*/
        Collections.sort(newStringAr);
        return newStringAr;
    }
}
