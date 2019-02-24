package com.csv.read;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadAllLineAtOnce {

	public static void readAllDataAtOnce(String loc1,String loc2) 
	{ 
	    try { 
	        // Create an object of file reader 
	        // class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(loc1); 
	  
	        // create csvReader object and skip first Line 
	        CSVReader csvReader = new CSVReaderBuilder(filereader) 
	                                  .withSkipLines(1) 
	                                  .build(); 
	        List<String[]> file1 = csvReader.readAll(); 
	        
	        filereader = new FileReader(loc2);
	        
	        CSVReader csvReader2 = new CSVReaderBuilder(filereader) 
                    .withSkipLines(1) 
                    .build(); 
	
	        List<String[]> file2 = csvReader2.readAll(); 
	  
	        // print Data 
	       /* for (String[] row : allData) { 
	            for (String cell : row) { 
	                System.out.print(cell + "\t"); 
	            } 
	            System.out.println(); 
	        } 
	        */
	        FileMerge.merge(file1,file2);
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 	
	}

	public static void main(String[] args) {

		readAllDataAtOnce("resource/csvCheck1.csv","resource/csvCheck2.csv");

	}

}
