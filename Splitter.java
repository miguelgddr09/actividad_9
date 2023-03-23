package Listas_act9;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
	static List<Integer> fibbonacciEven=new ArrayList<Integer>();
	static List<Integer> fibbonacciOdd=new ArrayList<Integer>();
	static void splitLists() {
		//new list even/odd numbers
		Fibbonacci.createSequence();
		for(int i=0;i<Fibbonacci.fibbonacciSeq.size();i++) {
			if(Fibbonacci.fibbonacciSeq.get(i)%2==0) {
				fibbonacciEven.add(Fibbonacci.fibbonacciSeq.get(i));
			}
			else if(!((Fibbonacci.fibbonacciSeq.get(i)%2)==0)) {
				fibbonacciOdd.add(Fibbonacci.fibbonacciSeq.get(i));
			} 
		}
	}
}
