package organization;

import java.util.ArrayList;
import java.util.List;

public class Office implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> employees = new ArrayList<>();

    public Office(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        if (component instanceof Employee) {
            employees.add(component);
        } else {
            throw new UnsupportedOperationException("Only employees can be added to an office.");
        }
    }

    @Override
    public void remove(OrganizationComponent component) {
        employees.remove(component);
    }

    @Override
    public OrganizationComponent getChild(int index) {
        return employees.get(index);
    }

    @Override
    public String getName() {
        return name;
    }
}