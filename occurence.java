/**
 * 
 */
package Assignment;
import java.util.Scanner;
import java.util.*;

/**
 * @author Aaliya Sheikh
 *
 */
/**
* This is the occurence program 
* which is find the number of occurence of a character 
* 
*/
public class occurence
	{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the article");
			String scr1=sc.nextLine();
			System.out.println("enter the word");
			String scr2=sc.nextLine();
			String temp="";
			int count=0;
			for (int i=0;i<scr1.length();i++) {
				if(scr1.charAt(i)!=' ') 
				{
					temp=temp+scr1.charAt(i);
				}	
				else {
					if(scr2.equals(temp)) {
						count++;
					}
					temp=" ";
				}
			}
			if(scr2.equals(temp)) {
				count++;
			}
			System.out.println(count);}
	}
