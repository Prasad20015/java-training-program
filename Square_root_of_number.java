
		import java.util.*; 

	
		public class Square_root_of_number {
			
		
			public static double square(double number) {
				double t;
				double squareroot = number / 2;
				do {
					t=squareroot;
					squareroot = (t+(number/t))/2;
				}while ((t - squareroot) !=0);
				return squareroot;
				
				
			}
			
				
			public static void main(String[] args)
			{
						
			
				@SuppressWarnings("resource")
				Scanner sc= new Scanner(System.in);
				
				System.out.print("Enter number :");
				
				double number1= sc.nextInt();
				
				double number2 = number1 * number1; //squaring operation in main
				
				double root = square(number1);
				
				System.out.println("Square Root : "+root);
				System.out.println("Square Value : "+number2);
	}

}
