import java.io.*;
import java.util.*;

public class Main {
    
    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;
    }

	public static void solution(String str){
		//basically isme har number 0 to factorial-1 har number appne aap isme
		// is permutation ko carry krta h 
		
		//calculate factorial
		int num = factorial(str.length());
		
		for(int i=0;i<num;i++){
		    
		    int temp = i ; //i ko disturb nhi krenge
		    StringBuilder sb = new StringBuilder(str);
		    for(int div = str.length();div>=1;div--){
		        int q = temp/div;
		        int r = temp%div;
		        
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        
		        temp = q;
		    }
		    System.out.println();
		    
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}