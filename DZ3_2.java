
import java.io.*;
import java.util.Arrays;

public class DZ3_2 {

    public static void main(String[] args) {
        FileManager file = new FileManager();
        file.fileWriter();
        file.fileReader();
        file.fileCopy();
    }

}

class FileManager {

    public void fileWriter() {
        try (FileWriter writer = new FileWriter("DZ3_2.txt", false)) {
            String text = "Hello world!";
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    public void fileReader() {
        try (FileReader reader = new FileReader("DZ3_2.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void fileCopy(){

     try(FileReader reader = new FileReader("DZ3_2.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){
                 
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }       
    }     
}