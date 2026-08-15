package College;
import java.io.*;
import java.io.IOException;

public class MultilevelDucking {
    static void readFile()throws IOException{
        FileReader fr=new FileReader("file.txt");
        System.out.println("File Opened Successfully");
    }
    static void processFile()throws IOException{
        readFile();
    }
    static void handleFile()throws IOException{
        processFile();
    }

    public static void main(String[] args) {
        try{
            handleFile();
        }
        catch (IOException e){
            System.out.println("Exception Caught:"+e.getMessage());
        }
        finally {
            System.out.println("Code Executed Successfully");
        }
    }


}
