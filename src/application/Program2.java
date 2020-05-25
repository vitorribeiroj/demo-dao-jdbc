package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		
		System.out.println("=== TEST 1: department findById ====");
		
		Department dep = departmentDao.findById(2);
		
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department findAll ====");
		
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("=== TEST 3: department deleteById ====");
		
		departmentDao.deleteById(6);
		
		System.out.println("Delete completed!");
		
		*/
		
		System.out.println("=== TEST 4: department insert ====");
		
		Department department = new Department(null,"Travel");
		
		departmentDao.insert(department);
		
		System.out.println("Insert completed!");
		
		
	}

}
