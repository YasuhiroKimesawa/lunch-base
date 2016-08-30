package example.model.User;

/**
 * Created by mac48 on 2016/08/10.
 */
public class User {
    private EmployeeNumber employeeNumber;
    private EmployeePassword employeePassword;

    public User(EmployeeNumber employeeNumber, EmployeePassword employeePassword) {
        this.employeeNumber = employeeNumber;
        this.employeePassword = employeePassword;
    }
}
