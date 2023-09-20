package PipeFilterApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializationWords{

    //convert the sentence to a unique words list 
    public static List<String> wordsToList(String inpuString){
        List<String> myWordsList = new ArrayList<>();
        String[] words= inpuString.split("[\\s,?!.]+"); //delete the space and other charactors +|\\p{Punct}+
        for(String w : words){
            if(!myWordsList.contains(w)){
                myWordsList.add(w);
               // System.out.println(w);
            }
        }
        //System.out.println(myWordsList);
        return myWordsList;
    }

    public static List<String> sortList(List<String> inputList){
        Collections.sort(inputList);
        System.out.println("MY output words list:"+inputList);
        return inputList;
    }

}