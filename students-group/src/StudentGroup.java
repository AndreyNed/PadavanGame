import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	public StudentGroup(int length) {

	}

	@Override
	public Student[] getStudents() {

	}

	@Override
	public void setStudents(Student[] students) {

	}

	@Override
	public Student getStudent(int index) {

	}

	@Override
	public void setStudent(Student student, int index) {

	}

	@Override
	public void addFirst(Student student) {

	}

	@Override
	public void addLast(Student student) {

	}

	@Override
	public void remove(int index) {

	}

	@Override
	public void remove(Student student) {

	}

	@Override
	public void removeFromIndex(int index) {

	}

	@Override
	public void removeFromElement(Student student) {

	}

	@Override
	public void removeToIndex(int index) {

	}

	@Override
	public void removeToElement(Student student) {

	}

	@Override
	public void bubbleSort() {

	}

	@Override
	public Student[] getByBirthDate(Date date) {

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {

	}
}