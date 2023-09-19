package PipeFilterApplication;

public class StartOperation {

    public static String fileNameString="PipeFilterApplication\\pftest.txt";//this is the inputfile path
    public static void main(String[] args) {
        System.out.println("this is the start of this application");
        String currentDirectory = System.getProperty("user.dir");

        //init the instant for operation 
        Words myWords=new Words(currentDirectory+"/"+fileNameString);
        myWords.originalString =WordsIO.readWords(myWords.inputFileURL);
        System.out.println(myWords.originalString);
    }
}
