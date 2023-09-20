package PipeFilterApplication;

import java.util.ArrayList;
import java.util.List;

public class Words{
    //this is the attribute that belong of the words;
    public String inputFileURL="";
    public String outputFileURL="";
    public String originalString="";
    public List<String> orignalList =new ArrayList<String>();
    public List<String> sortedList =new ArrayList<String>();

    //init this instant with inputURL
    public Words(String inputURL){
        inputFileURL=inputURL;
    }

}