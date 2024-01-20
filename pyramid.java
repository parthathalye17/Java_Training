import java.util.Scanner;
class pyramid{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		int rows = 5;
		int i,j;
		for(i=0;i<rows;i++){
			for (j=0;j<rows-1;i++){
				System.out.print("");
			}
			for (int k = 0; k < 2 * i + 1; k++){
                System.out.print(c);
            }
		}
	}
}