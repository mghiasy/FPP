package FPPProject;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size >= strArray.length) {
			resize();
		}
		strArray[size] = s;
		size++;

	}

	public String get(int i) {
		if (i <= size && i > 0)
			return strArray[i];
		else
			return "selected index is out of band";
	}

	public boolean find(String s) {
		for (String string : strArray) {
			if (string == s) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (strArray[i] == s) {
				index = i;
				for (int j = index; j < size; j++) {
					strArray[j] = strArray[j + 1];
				}
				size--;
				return true;
			}
		}

		return false;
	}

	private void resize() {
		String[] temp = new String[strArray.length * 2];
		if (size == strArray.length) {
			System.arraycopy(strArray, 0, temp, 0, strArray.length);
		}
		strArray = temp;

	}

	public String toString() {
		String temp = "[";
		for (int i = 0; i < size; i++) {
			temp += strArray[i];
			if (i == size - 1) {
				temp += "]";
			} else {
				temp += ",";
			}

		}
		return temp;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		// copy test code and run it
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);

		System.out.println(l.get(-2));
	}

}
