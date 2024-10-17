package organization;

import user.User;

public interface OrganizationFacade {
    void addDepartment(String name);
    void addOffice(String departmentName, String officeName);
    void addEmployee(String officeName, User user);
    boolean authenticateUser(String username, String password);
}
