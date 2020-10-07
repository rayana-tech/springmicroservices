package day5;

mport org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new AnnotationConfigApplicationContext(EmployeeAnnotation.class);
		EmployeeDetails empCon = (EmployeeDetails)appCon.getBean(EmployeeDetails.class);
		empCon.setEmpID(100);
		empCon.setEmpName("chris");
		empCon.setSalary(100000);
		empCon.display();
	}

}