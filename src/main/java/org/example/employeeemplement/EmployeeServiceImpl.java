package org.example.employeeemplement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class EmployeeServiceImpl implements EmployeeService {
    private static final Map<Integer, Employee> employees;
    static {
        employees = new HashMap<>();
        employees.put(1, new Employee(1, "Nguyễn Chí Anh", 20, "Tổng giám đốc","Phòng giám đốc",99999.0));
        employees.put(2, new Employee(2, "Nguyễn Chí Khánh", 19, "Trưởng phòng vệ sinh","Cả công ty",1000.0));
        employees.put(3, new Employee(3, "Nguyễn Chí Sâm", 19, "Trưởng phòng bảo vệ","Bãi gửi xe và cả công ty",1000.0));
        employees.put(4, new Employee(4, "Nguyễn Chí Trang", 19, "Nhân viên quèn","Đáy xã hội",999.0));
    }
    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees.values());
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }
    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
    @Override
    public void updateEmployee(int id, Employee employee) {
        employees.put(employee.getId(), employee);
    }
    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }
}