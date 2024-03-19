import java.util.Scanner;

class CheckChar {
    char ch;

    void setChar(char ch) {
        this.ch = ch;
    }

    boolean checkChar() {

        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) 
	{
            return true; 
        } 
	else if(ch>='0' && ch<='9') 
	{
            return true; 
        } 
	else
	{
            return false; 
        }
    }
}

public class CheckCharApp 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Single Character : ");
        char ch=sc.next().charAt(0);

        CheckChar c = new CheckChar();
        c.setChar(ch);

        boolean result = c.checkChar();
	System.out.print("Character is " + result);
    }
}
