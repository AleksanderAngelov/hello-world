package varOper_Lesson1_HW_1;

import java.util.Scanner;

/*1.Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
		им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
		а3 да има старата стойност на а1.*/

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int firstNum, secondNum, thirdNum; // Декларация на променливите

		System.out.print("Enter a1:");
		firstNum = input.nextInt();

		System.out.print("Enter a2:");
		secondNum = input.nextInt();

		System.out.print("Enter a3:");
		thirdNum = input.nextInt();

		// Размяна на стойностите без Темп променлива !
		
		firstNum += secondNum; // a1 = a1 + a2;
		secondNum = firstNum - secondNum; // a2 = a1 - a2; a2 взима стойността на а1
		firstNum -= secondNum; // a1 = a1 - a2; a1 взима стойността на а2
		thirdNum += secondNum; // a3 = a3 + a2
		secondNum = thirdNum - secondNum; // a2 = a3 - a2; a2 взима стойността на а3
		thirdNum -= secondNum; // a3 = a3 - a2; a3 взима стойността на а2

		// Размяна на стойностите с Темп променлива !

//		int temp = thirdNum; // В темп променливата се запазва стойността на а3
//		thirdNum = firstNum; // a3 = a1; a3 взима стойността на а1;
//		firstNum = secondNum; // a1 = a2; a1 взима стойността на а2;
//		secondNum = temp; // a2 = a3 (temp); a2 взима стойността на а3;

		System.out.printf("a1 = %d%na2 = %d%na3 = %d", firstNum, secondNum, thirdNum);

	}

}
