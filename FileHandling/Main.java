import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//create a new file and check if the file is alreaty exits or not 

class Main{
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile1.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("File created Successfully...");
        }
        else{
            System.out.println("File already exists...");
        }
    }
}

//writing in a file 

class WriteFile{
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\\\Users\\\\rajes\\\\OneDrive\\\\Desktop\\\\Java\\\\Raja\\\\textfile.txt";
        FileWriter mywriter = new FileWriter(filepath);
        mywriter.write("Hello,World !");
        mywriter.flush();
        mywriter.close();
        System.out.println("Successfully writing the content in a file");
    }
}

//Read a File 

class ReadFile{
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt");
        Scanner scn = new Scanner(read);

        while (scn.hasNextLine()){
            String data = scn.nextLine();
            System.out.println(data);
   
        }
        
    }

}

//append a text in a file 

class AppendFile{
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\\\Users\\\\rajes\\\\OneDrive\\\\Desktop\\\\Java\\\\Raja\\\\textfile.txt";
        FileWriter mywriter = new FileWriter(filepath,true);
        mywriter.append("\nit is not a basic level course.");
        mywriter.flush();
        mywriter.close();
        System.out.println("Successfully append the content in a file");
    }
}


//Delete a file 

class DeleteFile{
    public static void main(String[] args) {
        File deletefile = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile1.txt");
        if(deletefile.exists()){
            deletefile.delete();
            System.out.println("File deleted successfully...");
        }
    }
}


//Counting lines in a file 

class CountLine{
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt");
        Scanner scn = new Scanner(read);
        int countLine=0;

        while (scn.hasNextLine()){
            countLine++;
            String data = scn.nextLine();
        }
        System.out.println("Total Lines in a File :"+countLine);
        
    }
}


//Copy one file to another file.



class CopyFile {
    public static void main(String[] args) {
        String oldfile = "C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt";
        String newfile = "C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile1.txt";

        try (FileReader reader = new FileReader(oldfile);
             FileWriter writer = new FileWriter(newfile)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

           
            System.out.println("File copied successfully...");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


//give input and append in a file 

class InputWriteFile{
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a text you want:");
        String text = scn.nextLine();

        String filepath = "C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt";

        FileWriter data = new FileWriter(filepath,true);
        data.append(text);
        data.flush();
        data.close();
        System.out.println("Content inserted successfully...");  

    }

}


//Search word in a file 

class SearchwordFile{
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt");
        Scanner scn = new Scanner(read);

        String word = "you";
        boolean fount =false;
        int linecount =0;

        while (scn.hasNextLine()){
         String line = scn.nextLine();
         linecount++;

        if(line.contains(word)){
            System.out.println("Word there in line "+linecount+" : "+line);
            fount = true;
        }
    }
    if(!fount){
        System.out.println("word is not contains in the file..");
    }

    scn.close();
        
    }

}


//count word

class CountWord{
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt");
        Scanner scn = new Scanner(read);
        int countword=0;
        int countline=0;

        while (scn.hasNextLine()){
            String data = scn.nextLine();
            countline++;
            countword =countword+ data.split("\\s+").length; 
        }
        System.out.println("Total Words in a File :"+countword);
        scn.close();
        }
        
        
    }

class TextFile{

    static void searchword(String filepath) throws FileNotFoundException{
        File read = new File(filepath);
        Scanner scn = new Scanner(read);

        String word = "World";
        boolean fount =false;
        int linecount =0;

        while (scn.hasNextLine()){
         String line = scn.nextLine();
         linecount++;

        if(line.contains(word)){
            System.out.println("Word there in line "+linecount+" : "+line);
            fount = true;
        }
    }
    if(!fount){
        System.out.println("word is not contains in the file..");
    }

    scn.close();

    }

    static void linecount(String filepath) throws FileNotFoundException{
        File read = new File(filepath);
        Scanner scn = new Scanner(read);
        int countword=0;
        int countline=0;

        while (scn.hasNextLine()){
            String data = scn.nextLine();
            countline++;
            countword =countword+ data.split("\\s+").length; 
        }
        System.out.println("Total Words in a File :"+countword);
        System.out.println("Total Lines in a File:"+countline);
        scn.close();

    }
    public static void main(String[] args) throws FileNotFoundException {
        String filepath ="C:\\Users\\rajes\\OneDrive\\Desktop\\Java\\Raja\\textfile.txt";
        linecount(filepath);
        searchword(filepath);
    }
}












