package ascendingOrder;
import java.util.*;
public class Ascending_order_sort {
	public static void main(String args[]) {
		int n,temp;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of array elements:");
		 n = input.nextInt();
		 int number[] = new int[n];
		 System.out.println("Enter the array Elements:");
		 
		 for(int i=0; i < n; i++) 
		 {
			number[i] = input.nextInt(); 
		 }
		 input.close();
		 
		 for (int i=0; i <n-1; i++)
		 {
			 for (int j = i+1; j <n; j++)
			 {
				 if(number[i] > number[j])
				 {
					 temp = number[i];
					 number[i] = number[j];
					 number[j] = temp;
				 }
			 }
		 }
		 System.out.println("Elements in Ascending order are:");
		 for(int i = 0; i < n-1 ; i++ )
		 {
			 System.out.print( number[i] + "\n");
		 } 
		 
		 System.out.println(number [n-1]);
		 }
		
		
	}


