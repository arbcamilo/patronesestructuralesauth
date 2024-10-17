package organization;

import user.User;

public class Employee implements OrganizationComponent {
    private User user;

    public Employee(User user) {
        this.user = user;
    }

    @Override
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public OrganizationComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return user.getFirstname() + " " + user.getLastname();
    }
}