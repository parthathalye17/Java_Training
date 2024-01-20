import java.util.*;
class character{
	public void Vowel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter to check: ");
		char inp = sc.next().charAt(0);
		if(inp == 'a'|| inp == 'e'|| inp== 'i'||inp =='o'||inp =='u'||inp =='A'||inp =='E'||inp =='I'||inp =='O'|| inp =='U'){
			System.out.println("The letter is a vowel.");
		}else{
			System.out.println("The letter is not a vowel.");
		}
	}
	public void ArrayVowel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		char [] letters = new char [size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            letters[i] = sc.next().charAt(0);
            System.out.println(letters + " ");
        }
        for(int j=0;j<size;j++){    
            if(letters[j] == 'a'|| letters[j] == 'e'|| letters[j]== 'i'||letters[j] =='o'||letters[j] =='u'||letters[j] =='A'||letters[j] =='E'||letters[j] =='I'||letters[j] =='O'|| letters[j] =='U'){
				System.out.println("The letter is a vowel.");
			}else{
				System.out.println("The letter is not a vowel.");
			}
        }
	}
	public void upperLower(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		char [] letters = new char [size];
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            letters[i] = sc.next().charAt(0);
		}
		System.out.println(letters + " ");
		for(int j=0;j<size;j++){
			char ch = letters[j];
			if (Character.isUpperCase(ch)){
                letters[j] = Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                letters[j] = Character.toUpperCase(ch);
            }
        System.out.println(letters);
		}
	}
}
class Characters{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		character cha = new character();
		System.out.println("1. Check for Vowel.");
		System.out.println("2. Check for Vowels inside an Array.");
		System.out.println("3. Convert UpperCase to lower Case.");
		int ch = sc.nextInt();
		if(ch==1){
			cha.Vowel();
		}
		if(ch==2){
			cha.ArrayVowel();
		}
		if(ch==3){
			cha.upperLower();
		}
	}
}	
