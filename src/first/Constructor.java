package first;

public class Constructor {

	
		
		
			  int x;  // Create a class attribute

			  // Create a class constructor for the Main class
			  public void Main() {
			    x = 5;  // Set the initial value for the class attribute x
			  }

			  public static void main(String[] args) {
			    Constructor myObj = new Constructor(); // Create an object of class Main (This will call the constructor)
			    System.out.println(myObj.x); // Print the value of x
			  }
			
//int newx = myObj.getx();
			// Outputs 5
	}


