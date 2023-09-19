package PipeFilterApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Words{
    //this is the attribute that belong of the words;
    public String inputFileURL="";
    public String outputFileURL="";
    public String originalString="";
    public List<String> orignalList =new ArrayList<String>();

    //init this instant with inputURL
    public Words(String inputURL){
        inputFileURL=inputURL;
    }

    //read the file to a string
    public String fileToString(){

        return originalString;
    }

    //convert the file to List<String>
    public List<String> oringalToList(String inpuString){

        //
        return orignalList;
    }


    public HashMap<String,Integer> uniqueWordsMap(List<String> originalList){
        HashMap<String,Integer> returnMap= new HashMap<>();

        return returnMap;

    }

    public List<String> sortWords(List<String> wordList){
        List<String> sortedWordsList=new ArrayList<>();
        return sortedWordsList;
    }

    public boolean writeSortedWrods(List<String> sortedWordsList){
        return true;
    }
}