package csen703.main.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write your info here
 * 
 * Team 58
 * Login Mohamed Elsalanty
 * 52-5401
 * T-20
 */

public class TheBadBatchPath {
	
	// Notice that using static variables might mess up the test cases,
	//  therefore we advise against using static variables. 
	// There are other workarounds that you can do.
	
	 public static Integer TatooineToNabooDP(int [] fuel) {
		 if(fuel.length==0) {
			 return 0;
			 }

		 return TatooineToNabooPath(fuel).size()-1;
		
	 }
	 
	 // Notice that Tatooine and Naboo are always the start and end of this path. 
	 // If there are multiple minimum paths, you only return one of them.
	 public static ArrayList<Integer> TatooineToNabooPath(int [] fuel){
		 
		 if(fuel.length==0) {
			 return new ArrayList<Integer>();
			 }
		 
		 int n = fuel.length;
	        int[] minimumPath = new int[n];
	        int[] planets = new int[n];      
	        
	        for (int i = 0; i < n; i++) {
	        	minimumPath[i] = Integer.MAX_VALUE;
	            for (int j = 0; j < i; j++) {
	            	// System.out.println( minimumPath[i]);
	                if (j + fuel[j] >= i && minimumPath[j] + 1 < minimumPath[i]) {
	                	
	                	minimumPath[i] = minimumPath[j] + 1;
	                	planets[i] = j; 
	                }
	            }
	        }
	        
	        System.out.println("planets: "+Arrays.toString(planets));
	     // Reconstruct the path
	        return reconstructPath(planets);


		}
	 
	 //, int index, ArrayList<Integer> path
	 private static ArrayList<Integer> reconstructPath(int[] plants ) {
		
		 ArrayList<Integer> path = new ArrayList<>();
		    int index = plants.length - 1; 


		    while (index > 0) {
		        path.add( index); 
		        index = plants[index]; 
		    }

		   
		    path.add( 0);
            Collections.reverse(path);
            
		    return path;

		
	}
	 
	

	public static void main(String[]args) {
			
		
			int [] fuel1= {2,3,1,1,4};
			
			//int minimumNumberOfLandingsToReachNaboo = TatooineToNabooDP(fuel1);
			ArrayList<Integer> orderedMinimumPath = TatooineToNabooPath(fuel1);
			//System.out.println("minimum number of landings to reach planet Naboo: "+ minimumNumberOfLandingsToReachNaboo);
			System.out.println("ordered minimum path of the planets indices the BadBatch should land on to reach Naboo : "+ orderedMinimumPath);
			
			
			
		}

}
