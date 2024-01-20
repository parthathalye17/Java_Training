import java.util.*;
class MatrixAdd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int column = sc.nextInt();
		sc.nextLine();
		System.out.println("Choose the operation: ");
		String operation = sc.nextLine();
		int [][] resultMatrix = performAdd(row,column,sc,operation);
		System.out.println("Result is : ");
		displayMatrix(resultMatrix);
	}
	static void inputElements(int [][] matrix,Scanner sc){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.println("Enter the elements at("+i+","+j+") for the a 2x2 matrix");
				matrix[i][j] = sc.nextInt();
			}	
	    }  
    }
    static void displayMatrix(int [][] matrix){
    	for(int [] i:matrix){
    		for(int j:i){
    			System.out.print(j+ " ");
    		}
    		System.out.println();
    	}
    }
    static int [][]performAdd(int row,int column,Scanner sc, String operations){
    	int [][] result = new int[row][column];
    	int [][] matrix1 =new int[row][column];
    	int [][] matrix2 =new int[row][column];
        System.out.println("Enter elements for the first matrix:");
        inputElements(matrix1, sc);
        System.out.println("Enter elements for the second matrix:");
        inputElements(matrix2, sc);
		if(operations.equals("add")){
			for(int i=0;i<row;i++){
    			for(int j=0;j<column;j++){
    			result[i][j]=matrix1[i][j] + matrix2[i][j];
    			}
    		}
    	}else if(operations.equals("subtract")){
    		for(int i=0;i<row;i++){
    			for(int j=0;j<column;j++){
    				result[i][j]=matrix1[i][j]- matrix2[i][j];
    			}
    		}
    	}else if(operations.equals("multiply")){
    		for(int i=0;i<row;i++){
    			for(int j=0;j<column;j++){
    				result[i][j] = matrix1[i][j]*matrix2[j][i];
    			}
    		}
    	}
    	return result;
	}
}	