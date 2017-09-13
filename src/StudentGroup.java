import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		 Student[] temp = new Student[this.students.length+1];
		 temp[0] = student;
		 for(int i = 1; i < temp.length; i++)
			 temp[i] = this.students[i-1];
		 this.students = temp;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student[] temp = new Student[this.getStudents().length+1];
		 for(int i = 0; i < this.students.length; i++)
			 temp[i] = this.students[i];
		 temp[temp.length - 1] = student;
		 this.students = temp;
	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		 
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		Student[] temp = new Student[this.students.length-1]; 
		 int c = 0;
		 for(int i = 0; i < this.students.length; i++)
			 if(i != index) temp[c++] = this.students[i];
		 this.students = temp;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		Student[] temp = new Student[this.students.length-1]; 
		 int c = 0;
		 for(int i = 0; i < this.students.length; i++)
			 if(this.students[i] != student) temp[c++] = this.students[i];
		 this.students = temp;
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student[] temp = new Student[index]; 
		 int c = 0;
		 for(int i = 0; i < index; i++)
			 temp[i] = this.students[i];
		 this.students = temp; 
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else{
			LinkedList<Student> l1 = new LinkedList<Student>(Arrays.asList(this.students));
			int firstInd = l1.indexOf(student);
			for(int i=firstInd+1;i<l1.size();i++)
				l1.remove(i);
			this.students = l1.toArray(new Student[l1.size()]);
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		else{
			LinkedList<Student> l1 = new LinkedList<Student>(Arrays.asList(this.students));
			for(int i=0;i<index;i++)
				l1.remove(i);
			
		}

		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		LinkedList<Student> l1 = new LinkedList<Student>(Arrays.asList(this.students));
		int c=0;
		if(student == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i=0;i<l1.size();i++)
			{
				if(l1.get(i) == student)
				{
					l1.remove(i);
					c=i;
					break;
				}	
			}
		if(c>0)
		{
			for(int i=0;i<c;i++)
			{
				l1.remove(i);
			}
		}
	}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here

		 
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date == null)
		{
			throw new IllegalArgumentException();
		}
			
		 LinkedList<Student> l1 = new LinkedList<Student>(Arrays.asList(this.students));
		   for(Student s : this.students)
		   {
		       if(s.getBirthDate().compareTo(date) == 0)
				   l1.add(s);
		   }
		   return  l1.toArray(new Student[l1.size()]);
		
		
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
