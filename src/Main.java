import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Form: ax² + bx + c = 0");
		
		System.out.print("a: ");
		double a =  Double.valueOf(input.nextLine()).doubleValue();
		
		System.out.print("b: ");
		double p = Double.valueOf(input.nextLine()).doubleValue();
		
		System.out.print("c: ");
		double q =  Double.valueOf(input.nextLine()).doubleValue();
		
		p /= a;
		q /= a;
		
		double wertUnterDerGleichung = Math.pow(p / 2, 2) - q;
		if (wertUnterDerGleichung < 0){
			System.out.println("Es gibt keine Lösung!");
			return;
		}else if (wertUnterDerGleichung == 0){
			System.out.println("X = " + (-p / 2));
		}else{
			System.out.println("X1 = " + ((-p / 2) + Math.sqrt(wertUnterDerGleichung)));
			System.out.println("X2 = " + ((-p / 2) - Math.sqrt(wertUnterDerGleichung)));
		}
	}

}
