package varOper_Lesson1_HW_1;

import java.util.Scanner;

/*1.�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		�3 �� ��� ������� �������� �� �1.*/

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int firstNum, secondNum, thirdNum; // ���������� �� ������������

		System.out.print("Enter a1:");
		firstNum = input.nextInt();

		System.out.print("Enter a2:");
		secondNum = input.nextInt();

		System.out.print("Enter a3:");
		thirdNum = input.nextInt();

		// ������� �� ����������� ��� ���� ���������� !
		
		firstNum += secondNum; // a1 = a1 + a2;
		secondNum = firstNum - secondNum; // a2 = a1 - a2; a2 ����� ���������� �� �1
		firstNum -= secondNum; // a1 = a1 - a2; a1 ����� ���������� �� �2
		thirdNum += secondNum; // a3 = a3 + a2
		secondNum = thirdNum - secondNum; // a2 = a3 - a2; a2 ����� ���������� �� �3
		thirdNum -= secondNum; // a3 = a3 - a2; a3 ����� ���������� �� �2

		// ������� �� ����������� � ���� ���������� !

//		int temp = thirdNum; // � ���� ������������ �� ������� ���������� �� �3
//		thirdNum = firstNum; // a3 = a1; a3 ����� ���������� �� �1;
//		firstNum = secondNum; // a1 = a2; a1 ����� ���������� �� �2;
//		secondNum = temp; // a2 = a3 (temp); a2 ����� ���������� �� �3;

		System.out.printf("a1 = %d%na2 = %d%na3 = %d", firstNum, secondNum, thirdNum);

	}

}
