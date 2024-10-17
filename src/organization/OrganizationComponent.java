package organization;

import java.util.ArrayList;
import java.util.List;

public interface OrganizationComponent {
    void add(OrganizationComponent component);
    void remove(OrganizationComponent component);
    OrganizationComponent getChild(int index);
    String getName();
}