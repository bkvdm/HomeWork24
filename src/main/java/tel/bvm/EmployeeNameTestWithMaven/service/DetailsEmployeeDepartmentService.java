//package tel.bvm.EmployeeNameTestWithMaven.service;
//
//public interface DetailsEmployeeDepartmentService {
//}
package tel.bvm.EmployeeNameTestWithMaven.service;

import tel.bvm.EmployeeNameTestWithMaven.scheme.Employee;

import java.util.Map;

public interface DetailsEmployeeDepartmentService {
    Employee maxWageDepartment(Integer departmentNumber);

    Map<String, Employee> allEmployeeInfo();

    Employee minWageDepartment(Integer departmentNumber);

    String allEmployeeGroup(Integer department);
}
