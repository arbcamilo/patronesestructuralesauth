package organization;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public OrganizationComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    public int getChildCount() {
        return components.size();
    }
}