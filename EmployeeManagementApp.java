import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }
}

public class EmployeeManagementApp {
    private static List<Employee> employees;

    public static void main(String[] args) {
        employees = new ArrayList<>();

        // Khởi tạo 10 nhân viên mẫu
        initializeEmployees();

        // Hiển thị danh sách 10 nhân viên ban đầu
        displayEmployeeList();

        // Thêm một nhân viên mới
        addEmployee();

        // Xóa một nhân viên
        deleteEmployee();

        // Hiển thị danh sách nhân viên sau khi thêm và xóa
        displayEmployeeList();
    }

    private static void initializeEmployees() {
        employees.add(new Employee(1, "John Doe", 30, "IT", "JD001", 5000.0));
        employees.add(new Employee(2, "Jane Smith", 35, "Sales", "JS001", 4500.0));
        employees.add(new Employee(3, "David Johnson", 28, "Marketing", "DJ001", 4800.0));
        employees.add(new Employee(4, "Emily Davis", 32, "HR", "ED001", 5200.0));
        employees.add(new Employee(5, "Michael Wilson", 40, "Finance", "MW001", 5500.0));
        employees.add(new Employee(6, "Sophia Brown", 27, "IT", "SB001", 5100.0));
        employees.add(new Employee(7, "Daniel Miller", 33, "Sales", "DM001", 4700.0));
        employees.add(new Employee(8, "Olivia Taylor", 31, "Marketing", "OT001", 4900.0));
        employees.add(new Employee(9, "James Anderson", 29, "HR", "JA001", 5300.0));
        employees.add(new Employee(10, "Ava Thomas", 36, "Finance", "AT001", 5600.0));
    }

    private static void displayEmployeeList() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Tên: " + employee.getName());
            System.out.println("Tuổi: " + employee.getAge());
            System.out.println("Phòng ban: " + employee.getDepartment());
            System.out.println("Mã: " + employee.getCode());
            System.out.println("Tỷ lệ lương: " + employee.getSalaryRate());
            System.out.println("--------------------");
        }
    }

    private static void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thêm một nhân viên mới:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng new line sau khi nhập số nguyên

        System.out.print("Tên: ");
        String name = scanner.nextLine();

        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Phòng ban: ");
        String department = scanner.nextLine();

        System.out.print("Mã: ");
        String code = scanner.nextLine();

        System.out.print("Tỷ lệ lương: ");
        double salaryRate = scanner.nextDouble();

        Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
        employees.add(newEmployee);

        System.out.println("Nhân viên đã được thêm vào danh sách.");
    }

    private static void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Xóa một nhân viên:");
        System.out.print("Nhập ID của nhân viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean isDeleted = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                isDeleted = true;
                System.out.println("Nhân viên có ID " + id + " đã được xóa khỏi danh sách.");
                break;
            }
        }

        if (!isDeleted) {
            System.out.println("Không tìm thấy nhân viên có ID " + id + " trong danh sách.");
        }
    }
}