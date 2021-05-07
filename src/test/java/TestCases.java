import org.junit.Test;

public class TestCases  extends TestPlan{

    @Test
    public void Test() throws InterruptedException {
        mainPage();
        closeCookie();
        logIn();
        search();
        goSecondPage();
        addItem();
        addToBasket();
        addItem2();
        deleteItem();
        checkForDeleted();
        finish();
    }
}
