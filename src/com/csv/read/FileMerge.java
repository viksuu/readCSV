package com.csv.read;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;

public class FileMerge {
	
	 public static void merge(List<String[]> file1,List<String[]> file2) throws IOException 
	    { 
	        // PrintWriter object for file3.txt 
//	        PrintWriter pw = new PrintWriter("resource/merge.csv"); 
	        FileOutputStream pw = new FileOutputStream("resource/merge.csv",true); 
	        
	        FileWriter output = new FileWriter(new File("resource/merge.csv"));
	        
	        CSVWriter writer = new CSVWriter(new FileWriter("resource/merge.csv"));
	        
	        for(String[] row : file1) writer.writeNext(row);
	        for(String[] row : file2) writer.writeNext(row);
	        
	  
	        pw.flush(); 
	        writer.flush();
	          
	        // closing resources 
	        pw.close(); 
	        output.close();
	        writer.close();
	        System.out.println("File Merged"); 
	    } 

}
