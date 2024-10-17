import authentication.IAuthentication;
import authentication.UserAuthenticationAdapter;
import organization.OrganizationFacade;
import organization.OrganizationFacadeImpl;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("John", "Doe", "johndoe", "password123");

        // Crear el adaptador de autenticación
        IAuthentication authAdapter = new UserAuthenticationAdapter(user);

        // Crear la fachada de la organización
        OrganizationFacade orgFacade = new OrganizationFacadeImpl(authAdapter);

        // Agregar un departamento
        orgFacade.addDepartment("IT");

        // Agregar una oficina al departamento de IT
        orgFacade.addOffice("IT", "Development");

        // Agregar un empleado a la oficina de Development
        orgFacade.addEmployee("Development", user);

        // Autenticar al usuario
        boolean isAuthenticated = orgFacade.authenticateUser("johndoe", "password123");

        // Imprimir el resultado de la autenticación
        System.out.println("User authenticated: " + isAuthenticated);
    }
}