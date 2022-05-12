package edu.chainsys.io.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fileoperation 
{
    static File file=new File("D:\\chainsys\\details\\location.txt");
    public static void createNewFile()
    {
        boolean present=file.exists();
        if(present == false)
            try
            {
             boolean create= file.createNewFile();
             System.out.println("File created: "+ create);
            }
            catch(IOException e)
             {
                e.printStackTrace();
             }
    }
    public static File renameFile()
    {
        File file1=new File("D:\\chainsys\\details\\locationofchainsys.txt");
        boolean rename=file.renameTo(file1);
        System.out.println("Rename success: "+rename);
        return file1;
    }
  
    public static void modifydata() throws IOException
    {
    	 String filePath = "D:\\chainsys\\details\\location.txt";
         Scanner sc = new Scanner(new File(filePath));
         StringBuffer buffer = new StringBuffer();
         while (sc.hasNextLine()) {
    	 buffer.append(sc.nextLine()+System.lineSeparator());
    	}
    	 String fileContents = buffer.toString();
         System.out.println("Contents of the file: "+fileContents);
    	 sc.close();
    	 String oldLine ="happy";
    	 String newLine = "sad";
    	 fileContents = fileContents.replaceAll(oldLine, newLine);
    	 FileWriter writer = new FileWriter(filePath);
    	 System.out.println("new data: "+fileContents);
    	 writer.append(fileContents);
    	 writer.flush();
    	}


    		
    public static File sharing() {
    	
    	return  renameFile(); 
    }
    public static void readDataFromFile()
    {
        try 
        {
        	File file2= sharing();          // new File("D:\\chainsys\\details\\locationofchainsys.txt");     
            FileReader reader = new FileReader(file2);
            char[] ch=new char[(int) file2.length()];
            //System.out.println(ch.length);
            reader.read(ch);
            for(char c: ch)
            {
                System.out.print(c);
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void deleteFile()
    { file=sharing();
       boolean deletion= file.delete();
       System.out.println(deletion);
    }
    public static void copyFile()
    {
        try 
        {
            InputStream input=new FileInputStream("D:\\chainsys\\details\\location.txt");
            OutputStream output=new FileOutputStream("D:\\chainsys\\details\\location_copy.txt");
            int content=input.read();
            while(content != -1)
            {
                output.write(content);
                content=input.read();
            }
            output.flush();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void appendStrToFile() throws IOException
    {
        String textToAppend = "Happy to see you !!";
        String filePath = "D:\\employee\\say\\location.txt";

        try(FileWriter fw = new FileWriter(filePath, true);
        BufferedWriter writer = new BufferedWriter(fw);) 
        {
            writer.write(textToAppend);
            System.out.println("Text is appended");    
        }
     }
  
    public static void moveAFile() throws IOException
    {
        Path temp = Files.move
                (Paths.get("D:\\chainsys\\details\\location.txt"),
                Paths.get("D:\\employee\\say\\location.txt"));
         
                if(temp != null)
                {
                    System.out.println("File renamed and moved successfully");
                }
                else
                {
                    System.out.println("Failed to move the file");
                }
            }
    public static void main(String args[]) throws IOException
    {
      //createNewFile();
      // renameFile();
//        modifyData();
     //  readDataFromFile();
      // deleteFile();
       //copyFile();
    	//appendStrToFile();
    	//moveAFile();
    }
}
