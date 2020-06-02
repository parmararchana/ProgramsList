package Program;

import java.io.*;
import java.util.Scanner; 

class GFG { 
    
	
    static void pattern(int rows_no) 
    { 
        int i, j, k; 
      
       
        for (i = 1; i <= rows_no; i++) { 
      
              for (k = 1; k < i; k++)  
                System.out.print("0 "); 
              
            
            for (j = i; j <= rows_no; j++)  
            	if(j!=rows_no)
                System.out.print( j+" 0 " );  
            	else
            		System.out.print(j); 
            
            for (k = 1; k < i; k++)  
                System.out.print(" 0"); 
            
    
      
            System.out.println(); 
        } 
      
       
        for (i = rows_no - 1; i >= 1; i--)  
        { 
            
            for (k = 1; k < i; k++)  
                System.out.print("0 "); 
              
            
            for (j = i; j <= rows_no; j++)  
            {
                if(j!=rows_no)
            	System.out.print(j + " 0 "); 
                else
                	System.out.print(j); 
            }
            
            for (k = 1; k < i; k++)  
                System.out.print(" 0"); 
           
            System.out.println(); 
        } 
    } 
      
    
    public static void main (String[] args)  
    { 
       
        int number; 
        
        System.out.println("Please Enter the number : ");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
      
        pattern(number); 
      
    } 
} 
