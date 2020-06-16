import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @DataProvider(name = "additionNumbers")
    public Object[][] getNumbersData() {
        return new Object[][] {
                {1, 2, 3},
                {-1, -1, -2},
                {1, 0, 1},
                {0, 0, 1},
                {-5, 2, -3}
        };
    }

    @Test (dataProvider = "additionNumbers")
    public void verifyAddition(int num1, int num2, int expectedResult) {
        int result = add(num1, num2);
        Assert.assertEquals(result, expectedResult, "Actual result is not equal to expected result");
    }
}
