import java.util.*;
class intersection{
	public static void main(String [] args){
		int [] arr1 = {1,2,2,1};
		int [] arr2 = {2,2};
		ArrayList<Integer> spare = new ArrayList<>();
		for(int i : arr1){
			for(int j : arr2){
				if( i==j){
					spare.add(i); 
					break;
				}
			}
		}
		System.out.println(spare);
	}
}