
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaralCollection myList = new MaralCollection();
		myList.add("Sam");
		myList.add("Susan");
		myList.add("Bob");
		myList.add("Toufik");
		myList.add("ChinChin");
		myList.add("Hicham");


		
		 myList.show(myList);

		 //true or false
	    System.out.println(myList.inTheListOrNot("Hector"));

	}

}

