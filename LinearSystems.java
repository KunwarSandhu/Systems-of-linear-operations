package LEO;
import java.util.Scanner;
public class LinearSystems {

	/**
	 * @author Manraj Chinjar and Kunwar Sandhu
	 */
	public static void main(String[] args) {
		int q;
		double A=0;
		double x=0;
		double y=0;
		double B=0;
		double C=0;
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
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Slope intercept form: y =" +
				" Mx + b\nGenral form: Ax + By + c =" +
				" 0\nEnter 1 if your formula is in slope" +
				" intercept form\nEnter 2 if your formula is in " +
				"genral form");
		
		q = input.nextInt();
		// to get answer make while() =/ repeat until match than break
		
		if (q==1){
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
				X=X+1;
			}
			X=X-1;
			
		}else if (q==2){
			System.out.println("Ax + By + C = 0");
			System.out.println("Enter A");
			A = input.nextDouble();
			System.out.println("Enter B");
			B = input.nextDouble();
			System.out.println("Enter C");
			C = input.nextDouble();
			
			
			
			
			//Ax + By + C = 0
			System.out.println("Ax + By + C = 0");
			System.out.println(A + "x + " + B + "y + " + C + " = 0");
			
			if (C*-1 <= 0) {
				System.out.println( A+"x + " +B + "y = " +C*-1);
				System.out.println(B+"y = "+A*-1+"x + ("+C*-1+")");
				System.out.println("y = "+A*-1+"/"+B+"x + ("+C*-1/B+")");
			}else {
				System.out.println( A+"x + " +B + "y = " +C*-1);
			System.out.println(B+"y = "+A*-1+"x + "+C*-1);
			System.out.println("y = "+A*-1+"/"+B+"x + "+C*-1/B);
			}
			
		
		}
		
		
	
		
		
System.out.println("("+X+","+Y+")");
input.close();
	}

}
