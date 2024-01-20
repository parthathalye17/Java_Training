import java.util.*;
class Strings{
	public void Vowel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
        String words = sc.nextLine();
        char[] stored = words.toCharArray();
        for(int i = 0; i<stored.length;i++){
        	if(stored[i] == 'a'|| stored[i] == 'e'|| stored[i]== 'i'||stored[i] =='o'||stored[i]=='u'||stored[i] =='A'||stored[i] =='E'||stored[i] =='I'|| stored[i] =='O'|| stored[i] =='U'){
				System.out.println("The letter " + i+" is a vowel.");
			}else{
				System.out.println("The letter "+ i+" is not a vowel.");
        	}
        }
	}
	public void reverse_string(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
        String words = sc.nextLine();
        char[] stored = words.toCharArray();
        String spare = "";
        for(int i =stored.length-1;i>=0;--i){
        	spare+=stored[i];
        	System.out.println(spare);
        }
	}
	public void palindrome(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
        String words = sc.nextLine();
        char[] stored = words.toCharArray();
        String spare ="";
        for(int i =stored.length-1;i>=0;--i){
        	spare+=stored[i];
        }
        if(spare.equals(words)){
        	System.out.println("Palindrome alert!");
        }else{
        	System.out.println("Not a palindrome.");
        }

    }
}
class Check{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Strings stg = new Strings();
		System.out.println("1. Check for Vowel inside a String. ");
		System.out.println("2. Reverse a String. ");
		System.out.println("3. Check for Palindrome. ");
		int ch = sc.nextInt();
		if(ch==1){
			stg.Vowel();
		}
		if(ch==2){
			stg.reverse_string();
		}
		if(ch==3){
			stg.palindrome();
		}
	}
}
