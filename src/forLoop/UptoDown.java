package forLoop;

public class UptoDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rowCount = 3; // Number of rows in the triangle
        int num = 1; // Starting number
        
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= rowCount - i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

	}

}
