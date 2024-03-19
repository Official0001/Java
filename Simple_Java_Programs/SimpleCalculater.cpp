//SIMPLE CALCULATOR BY USING TWO VARIABLE

#include<stdio.h>
int main()
{
	int n1,n2,sum,div,mul,sub,ch;
	
	printf("------ SIMPLE CALCULATOR ------\n");
	
	printf("Which Operation Do You Want To Perform : \n\n" );
	
	printf("Menu \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
	
	printf("Enter the choice ");
	scanf("%d", &ch);
	
	printf("Enter the 2 Numbers\n");
	scanf("%d %d",&n1,&n2);
	
	switch (ch)
	{
		case 1:
			{
				sum = n1+n2;
				printf("Summation of Two Number is : %d\n",sum);
				break;		
			}
			
		case 2:
			{
				sub = n1-n2;
				printf("Substraction of Two Number is : %d\n",sub);
				break;
			}
			
		case 3:
			{
				div = n1/n2;
				printf("Division of Two Number is : %d\n",div);
				break;
			}
			
		case 4:
			{
				mul = n1*n2;
				printf("Multiplication of Two Number is : %d\n",mul);
				break;
			}
		
		default:
			{
				printf("INVALID CHOICE");
			}
		
	}
}
