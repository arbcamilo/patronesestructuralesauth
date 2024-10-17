package authentication;

import user.User;

public class UserAuthenticationAdapter implements IAuthentication {
    private User user;

    public UserAuthenticationAdapter(User user) {
        this.user = user;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return user.checkUserNameAndPassword(username, password);
    }
}