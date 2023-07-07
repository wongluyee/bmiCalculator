package jp.co.f1.app.bmi;

import java.util.Scanner;

public class BmiStep7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("BMIを計算しましょう。");
		double height = 0;
		double weight = 0;

		while (height <= 0.0 || weight <= 0.0) {
			System.out.println("身長を記入してください (cm)> ");
			height = sc.nextDouble();
			System.out.println("体重を記入してください(kg)> ");
			weight = sc.nextDouble();
			if (height <= 0.0 || weight <= 0.0) {
				System.out.println("※※0以下の数値があるため、再入力してください※※");
				continue;
			} else {
				break;
			}
		}

		System.out.println("身長：" + height + "cm。体重：" + weight + "kg.");
		double heightInMeter = height * 0.01;
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