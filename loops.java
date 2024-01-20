import java.util.*;
import math.*;
class loops{
	Scanner sc = new Scanner(System.in);
	public void multiplication(){
		System.out.println("Enter a valid number for multiplication: ");
		int val = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=10;i++){
			sum= val *i;
			System.out.println(sum);
		}
			
	}
	public void reverse_mul(){
		System.out.println("Enter a valid number for reverse multiplication: ");
		int rev = sc.nextInt();
		int sum = 0;
		for(int i=10;i>=1;i--){
			sum= rev*i;
			System.out.println(sum);
		}

	}
	public void fact(){
		System.out.println("Enter a valid number for factorial: ");
		int fact = sc.nextInt();
		int num = 1;
		for(int i=1;i<=fact;++i){
			num*=i;	
		}	
		System.out.println(num);
// Using while loop:-
// while(i<fact):
// 	fact*=i
// 	print(i)
	}
	public void sum(){
		System.out.println("Enter a number to calculate sum: ");
		int mul = sc.nextInt();
		int s = 0;
		for(int i=1;i<=10;i++){
			s += mul*i;
		}
		System.out.println(s);
	}
	public void HCF(){
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		while (second != 0) {
	        int temp = second;
	        second = first % second;
	        first = temp;
        	}
        System.out.println(first);
    }
    public void LCM(){
      	System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		if(first%second ==0){
			System.out.println("HCF is equal to"+math.max(first,second));
		else{
			int a =0
			while(a==second){
				for(i=1;i<=second;i++){
					a+=first*i;
				}
			System.out.println(a)
		    }
        }
	}
	
}
class Code{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		loops loo= new loops();
		while(true){
			System.out.println("1. Multiplication");
			System.out.println("2. Reverse multiplication");
			System.out.println("3. Factorial");
			System.out.println("4. Sum of Multiples");
			System.out.println("5.HCF");
			int ch = sc.nextInt();
			if(ch==1){
				loo.multiplication();
			}else if(ch==2){
				loo.reverse_mul();
			}else if(ch==3){
				loo.fact();
			}else if(ch==4){
				loo.sum();
			}else if(ch==5){
				loo.HCF();
			}
		}
	}
	

}
