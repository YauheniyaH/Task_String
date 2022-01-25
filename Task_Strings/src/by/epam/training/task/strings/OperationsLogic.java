package by.epam.training.task.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OperationsLogic {
	private String inputStr;
	private String subStr;
	private String newStr;

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public void setSubStr(String subStr) {
		this.subStr = subStr;
	}

	public void setNewStr(String newStr) {
		this.newStr = newStr;
	}

	public OperationsLogic(String inputStr) {
		this.inputStr = inputStr;
	}

	public String replaceStr(String inputStr, String subString, String newStr) {

		inputStr = inputStr.replace(subString, newStr);

		return inputStr;

	}

	public String removeSpaces() {
		String ourString = "";

		for (int i = 0; i < this.inputStr.length(); i++) {

			if (this.inputStr.charAt(i) != ' ') {
				ourString += this.inputStr.charAt(i);
			}

		}

		return ourString;
	}

	public String removeRepeat() {

		StringBuilder sb = new StringBuilder();
		String text = this.inputStr;

		LinkedHashSet<Character> temp = new LinkedHashSet<Character>();

		for (int i = 0; i < text.length(); i++) { // от первого до последнего элемента перебираем
			if (temp.add(text.charAt(i))) { // ЕСЛИ можем добавить в temp букву, значит она УНИКАЛЬНА (LinkedHashSet
											// может хранить только уникальные значения и возвращает true если элемент
											// уникален и может быть добавлен)
				sb.append(text.charAt(i)); // чтоб потом не мучать строки - сразу добавляем в sb УНИКАЛЬНЫЕ буквы и
											// цифры
			}
		}
		this.inputStr = sb.toString();
		return this.inputStr;
	}

}
