import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeEach
    public void perpareEachTest() {
        System.out.println();
    }
    @AfterEach
    public void prepareAfterEachTest() {
        System.out.println();
    }

    @Test
    public void junitTest1() {

    }

    @Test
    public void junitTest2() {

    }

    @Test
    public void junitTest3() {

    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }


    @AfterAll
    static void afterTotal() {
        System.out.println("모든 테스트 수행 후 마지막 작업");
    }
}
