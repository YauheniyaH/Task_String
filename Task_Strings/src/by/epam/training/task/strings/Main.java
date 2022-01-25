package by.epam.training.task.strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		OperationsLogic oLogic= new OperationsLogic("");
		
		String subStr;
		String newStr;
		
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.print("input original string ");
		oLogic.setInputStr(sc.nextLine());
		//замена подстроки
		System.out.print("input sub  string ");
		subStr=sc.nextLine();
		
		System.out.print("input new string ");
		newStr=sc.nextLine();
		
		System.out.println(oLogic.replaceStr(oLogic.getInputStr(), subStr, newStr));
		
		System.out.print("input original string ");
		oLogic.setInputStr(sc.nextLine());
		
		// удаление из строки повторяющихся символов
		System.out.println(oLogic.removeSpaces());
		oLogic.setInputStr(oLogic.removeSpaces());
		System.out.println(oLogic.removeRepeat());

	}

}
