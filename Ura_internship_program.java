package group_work17;
import java.util.Scanner;
public class Ura_internship_program {

	public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);
	String again="Yes";
		while(again.equalsIgnoreCase("Yes")) {
			System.out.println("Enter Your Name:");
			String name =scanner.nextLine();
			System.out.print("Enter Your Age:");
	int age = scanner.nextInt();
		System.out.println("Are You A Ugandan?(yes/no):");
			String citizen =scanner.next();
				System.out.println("Do You Have A Second Class Upper CGPA Or Better?(yes/no):");
			String CGPA = scanner.next();
		String ageCheck =(age>=18)?"ok":"Not ok";
				String citizenCheck =citizen.equalsIgnoreCase("Yes")?"ok":"not ok";
				String CGPAcheck =CGPA.equalsIgnoreCase("Yes")?"ok":"not ok";
	System.out.println("Age requirement"+ ageCheck);
		System.out.println("Citizen requirement"+citizenCheck);
			System.out.println("CGPA requirement"+ CGPAcheck);
	boolean eligible = ageCheck.equals("ok")&& citizenCheck.equals("ok")&& CGPAcheck.equals("ok");
		String result = eligible? "You Qualify For The Internship!":"You Do Not Qualify For The Internship.";
	System.out.println(result);
		System.out.println("Check Your Email");
		   again = scanner.next();
	System.out.println("Thank You");
		}
	}	
}
