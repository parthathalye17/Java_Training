import java.util.Scanner;
class pattern{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
		char val = sc.next().charAt(0);
		int rows = 5;
		int i,j;
		for(i=0;i<rows;i++){
			for(j=0;j<=i;j++){
				System.out.print(val);
			}
			System.out.println(val);
		}	
	}
}