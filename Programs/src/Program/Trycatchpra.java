package Program;

public class Trycatchpra {

	public static void main(String[] args) {
		
		
		int a[]=new int[4];
		int i=8;
		int j=2,k=0;
		
		try
		{
			k=i/j;
			
			System.out.println(k);
			
			
			for(int c=0;c<4;c++)
			{
				
				a[c]=c+1;
			}
			
			for (int values : a)
			{
				System.out.println(values);
			}
			
		}
		
		catch (Exception e)
		{
			System.out.println("Somehing wrong");
			
		}
		
	
		

	}

}
