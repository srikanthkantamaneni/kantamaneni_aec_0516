import java.util.Date;

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
		
		return Student;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
			throws IllegalArgumentException;
		else
		{
			students=Student;
			return students;
		}
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else
		{
				return Student[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else
		{
			Student[index]=student;
			return Student;
		}
	}

	@Override
	public void addFirst(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			Student[0]=student;
			return Student;
		}
	}

	@Override
	public void addLast(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			Student[Student.length]=student;
			return Student;
		}
	}

	@Override
	public void add(Student student, int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else{
			Student[index]=student;
			return Student;
		}
	}

	@Override
	public void remove(int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else
		{
			Student[index]=null;
			return Student;
		}
	}

	@Override
	public void remove(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			Student[student.index]=null;
			return Student;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else
		{
			Student[index]=null;
			return Student;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			Student[student.index]=null;
			return Student;
		}
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>=Student.length)
			throws IllegalArgumentException;
		else
		{
			Student[index]=null;
			return Student;
		}
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			Student[student.index]=null;
			return Student;
		}
	}

	@Override
	public void bubbleSort() {
		for(int i=0;i<Student.length-1;i++)
		{
			for(int j=0;j<Student.length-1;j++)
			{
				if(this.Student[i].id>this.Student[j])
				{
					Student s=this.Student[i];
					this.Student[i]=this.Student[j];
					this.Student[j]=s;
				}
			}
		}		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		Student stud=new Student[];
		int j=0;
		for(i=0;i<Student.length;i++)
		{
			if((Student[i].birthDate==date)||(Student[i].birthDate==(date-1)))
			{
				stud[j]=Student[i];j++;
			}
		}
		return stud;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		if((firstDate==null)||(lastDate==null))
			throws IllegalArgumentException;
		else{
			Student stud=new Student[];
		int j=0;
		for(int i=0;i<Student.length;i++)
		{
			if((Student[i].birthDate<lastDate)&&(Student[i].birthDate>firstDate))
			{
				stud[j]=Student[i];j++;
			}
		}
		return stud;
		}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		Date fdate=date+days;
		Student stud=new Student[];
		int j=0;
		for(int i=0;i<Student.length;i++)
		{
			if((Student[i].birthDate<fdate)&&(Student[i].birthDate>date))
			{
				stud[j]=Student[i];j++;
			}
		}
		return stud;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		if(indexOfStudent==0)
			throws IllegalArgumentException;
		else
		{
			return (Date(new Date())-Student[indexOfStudent].birthDate);
		}
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		Student stud=new Student[];
		int j=0;
		for(int i=0;i<Student.length;i++)
		{
			if((new Date()-Student[i].birthDate)==age)
			{
				stud[j]=Student[i];j++;
			}
		}
		return stud;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		Student stud=new Student[1];
		int i=0;
		stud[0]=Student[i];
		for(i=0;i<Student.length;i++)
		{
			if(Student[i].avgMark>stud[0].avgMark)
			{
				stud[0]=Student[i];
			}
		}
		return stud;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null)
			throws IllegalArgumentException;
		else
		{
			return student.next();
		}
	}
}
