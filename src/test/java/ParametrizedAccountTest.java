import static org.junit.Assert.assertEquals;

import constants.NamesForAccountTest;
import io.qameta.allure.Description;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizedAccountTest {
    private final String name;
    private final boolean expected;


    public ParametrizedAccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameters (name = "Тестовые данные: Имя - \"{0}\", Ожидаемый результат - {1}")
    public static Collection<Object[]> checkMethodResult() {
        return Arrays.asList(new Object[][]{
                {NamesForAccountTest.NAME_ENDS_WITH_WHITESPACE, false},
                {NamesForAccountTest.NAME_STARTS_WITH_WHITESPACE, false},
                {NamesForAccountTest.NAME_LENGTH_EQUALS_3, true},
                {NamesForAccountTest.NAME_LENGTH_EQUALS_19, true},
                {NamesForAccountTest.NAME_LENGTH_LESS_THEN_3_BY_1, false},
                {NamesForAccountTest.NAME_LENGTH_MORE_THEN_19_BY_1, false},
                {NamesForAccountTest.NAME_WITHOUT_WHITESPACE, false}
        });
    }

    @Test
    @Description("Требования для имени владельца:\n "
            + "- в строке не меньше 3 и не больше 17 символов,\n"
            + "- в строке есть только один пробел,\n"
            + "- пробел стоит не в начале и не в конце строки")
    public void checkExpectedAndActualResult() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Incorrect result", expected, actual);
    }
}
