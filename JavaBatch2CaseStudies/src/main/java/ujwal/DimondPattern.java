package programs.com;

import java.util.Scanner;

class DimondPattern {
	public static void main(String[]args)
    {
		Scanner sc= new Scanner(System.in);
	    System.out.print("enter the number of rows to print: ");  
	    int input= sc.nextInt();  
	    System.out.print("enter required char 1:");
	    int a=sc.nextInt();
	    int temp = a;
	    System.out.print("enter required char 2:");
	    int b=sc.nextInt();	
	    
	    for(int i=1;i<=(input+1)/2;i++){
	    	temp=print(i,input,a,b,temp);
	    	System.out.println();
	    }
	    for(int i=input/2;i>=0;i--){
	    	temp=print(i,input,a,b,temp);
	    	System.out.println();
	    }
	    sc.close();
    }
	private static int print(int i, int input, int a, int b, int temp) 
	{
		for(int space=i;space<=input/2;space++){
			System.out.print(" ");
		}
		for (int character=1; character<=i*2-1;character++) {
			if ( temp == a) {
				System.out.print(a);
				 temp=b;
			} else if(temp==b) {
				System.out.print(b);
				temp=a;
			}
		}
		return temp;
	}
}
	    	

