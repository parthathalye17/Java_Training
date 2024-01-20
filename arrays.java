import java.util.*;
class arrays{
	Scanner sc = new Scanner(System.in);
	public void sum(){
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		System.out.println("Enter the elements of an array: ");
		int s =0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int num:numbers){
        	s+=num;
        }
     	System.out.println(s);
    }
    public void average(){
    	System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		System.out.println("Enter the elements of an array: ");
		int s=0;
		int avg =0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int num:numbers){
        	s+=num;
        	avg = s/size;
        }
        System.out.println(avg);
    }
    public void max_min(){
    	System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		System.out.println("Enter the elements of an array: ");
		int max = 0;
		int min = 0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();

        	if(numbers[i]>max){
        		max = numbers[i];
        		
        	}
        	if(numbers[i]<min){
        		min = numbers[i];
        	}
        	System.out.println("Maximum is "+max);
        	System.out.println("Minimum is "+min);
        }
    }
    public void reverse(){
    	System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		System.out.println("Enter the elements of an array: ");
		int max = 0;
		int min = 0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int j=size-1;j>=0;--j){
        	System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
    public void even_odd(){
    	System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] numbers = new int [size];
		System.out.println("Enter the elements of an array: ");
		int [] odd = new int [size];
		int [] even= new int [size];
		int evenCount= 0;
		int oddCount = 0;
		for(int i=0;i<size;i++){
			System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();
            if(numbers[i]%2 == 0){
            	even[evenCount] = numbers[i];
            	evenCount++;
            }else{
            	odd[oddCount] = numbers[i];
            	oddCount++;

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        
class Array{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		arrays arr = new arrays();
		System.out.println("1. Sum of Elements.");
		System.out.println("2.Average of Elements");
		System.out.println("3.Max and Min of the Elements.");
		System.out.println("4.Reverse of the Array.");
		System.out.println("5.Even and Odd Numbers.");
		int ch = sc.nextInt();
		if(ch==1){
			arr.sum();
		}
		if(ch==2){
			arr.average();
		}
		if(ch==3){
			arr.max_min();
		}
		if(ch==4){
			arr.reverse();
		}
		if(ch==5){
			arr.even_odd();
		}
	}
	
}
