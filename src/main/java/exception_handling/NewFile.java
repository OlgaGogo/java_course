package exception_handling;

import java.io.File;
import java.io.IOException;

public class NewFile {

    public static void main(String[] args){

        createNewFile();
        //createNewFileRethrow();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();

        }catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }
}
