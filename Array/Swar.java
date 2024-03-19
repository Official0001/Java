import java.util.*;

public class Swar 
{
    public static void main(String[] args) 
    {
	Scanner sc = new Scanner(System.in);

	int len;

	System.out.println("Enter Choice : ");
	int ch=sc.nextInt();


        switch(ch) 
	{
            case 1:

		char[] str = {'S','R','G','M','P','D','N'};

		 len=str.length;

		for(int i=0, j=len-1; i<len/2; i++, j--) 
		{
    			char temp = str[i];
    			str[i] = str[j];
    			str[j] = temp;
		}

		System.out.printf("After : ");
		System.out.println(str);
               
                break;


            case 2:

		String[] str1 = {"SS","RR","GG","MM","PP","DD","NN","SS"};

		len=str1.length;

		for(int i=0,j=len-1; i<len/2; i++,j--) 
		{
    			String temp = str1[i];
    			str1[i] = str1[j];
    			str1[j] = temp;
		}

		System.out.print("After : ");
		for(int i=0; i<len; i++) 
		{
    			System.out.print(str1[i] + " ");
		}
		
                break;


            case 3:
	    {
      			String[] str2 = {"SRG","RGM","GMP","MPU","PDN","DNS"};
    			len = str2.length;

    			for (int i = 0, j = len - 1; i < len / 2; i++, j--)
    			{
        			String temp = str2[i];
        			str2[i] = str2[j];
        			str2[j] = temp;
    			}

		    System.out.print("After reversing strings: ");
 		   for (int i = 0; i < len; i++)
    		   {
           		 System.out.print(str2[i] + " ");
    	       	   }
        		System.out.println();

    		for (int i = 0; i < len; i++)
    		{
        		char[] chars = str2[i].toCharArray();
        		int len1 = chars.length;

       		 for (int start=0, end=len1-1; start<len1/2; start++, end--)
        {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
        }

        str2[i] = new String(chars);
    }

    System.out.print("After reversing characters: ");
    for (int i = 0; i < len; i++)
    {
        System.out.print(str2[i] + " ");
    }
    System.out.println();
    break;
}


	    case 4:
              
                break;


            default:
                 System.out.println("Invalid Choice");
        }

       
    }
}
