package org.prax;

public class One {
	public static void main(String[] args) {
		String string = "Arulnidhi";
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(rev);
	}
}
