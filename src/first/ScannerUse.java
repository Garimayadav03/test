package first;

		import java.util.Scanner;
		public class ScannerUse{
		public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("What's your first name?");
		String name = scan. next ();
		System.out.println("What's your age?");
		int age = scan. nextInt();
		scan.nextLine();
		System.out.println("What's your thought of the day?");
		String quote = scan.nextLine();
		System.out.println("Thank you " + name + "," + "you are "  + " years old");
		System.out.println("and your senior quote is"+ quote);

	}

}
