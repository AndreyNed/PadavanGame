package by.htp.padavan;

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
		this.students = new Student[ length ];
	}

	public StudentGroup() {

	}

	public StudentGroup(Student[] students) {
		super();
		this.students = students;
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if ( index > -1 && index < students.length && students[ index ] != null ) {
			return students[ index ];
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		if ( student == null || index < 0 || ( index > students.length - 1 ) ) {
			throw new IllegalArgumentException();
		}
		students[ index ] = student;
	}

	@Override
	public void addFirst(Student student) {
		if ( student == null ) {
			throw new IllegalArgumentException();
		}
		if ( students == null ) {
			students = new Student[ 1 ];
		}
		if ( students[ 0 ] == null ) {
			students[ 0 ] = student;
		} else {
			Student[] newStudents = new Student[ students.length + 1 ];
			newStudents[ 0 ] = student;
			for ( int i = 1; i < newStudents.length; i++ ) {
				newStudents[ i ] = students[ i - 1 ];
			}
		}
	}

	@Override
	public void addLast(Student student) {
		if ( student == null ) {
			throw new IllegalArgumentException();
		}
		if ( students == null ) {
			students = new Student[ 1 ];
		}
		if ( students[ students.length -1 ] == null ) {
			students[ students.length - 1 ] = student;
		} else {
			Student[] newStudents = new Student[ students.length + 1 ];
			for ( int i = 0; i < students.length; i++ ) {
				newStudents[ i ] = students[ i ];
			}
			newStudents[ students.length ] = student;
			students = newStudents;
		}
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
		if ( students != null && students.length > 1 ) {
			for ( int i = 0; i < students.length - 1; i++ ) {
				Student s1 = students[ i ];
				for ( int j = i + 1; j < students.length; j++ ) {
					if ( s1.compareTo( students[ j ] ) < 0 ) {
						students[ i ] = students[ j ];
						students[ j ] = s1;
					}
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		return students;

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		return students;

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		return students;

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		return indexOfStudent;

	}

	@Override
	public Student[] getStudentsByAge(int age) {
		return students;

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		return students;

	}

	@Override
	public Student getNextStudent(Student student) {
		return student;

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {
		return 0;

	}

	private int getDiffYears(Date first, Date last) {
		return 0;

	}

	private Calendar getCalendar(Date date) {
		return null;

	}

}
