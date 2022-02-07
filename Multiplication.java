import java.util.Scanner;
public class Multiplication {
	
	public static void main(String[] args) {
		// Write your code here
       
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
	}
}