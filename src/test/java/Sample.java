import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Sample {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @DataProvider(name = "additionNumbers")
    public Object[][] getNumbersData() {
        return new Object[][]{
                {1, 2, 3},
                {-1, -1, -2},
                {1, 0, 1},
                {0, 0, 1},
                {-5, 2, -3}
        };
    }

    @Test(dataProvider = "additionNumbers")
    public void verifyAddition(int num1, int num2, int expectedResult) {
        int result = add(num1, num2);
        Assert.assertEquals(result, expectedResult, "Actual result is not equal to expected result");
    }

    //    Find all the employees that have made-up names
    @Test
    public void verifyThatEmployeesAreReal() {
        Map<String, String> employees = getEmployees();
//        Your code here
    }

    //    Find all the engineer employees
//    Create a list of all engineer types and print it
//    ["Software Engineer", "Billing Engineer", "Engineer" ...]
    @Test
    public void findAllEngineerPositions() {
        Map<String, String> employees = getEmployees();
//        Your code here
    }

    private Map<String, String> getEmployees() {
        final Map<String, String> employeeRegistry = new HashMap<String, String>();
        employeeRegistry.put("John", "Mobile Architect");
        employeeRegistry.put("Peter", "Hat Salesman");
        employeeRegistry.put("Alex", "Jacket Salesman");
        employeeRegistry.put("Akshay", "Software Engineer");
        employeeRegistry.put("Sergii", "Engineer");
        employeeRegistry.put("Yiming", "Billing Engineer");
        employeeRegistry.put("Some Guy", "Architect");
        employeeRegistry.put("Alexa", "Speaker");
        employeeRegistry.put("Gana", "Engineer");
        employeeRegistry.put("Sabari", "Engineer");
        employeeRegistry.put("Other Guy", "Some other job");
        employeeRegistry.put("JSJDJ sdsds", "Some other job");
        return employeeRegistry;
    }
}
