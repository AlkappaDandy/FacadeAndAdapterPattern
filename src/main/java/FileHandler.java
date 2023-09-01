
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileHandler {
    
      public static String readJsonFile(String filename){
        String jsonString = "";

        try {
        File myObj = new File(filename);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            jsonString = jsonString + data;
        }
        myReader.close();
        } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        return jsonString;
    }
    public static void writeFile(String filename,String content){
      try {

        // attach a file to FileWriter
        FileWriter fw = new FileWriter(filename);

        // read each character from string and write
        // into FileWriter
        for (int i = 0; i < content.length(); i++)
          fw.write(content.charAt(i));

        System.out.println("Successfully written");

        // close the file
        fw.close();
      }
      catch (Exception e) {
        e.getStackTrace();
      }
    }
}