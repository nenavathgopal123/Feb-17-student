
public class Student1 {
	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", college=" + college
				+ ", course=" + course + ", fee=" + fee + "]";
	}

	public Student1(int rollNo, String name, char grade, String college, String course, int fee) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.college = college;
		this.course = course;
		this.fee = fee;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	private int rollNo;
	private String name;
	private char grade;
	private String college = "StPetersEnggCollege";
	private String course;
	private int fee;

	public static void main(String[] args) {

	}

}
