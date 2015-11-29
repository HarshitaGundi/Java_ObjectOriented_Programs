package cs520.hw2.part1;

/**
 * Class to instantiate two courses and compare their tuition
 */
public class TuitionObjectStyle {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java",100,5); //instantiate first course
		Course course2 = new Course("Python",200,6); //instantiate second course
		course1.compare(course2);// Compare method is used to compare tuition of course1 and course2
	}
}
