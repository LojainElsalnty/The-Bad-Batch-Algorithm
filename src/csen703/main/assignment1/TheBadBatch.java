package csen703.main.assignment1;

import java.util.Arrays;

/**
 * Write your info here
 * 
 * Team 58
 * Login Mohamed Elsalanty
 * 52-5401
 * T-20
 */


public class TheBadBatch {
	
	public static boolean TatooineToNabooDivideAndConquer(int [] fuel) {
		if(fuel.length==0) {
			 return true;
		}
		
		if(fuel.length>0) {
		     return TatooineToNabooDivideAndConquerHelper(fuel,0, fuel.length,fuel[0]);
		}
		 return false;
	}
	
	
	private static boolean TatooineToNabooDivideAndConquerHelper(int[] fuel, int index, int fuelArrayLength, int fuelSum) {

		if(fuelSum < 0 ) {
			return false;
		}
		if(index==fuelArrayLength-1) {
			return true;
		}
		if(fuelSum == 0 && fuel[index]==0) {
			return false;
		}
		
		if(fuelSum ==0 && index != fuelArrayLength-1) {

			return TatooineToNabooDivideAndConquerHelper( fuel,index+1,fuelArrayLength,0+fuel[index+1]);
		}
		
		if(fuelSum==1) {
			return TatooineToNabooDivideAndConquerHelper( fuel,index+1,fuelArrayLength,fuelSum-1+fuel[index+1]);
		}else {

		return 
	       TatooineToNabooDivideAndConquerHelper( fuel,index+1,fuelArrayLength,fuelSum-1)
	       ||  TatooineToNabooDivideAndConquerHelper( fuel,index+1,fuelArrayLength,0+fuel[index+1]);
		
				       
	}
}



	public static boolean TatooineToNabooGreedy(int [] fuel) {
		if(fuel.length==0) {
			 return true;
		}
		if(fuel.length==1) {
			return true;
		}
		if(fuel.length>0) {
		int i =0;
		int fuelSum =fuel[0];
		for( i=1; i<fuel.length-1;i++) {
			
			fuelSum-=1;
			 if(fuelSum <0 ) {
					
					break;
				}
			
			 if(fuelSum < fuel.length-i-1 && fuel[i]>0 && fuel[i]> fuelSum ) {
				
				fuelSum= fuel[i];
			}
				
			}
		

		if(i == fuel.length-1 && fuelSum >= 1) {
			return true;
		}

	}
		return false;
}
	
	public static void main(String[]args) {
		//int [] fuel1= {5,0,0,0,0,1,0};
	
//		int [] fuel1= {1,0,2,5,0};
		int [] fuel1= {1, 2, 0, 2, 5};
		boolean DandC1 = TatooineToNabooDivideAndConquer(fuel1);
//		boolean Greedy1 = TatooineToNabooGreedy(fuel1);
		System.out.println("Divide & Conquer1 : "+ DandC1);
		//System.out.println("Greedy1 : "+ Greedy1);
//		int [] fuel2= {3,2,1,0,4};
//		boolean DandC2= TatooineToNabooDivideAndConquer(fuel2);
//		boolean Greedy2= TatooineToNabooGreedy(fuel2);
//		System.out.println("Divide & Conquer2 : "+ DandC2);
//		System.out.println("Greedy2 : "+ Greedy2);

		
		
	}

}