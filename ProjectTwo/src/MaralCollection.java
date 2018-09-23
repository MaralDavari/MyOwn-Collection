
public class MaralCollection extends Exception {
	int count = 0;
	int count2 = 0;
	int capacity = 10;
	int indexCount = 0;
	Object[] myArraytwo = new Object[10];
	Object[] myArray = new Object[capacity];

	// getter
	public Object[] getSpecificForinList() {
		return myArraytwo;
	}

	// add new objects
	public void add(Object obj) {
		if (indexCount == myArray.length - 1) {
			makeArrayBigger();
		}
		myArray[indexCount] = obj;
		indexCount++;
	}

	// make array bigger
	public void makeArrayBigger() {
		capacity = capacity * 2;
		Object[] myBiggerArray = new Object[capacity];
		for (int i = 0; i < myArray.length; i++) {
			myBiggerArray[i] = myArray[i];
		}
		myArray = myBiggerArray;
	}

	// size()
	public int size() {
		return indexCount;
	}

	// get capacity
	public int capacity() {
		return capacity;
	}

	// get by index
	public Object get(int index) {
		Object obj = myArray[index];
		return obj;
	}

	// replace
	public void replace(int index, Object obj) {
		myArray[index] = obj;
	}

	// remove
	public void remove(int index) {

		while (myArray.length < index) {
			myArray[index] = myArray[index + 1];
			index = index + 1;
		}

	}

	// show
	public void show(MaralCollection obj) {

		while (obj.hasNext()) {
			System.out.println("Index: " + count2 + " Element: " + obj.get(count2));
			count2++;
		}

		System.out.println("Capacity of list: " + obj.capacity + "\nSize of list: " + obj.size());

	}

	// has next ()

	public boolean hasNext() {

		if (!(myArray[count] == null)) {
			count++;
			return true;
		} else {
			return false;
		}

	}

	public boolean inTheListOrNot(Object object) {

		boolean mybool = false;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == object) {
				mybool = true;
			}
		}

		return mybool;
	}

	public boolean inList(MaralCollection myList, Object object) {
		boolean mybool = false;
		int counterForTesting = 0;
		int countTwo = 0;
		while (myList.hasNext()) {
			if (myList.get(counterForTesting) == object) {
				mybool = true;
				myArraytwo[countTwo] = counterForTesting;
				countTwo++;
			}
			counterForTesting++;
		}

		return mybool;
	}

	// add to Index
	public void addToIndex(int index, Object obj) {

		Object varT = null;
		Object varX = obj;

		for (int i = index; i < myArray.length; i++) {
			varT = myArray[i];
			myArray[i] = varX;
			varX = varT;
			index++;

		}

		indexCount++;

	}

	// add to index 2
	public void addIndexTwo(int index, Object obj) {

		for (int i = indexCount + 1; i > index; i--) {
			myArray[i] = myArray[i - 1];
		}

		myArray[index] = obj;

		indexCount++;

	}

	     // add to index 3
	public void addIndexThree(int index, Object obj) {

		Object[] myNewArrayFormethodThree = new Object[100];

		// copy values before index
		for (int i = 0; i < index; i++) {
			myNewArrayFormethodThree[i] = myArray[i];
		}
		// put the user request
		myNewArrayFormethodThree[index] = obj;

		// copy the rest of values after the user request
		for (int i = index; i < myArray.length; i++) {

			myNewArrayFormethodThree[i + 1] = myArray[i];

		}
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = myNewArrayFormethodThree[i];
		}

		indexCount++;
	}

}
