package ques8;

/*
 * Given a string, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values.
 * Example:
 * Input: #NamEs01aNdd@nAMes07
 * output: Upper case letter: 5, Lower case letter: 9 ,Numbers: 4, Special Character: 2
 * Input 2: *HcLtE4EcHIT*
 * output: Lower case letters : 3, Upper case letters : 7, Number : 1, Special characters : 2
 */
public class StringTest {

	public static void main(String[] args) {
    String str="#NamEs01aNdd@nAMes07";
    //String str="*HcLtE4EcHIT*";
    int upper = 0, lower = 0, number = 0, special = 0; 
    
    for(int i = 0; i < str.length(); i++) 
    { 
        char ch = str.charAt(i); 
        if (ch >= 'A' && ch <= 'Z') 
            upper++; 
        else if (ch >= 'a' && ch <= 'z') 
            lower++; 
        else if (ch >= '0' && ch <= '9') 
            number++; 
        else
            special++; 
    } 

    System.out.println("Lower case letters : " + lower); 
    System.out.println("Upper case letters : " + upper); 
    System.out.println("Number : " + number); 
    System.out.println("Special characters : " + special); 
	}

}
