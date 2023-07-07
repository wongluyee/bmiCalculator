package jp.co.f1.app.bmi;
import java.util.Scanner;

public class BmiStep2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's calculate your BMI!");
		System.out.println("Enter your height (cm)> ");
		double height = sc.nextDouble();
		double heightInMeter = height * 0.01;
		System.out.println("Enter your weight (kg)> ");
		double weight = sc.nextDouble();
		System.out.println("Your height is " + height + "cm. Your weight is " + weight + "kg.");
		double bmi = weight / (heightInMeter * heightInMeter);
		System.out.print("Your BMI is ");
		System.out.printf("%.1f", bmi);
		System.out.println(".");
		System.out.println("End of program.");
	}

}
