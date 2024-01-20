import java.util.*;
class power3{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int answer = 0 ;
		for(int i = 0; i<=3;i++){
			if(n%3 == 0);{
				if(n%3 ==0){
					answer= n/3;
				}else{
					System.out.println("Not a power of 3. ");
				}
				return;
			}
		}	
		if(answer == 1){
			System.out.println("It is a power of 3");
		}else{
			System.out.println("Not a power of 3.");
		}
	}
}	