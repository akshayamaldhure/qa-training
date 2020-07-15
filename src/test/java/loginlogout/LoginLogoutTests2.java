package loginlogout;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginLogoutTests2 {

    @Test(priority = 1, groups = {"smoke"})
    @Parameters({"username", "password"})
    public void testLoginSuccess(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Test(priority = 2, groups = {"regression", "sanity"})
    @Parameters({"username", "password"})
    public void testLoginFailure2(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Test(groups = {"smoke", "sanity", "regression", "anotherGroupName"})
    @Parameters({"username", "password"})
    public void testSomethingElse(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

}
