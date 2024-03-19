import java.util.*;

class CharArrParent {
    protected char[] str = new char[20];

    void acceptCharArray(char[] str) {
        this.str = str;
    }
}

class ReverseWord extends CharArrParent {

	void reverseWord() {
	    // Reverse the entire string
	    for (int i = 0, j = str.length - 1; i < j; i++, j--) {
	        char temp = str[i];
	        str[i] = str[j];
	        str[j] = temp;
	    }

	    int start = 0;
	    for (int i = 0; i < str.length; i++) {
	        if (i == str.length || str[i] == ' ') {
	            int end = i - 1;
	            while (start < end) {
	                char temp = str[start];
	                str[start] = str[end];
	                str[end] = temp;
	                start++;
	                end--;
	            }
	            start = i + 1;
	        }
	    }

	    System.out.print("Reverse Word: ");
	    for (char c : str) {
	        System.out.print(c);
	    }
	    System.out.println();
	}


}

class ExtractDigitForSum extends CharArrParent {
    int getSum() {
        int sum = 0;
        for(int i=0; i<str.length; i++) {
            if (str[i]>= '0' && str[i] <= '9') {
                sum = sum + str[i] - '0';
            }
        }
        return sum;
    }
}

public class WordApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Reverse Word");
        System.out.println("2. Calculate Sum");
        
        char[] str = new char[9];
        System.out.println("Enter String:");
        for(int i=0; i<str.length; i++)
        {
        	str[i] = sc.next().charAt(0);
        }

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                ReverseWord rev = new ReverseWord();
                rev.acceptCharArray(str);
                rev.reverseWord();
                break;

            case 2:
                ExtractDigitForSum sum = new ExtractDigitForSum();
                sum.acceptCharArray(str);
                int result = sum.getSum();
                System.out.println("Sum of Digits in char Array is: " + result);
                break;

            default:
                System.out.println("Wrong choice");
        }

    }
}
