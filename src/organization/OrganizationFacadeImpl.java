package organization;

import authentication.IAuthentication;
import user.User;

import java.util.HashMap;
import java.util.Map;

public class OrganizationFacadeImpl implements OrganizationFacade {
    private Map<String, Department> departments = new HashMap<>();
    private IAuthentication authentication;

    public OrganizationFacadeImpl(IAuthentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public void addDepartment(String name) {
        departments.put(name, new Department(name));
    }

    @Override
    public void addOffice(String departmentName, String officeName) {
        Department department = departments.get(departmentName);
        if (department != null) {
            department.add(new Office(officeName));
        }
    }

    @Override
    public void addEmployee(String officeName, User user) {
        for (Department department : departments.values()) {
            for (int i = 0; i < department.getChildCount(); i++) {
                OrganizationComponent office = department.getChild(i);
                if (office instanceof Office && office.getName().equals(officeName)) {
                    office.add(new Employee(user));
                    return;
                }
            }
        }
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        return authentication.authenticate(username, password);
    }
}