/**
 * 
 */
package Assignment;
import java.util.Scanner;

/**
 * @author Aaliya Sheikh
 *
 */
public class permutation 
	{
		static void printPermutn(String str,String ans) {
			if(str.length()==0) {
				System.out.println(ans+ " ");
				return;
			}
			for(int i=0;i<str.length();i++) {
				char ch =str.charAt(i);
				String ros=str.substring(0,i)+str.substring(i+1);
				printPermutn(ros,ans+ch);
				
			}
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			printPermutn(s,"");
		}
	}	
