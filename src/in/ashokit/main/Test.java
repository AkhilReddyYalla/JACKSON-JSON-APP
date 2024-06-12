package in.ashokit.main;

import in.ashokit.bean.Employee;
import in.ashokit.utils.JsonUtils;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(100);
		e.setName("akhilreddy");
		e.setSalary(30000);
		String convertJavaToJson = JsonUtils.convertJavaToJson(e);
		System.out.println(convertJavaToJson);

		System.out.println("-------------------");
		Employee emp = JsonUtils.convertJsonToJava(convertJavaToJson, Employee.class);
		System.out.println(emp);
	}

}

//      jackson API
//      Gson API
