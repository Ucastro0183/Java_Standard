package Java_standard;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * File: Fibonacci.java<br>
 * This program shows the Fibonacci sequence in the 
 * console window.
 * @author ucastro
 */
public class Fibonacci {

	public static void main(String[] args) {
		// present the message
		int n=10;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("Enter fibonacci's length: ");
	        try{
	            n = Integer.parseInt(br.readLine());
	            break;
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!\n");
	        } catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		long[] fib = new long[n];
		int i = 0;
		
		fib[1]=1;
		for (i=2;i<n;i++){
			fib[i]=fib[i-2]+fib[i-1]; 
		}
		for (i=0;i<n;i++){
			System.out.print(fib[i]);
			if (i!=(n-1)) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
	}

}
