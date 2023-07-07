package jp.co.f1.app.bmi;
import java.util.Scanner;

public class BmiStep6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's calculate your BMI!");
		System.out.println("Enter your height (cm)> ");
		double height = sc.nextDouble();
		double heightInMeter = height * 0.01;
		System.out.println("Enter your weight (kg)> ");
		double weight = sc.nextDouble();
		System.out.println("身長：" + height + "cm。体重：" + weight + "kg.");
		double bmi = weight / (heightInMeter * heightInMeter);
		System.out.print("BMIは");
		System.out.printf("%.1f", bmi);
		System.out.println(".");
		if (bmi >= 25) {
			System.out.println("太り気味です。");
		} else if (bmi <= 18.5) {
			System.out.println("やせ気味です。");
		} else if (bmi < 25 && bmi > 18.5) {
			System.out.println("正常値です。");
		}
		System.out.println("===終了===");
	}

}