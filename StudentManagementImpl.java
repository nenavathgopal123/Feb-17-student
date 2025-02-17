import java.util.ArrayList;
import java.util.List;

public class StudentManagementImpl  implements StudentManagement{
	
	
	ArrayList<Student> stuList = new ArrayList<Student>();
	
	

	@Override
	public void addStudent(Student stu) {
		
		stuList.add(stu);
		
		
	}

	@Override
	public void deleteStudent(int rollNo) {
		for(int i=0;i<stuList.size();i++) {
			Student stu = stuList.get(i);
			if(rollNo == stu.getRollNo()) {
				System.out.println("successfully deleted Student--->"+stu.getName());
				stuList.remove(i);
			
			}
		
		}
	}

	@Override
	public Student searchStudent(int rollNo) {
		
		for(int i=0;i<stuList.size();i++) {
			Student stu = stuList.get(i);
			if(rollNo == stu.getRollNo()) {
				System.out.println(stu);
				
			}
		
		}
		return null;
	}

	@Override
	public  void displayAll() {
		
		for(int i=0;i<stuList.size();i++) {
			Student stu = stuList.get(i);
			System.out.println(stu);
		}
	}

}