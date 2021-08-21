import java.util.Scanner;
class HarmonicNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter a number to generate harmonic number : ");
		int num = scan.nextInt();
		double result=0.0;
		if (num>0) {
			System.out.println("The harmonic series is: ");
			for(int i=1;i<=num;i++) {
				result =(double) 1 /i;
				System.out.print(result + ", ");
			}
			
		}
		else {
			System.out.println("Next time write a number which id greater than 0");
			System.exit(0);
		}
		
	}
}
