package Listas_act9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {
	FileWriter evenWriter=null;
	PrintWriter evenPrinter=null;
	FileWriter oddWriter=null;
	PrintWriter oddPrinter=null;
	void ejecutar() {
		Splitter.splitLists();
		//create file
		try {
			File oddNumFile=new File("OddNum.txt");
			File evenNumFile=new File("EvenNum.txt");
			//create files
		      if (oddNumFile.createNewFile() && evenNumFile.createNewFile()) {
		        System.out.println("File created: " + oddNumFile.getName());
		        System.out.println("File created: " + evenNumFile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
		//write to file
		try {
			evenWriter= new FileWriter("EvenNum.txt");
			evenPrinter= new PrintWriter(evenWriter);			
			for(int i=0; i<Splitter.fibbonacciEven.size(); i++) {
				String writeVal=String.valueOf(Splitter.fibbonacciEven.get(i));
				evenPrinter.print(writeVal);
			}
			oddWriter= new FileWriter("OddNum.txt");
			oddPrinter= new PrintWriter(oddWriter);			
			for(int j=0;j<Splitter.fibbonacciOdd.size(); j++) {
				String writeVal=String.valueOf(Splitter.fibbonacciOdd.get(j));
				oddPrinter.print(writeVal);
			}
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}finally{
			try {
				evenWriter.close();
				evenPrinter.close();
				oddWriter.close();
				oddPrinter.close();
			}catch(IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
		}
	}
}
