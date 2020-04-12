import java.util.*
class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;


	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int sumPoints=0;
		int amountLabs=0;
		for (int n:labPoints) {
			sumPoints+=n;
			amountLabs++;
		}
		return (double)(sumPoints/amountLabs);
	}

	public int ECTSCredits() {
		//TODO
		int totalCredits = 0;
		for(Integer grade:grades){
			if(grade>5){
				totalCredits += 6;
			}
		}
		return totalCredits;
	}
}

class Faculty{
	List<Student> students;

	public Faculty(List<Student> students) {
		this.students = students;
	}
	public void addStudent(Student newStudent) {
		this.students.add(newStudent)
	}
	public void removeStudent (Student removeStudent) {
		for(int i=0; i<students.size(); i++){
			if(students.get(i).getIndex == removeStudent.getIndex()){
				students.remove(i);
			}
		}
	}
	public float averageStudents(){
		float sumAverage = 0;
		for(Student student:students){
			sumAverage += student.getAverage();
		}
		return sumAverage/students.size();
	}
	public float averageCredits(){
		float sumECTS = 0;
		for (Student student:students){
			sumECTS += student.ECTSCredits();
		}
		return sumECTS/students.size();
	}
}