package org.example.employeeemplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name="EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addEmployee(request,response);
            default:
                showEmployee(request, response);
                break;
        }
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> listEmployee = employeeService.getAllEmployee();
        request.setAttribute("listEmployee", listEmployee);
        request.getRequestDispatcher("employee-list.jsp").forward(request, response);
    }
    private void addEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            String jobPosition = req.getParameter("jobPosition");
            String department = req.getParameter("department");
            double salary = Double.parseDouble(req.getParameter("salary"));

            if (name.isEmpty() || age <= 0 || salary < 0) {
                req.setAttribute("error", "Invalid input data. Please check the form.");
                req.getRequestDispatcher("/add-employee.jsp").forward(req, resp);
                return;
            }


            int id = employeeService.getAllEmployee().size() + 1;
            Employee newEmployee = new Employee(id, name, age, jobPosition, department, salary);


            employeeService.addEmployee(newEmployee);

            resp.sendRedirect("EmployeeServlet?action=list");
        } catch (Exception e) {
            req.setAttribute("error", "Error adding employee. Please check the form data.");
            req.getRequestDispatcher("/add-employee.jsp").forward(req, resp);
        }
    }
}