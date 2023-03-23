package Listas_act9;

import java.util.ArrayList;
import java.util.List;

public class Fibbonacci {
	static List<Integer> fibbonacciSeq=new ArrayList<Integer>();
	static void createSequence(){
		fibbonacciSeq.add(0);
		fibbonacciSeq.add(1);
		//create the fibbonacci sequence
		int lastVal=0;
		int index=0;
		do {
			int valueToAdd=fibbonacciSeq.get(index)+fibbonacciSeq.get(index+1);
			fibbonacciSeq.add(valueToAdd);
			lastVal=valueToAdd;
			index++;
		}while(lastVal<100000);
	}
}
