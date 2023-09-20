package PipeFilterApplication;

public class StartOperation {

    public static String fileNameString="PipeFilterApplication\\pftest.txt";//this is the inputfile path
    public static void main(String[] args) {
        System.out.println("Start operation");
        String currentDirectory = System.getProperty("user.dir");

        //init the instant for operation 
        Words myWords=new Words(currentDirectory+"/"+fileNameString);
        myWords.originalString =WordsIO.readWords(myWords.inputFileURL);  // get the sentence string


        myWords.orignalList=SerializationWords.wordsToList(myWords.originalString); //get the list of the words in the sentence;
        myWords.sortedList=SerializationWords.sortList(myWords.orignalList); //get the sorted list of the words;

        WordsIO.writeWords(myWords.sortedList, currentDirectory); // write the file in the output.txt
    }
}
