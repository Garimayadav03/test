package first;

public class Statkey {
	//int eid;
	//int salary;
	//static String ceo;
	
 static int ant = 5;
	
	

	public static void main(String[] args) {
		Statkey a = new Statkey();
		Statkey ab = new Statkey();
		
		int b= 12;
		System.out.println(a.ant);
		
		a.ant = 14;
		ab.ant=34;
	
		System.out.println(a.ant);
		System.out.println(ab.ant);

	}

}
