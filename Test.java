	import java.util.Scanner;
	import java.text.DecimalFormat;
public class Test {
	public static void main(String[]args){
	
		DecimalFormat df = new DecimalFormat("###.##");
		
				Scanner input = new Scanner(System.in);
				double GY;
				double equation1;
				double equation2;
				double YintN;
				double YintD;
				double Yint;
				double Y = 1;
				double Y2 = 0;
				double X = -200;
				double YintN2;
				double YintD2;
				double Yint2;
				System.out.println("Y = Mx + b");
				System.out.println("Equation 1:");
				System.out.println("Enter Slope numerator");
				YintN = input.nextDouble();
				System.out.println("Enter slope denominator");
				YintD = input.nextDouble();
				System.out.println("Enter B");
				Yint = input.nextDouble();
				//
				System.out.println("Equation 2:");
				System.out.println("Enter Slope numerator");
				YintN2 = input.nextDouble();
				System.out.println("Enter slope denominator");
				YintD2 = input.nextDouble();
				System.out.println("Enter B");
				Yint2 = input.nextDouble();
				
				
				
				
				while (Y != Y2&&X<200) {
					Y = ((YintN/YintD)*X)+Yint;
					Y2 = ((YintN2/YintD2)*X)+Yint2;
					Y = df.format(Y);
					Y2 = df.format(Y2);
					System.out.println(X+"\t"+Y+"\t"+Y2);
					X=X+1;
				}
				X=X-1;
				
				
	System.out.println("("+X+","+Y+")");
	
	
	}
	

}
