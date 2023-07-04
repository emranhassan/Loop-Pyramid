package forLoop;

public class Pyramid {

	public static void main(String[] args) {
		
	

		
// Number of rows in the triangle
//  1
// 234
//56789

		
		
		 int rowCount = 3;
	        int num = 1; 
	        
	        for (int i = 1; i <= rowCount; i++) {
	            for (int j = 1; j <= rowCount - i; j++) {
	                System.out.print(" "); 
	            }
	            
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(num + "");
	                num++;
	            }
	            
	            System.out.println();
	        }
	
	}

}
