/*
 * Accadgild , module 2 , Assignment - 1
 * Simple program to detect the eligibility for voting
 */
public class Assign1 {
	public static void main(String[] args) {
		int age = 18;
		System.out.println("Enter your age : " + age );
		
		if (age < 18){
			System.out.println("\nYou are not eligible to vote");
		}else{
			System.out.println("\nYou are eligible to vote");
		}
	}
}
