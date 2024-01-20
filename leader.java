import java.util.*;
class leader{
	public static void main(String [] args){
		int [] arr = {16,17,5,4,3,2};
		ArrayList<Integer> spare = new ArrayList<>();
		for(int i=0 ;i<arr.length ;i++){
			boolean isLeader = true;
			for(int j = i+1 ; j < arr.length ;j++){
				if(arr[i] <= arr[j]){
					isLeader = false;
				}
			}
			if(isLeader == true){
				spare.add(arr[i]);
			}	
		}
		System.out.println(spare);	
	}
}