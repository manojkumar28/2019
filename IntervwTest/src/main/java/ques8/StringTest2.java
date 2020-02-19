package ques8;

/* Program to remove vowels from a string
 * input: welcome to hcltechnologies
 * output: wlcm thcltchnlgs
 * input:what is your name?
 * output: wht s yr nm?
 */
public class StringTest2 {

	public static void main(String[] args) {
		String input = "welcome to hcltechnologies";
		System.out.println(input.replaceAll("[AaEeIiOoUu]", ""));
	}

}
