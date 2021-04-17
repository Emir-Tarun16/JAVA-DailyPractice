//PRactice Set ^ -> Arrays in java.....

import java.lang.*;
import java.util.Arrays;

public class practiceSet6 {
	
	public static void main(String []args){
	
		//Q1. Create an array of 5 floats and calculate their sum.
		
		float [] val = {22.5f,11.45f,10.1f,41.1f,6.0f};
		float sum = 0;
		
		for(float element: val){
			sum += element;
		}
			System.out.println("The sum of the given Arrays is : "+sum);
			
		
		//Q2. Write a program to find out whether a given integer is present in an array or not.
		
		int [] sampleArray = {23,4,61,12,34,55};
		int num = 61;
		
		boolean ifPresent = false;
		
		for(int element: sampleArray){
			if(num == element) {
				ifPresent = true;
			}
		}
		
		if(ifPresent){
			System.out.println("The given Number is present in array ");
			
		}
		else {
			System.out.println("The given Number is not present in the array " );
		}
		
		//Q3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
		
		//System.out.println("Marks of student earned in Physics   : ");
		int [] marks = {18,13,7,20,11};
			
			int sumOfMarks = 0;
			
			for(int element: marks){
				sumOfMarks += element;
				
			}
			
			System.out.println("The Average Marks is : "+ sumOfMarks/marks.length);
 		
 		//Q4.Create a Java program to add two matrices of size 2x3.
 		
 		System.out.println("Adding Two matrices in java");
 		int [][] mat1 = {{2,3,4},{4,5,6}};
 		int [][] mat2 = {{10,11,12},{7,8,9}};
 		
 		int [][] result = {{0,0,0},{0,0,0}};
 		
 		  for (int i=0;i<mat1.length;i++){ // row number of times
          		  for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

       	 // Printing the elements of a 2-D Array
       	 for (int i=0;i<mat1.length;i++){ // row number of times
           		 for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
        
		//Q5. Write a Java program to reverse an array.
		
		int [] revA = {1, 2100, 3, 455, 5, 34, 67};
		int l = revA.length;
        	int n = Math.floorDiv(l,2);
		int temp;
		
		for(int i=0;i<n;i++){
			//Swapping the values
			   temp = revA[i];
			   revA[i] = revA[l-1-i]; 
			   revA[l-1-i] = temp;
		}
		
			for(int element: revA){
				System.out.print(element +" ");
			}
			
		System.out.println(" ");
		
		
		//Q6. Finding the maximum element in the array and java array
		
		int [] arr = {1, 2100, 3, 455, 5, 34, 67};
		
		int max = Integer.MIN_VALUE;
		
			for(int element: arr){
				if(element>max){
					max = element;
				}
			}
			
			System.out.println("The maximum element is : "+max);
		
		//Q7. Write a Java program to find whether an array is sorted or not.
		
		
		int [] sample_arr = {2,3,5,33,115,300,718};
		boolean isSorted = true;
		
		for(int i=0;i<sample_arr.length-1;i++){
			if(sample_arr[i] > sample_arr[i+1]) {
				isSorted = false;
				break;
			} 
		}
		
		if(isSorted){
			System.out.println("Given Array is sorted ");
		}
		else{
			System.out.println("Given Array is not Sorted ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
        
        
        
        
        
        
        
        
	}
}
