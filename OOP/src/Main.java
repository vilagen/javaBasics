import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
		isIPv4Address3("127.122.254.1.5");
	}

	public static void test() {
		Scanner sc = new Scanner(System.in);
		Thing thing = new Thing();
		thing.num = 5;
		thing.word = "hello";

		Thing thing2 = new Thing();
		thing2.num = 21;
		thing2.word = "whatever";

		System.out.println(thing.num + thing2.num);

		thing.foo();
		thing2.foo();

		};

    static void employees() {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.name = "Jeff";
		emp1.age = 32;
		emp1.jobTitle = "Construction Worker";

		emp2.name = "Sarah";
		emp2.age = 28;
		emp2.jobTitle = "Electrician";

		emp3.name = "Bill";
		emp3.age = 37;
		emp3.jobTitle = "Project Manager";

		bar(emp3);
		bar(emp3);
		bar(emp2);
		bar(emp1);

		System.out.println(emp1.age);
		System.out.println(emp2.age);
		System.out.println(emp3.age);
	};

    static void bar(Employee e) {
    	System.out.format("%s is %d years old and is a %s.\n", e.name, e.age, e.jobTitle);
    	e.age = 20;
	}

	static void car() {
		Door dd = new Door();
		dd.name = "Driver";
		dd.open();
		dd.printStatus();

		Door pd = new Door();
		pd.name = "Passenger";
		pd.printStatus();
		pd.open();
		pd.printStatus();
		dd.close();
		dd.printStatus();
	}

	static void rectangle() {
		Rectangle r1 = new Rectangle(7, 9);
//		r1.setHeight(5);
//		r1.setWidth(9);

		// to show that with the 'if' statement, Width wouldn't change when
		// less than 1.
//		r1.setWidth(-3);

		System.out.format("r1 height: %d and r1 width: %d\n", r1.getHeight(), r1.getWidth());
		System.out.format("r1 area: %d\n", r1.getArea());
		System.out.format("r1 perimeter: %d\n", r1.getPerimeter());
//		System.out.format("r1 height: %d\n", r1.getHeight());
//		System.out.println("r1 height: " + r1.getHeight());

		Rectangle r2 = new Rectangle(7, 9);
//		r2.setHeight(8);
//		r2.setWidth(4);

		System.out.println("r2 height: " + r2.getHeight() + " r2 width: " + r2.getWidth());
		System.out.println("r2 area: " + r2.getArea());
		System.out.println("r2 perimeter: " + r2.getPerimeter());
	};

	static void learnArrayList() {
		// an ArrayList can be dynamic, meaning it will grow and shrink
		// to how large or small we want it to be, unlike standard arrays
		// which makes you create a length to a certain amount.
		ArrayList<String> sal = new ArrayList<String>();
		sal.add("toaster"); // this is like sal.push() for javascript, it's adding "toaster" to next item on the array.
		sal.add("fridge");
		sal.add("kettle");
		sal.remove(1); // to remove a the item on index 1, which would be fridge.
		// what is nice about remove is, like javascript splice(), which an item is removed,
		// it will move the rest of the items to the next index, instead of staying in place.
		sal.add("fridge");
		sal.remove("fridge"); // this will do what remove does,
		// just simply looks for that string instead of index number.
		sal.add("fridge");
		sal.indexOf("kettle");
		System.out.println(sal.contains("toaster")); // looks for if an element is in an list.
		System.out.println(sal.contains("microwave")); // would return false because not in the list.
		System.out.println(sal.get(1)); // this returns whatever is in that index.
		sal.set(1, "microwave"); // like javascript splice(), can place the item in specific location of arraylist.
		System.out.println(sal.get(1));
		System.out.println(sal.size()); // will tell us how many items in array, not at what index it's at.
	};

	static void composition() {

		Student student = new Student();
		student.setName("Joe Blogs");
		student.setDateOfBirth("30/06/1998");
		student.setHasStudentHousing(false);
//		student.course = new Course();
//		student.course.title = "Computer Science";
//		student.course.level = "Undergraduate";
//		student.course.startDate = "07/09/2021";
		student.setCourse(new Course());
		student.getCourse().setTitle("Computer Science");
		student.getCourse().setLevel("Undergraduate");
		student.getCourse().setStartDate("07/09/2021");

		Course c = student.getCourse();
		c.setTitle("Computer Science");

		System.out.format("Name: %s\n", student.getName());
		System.out.format("Date of Birth: %s\n", student.getDateOfBirth());
		System.out.format("Housing: %s\n", student.hasStudentHousing() ? "Yes" : "No");
//		System.out.println("The student " + student.getName() + " is enrolled on the " + student.course.title + " course due to start on " + student.course.startDate + ".");
		System.out.println("The student " + student.getName() + " is enrolled on the " + c.getTitle() + " course due to start on " + c.getStartDate() + ".");
	}

	static boolean isIPv4Address(String inputString) {
		String[] ipNum = inputString.split("[.]");
		if (ipNum.length > 4) {
			System.out.println("False 1");
			return false;
			}

		for (String s : ipNum) {
			System.out.println(s);

//			String[] ipArray = s.split("");
//			if (ipArray.length > 1 && ipArray[0].equals("0")) {
//				System.out.println("False 2");
//				return false;
//			}
			if (!s.matches("[0-9]{1,3}")) {
				System.out.println(s);
				System.out.println("False 3");
				return false;
			}
			if (parseInt(s) < 0 || parseInt(s) > 255) {
				System.out.println("False 4");
				return false;
			}
		}

		System.out.println("True");
		return true;
	};

	static boolean isIPv4Address2(String inputString) {
		String[] splitString = inputString.split("[.]");
		if (splitString.length > 4) {
			return false;
		}
		for (String string : splitString) {

			System.out.println(string);

			if (string.isEmpty()) {
				return false;
			}
			if (!string.matches("[0-9]{1,3}")) {
				return false;
			}
			int number = Integer.parseInt(string);
			if (!(number >= 0 && number <= 255)) {
				return false;
			}
		}
		return true;
	}

	static boolean isIPv4Address3(String inputString) {
		String[] ipArray = inputString.split("[.]");

		if( ipArray.length > 3) {
			System.out.println("Test 1");
			return false;
		};

		for(int i = 0; i<ipArray.length; i++) {

			System.out.println(ipArray[i]);

			if(ipArray[i].isEmpty()){
				System.out.println("Test 2");
				return false;
			}
			if(!ipArray[i].matches("[0-9]{1,3}") ) {
				System.out.println("Test 3");
				return false;
			}
			else if( Integer.parseInt(ipArray[i]) < 0 || Integer.parseInt(ipArray[i]) > 255) {
				System.out.println("Test 4");
				return false;
			}
		}

		return true;

	}

};