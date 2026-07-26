package exception_and_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args){
        String fileName = "java-course.text";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the best jave course.");
            writer.flush();
            System.out.println("File Written Succesfuly");
        }catch (IOException exception){
            System.out.printf("Exception occured %s\n",
                    exception.getMessage());
        }
    }
}
