import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import constants.NamesForAccountTest;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class AccountTest {

    @Test
    @DisplayName("Проверка, что для наименования с длинной менее 3 символов выдаст false")
    public void checkThatFalseWhenNameLengthLessThenThreeByOne() {
        Account account = new Account(NamesForAccountTest.NAME_LENGTH_LESS_THEN_3_BY_1);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что для наименования с длинной равной 3 символам выдаст true")
    public void checkThatTrueWhenNameLengthEqualsThree() {
        Account account = new Account(NamesForAccountTest.NAME_LENGTH_EQUALS_3);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что для наименования с длинной равной 17 символам выдаст true")
    public void checkThatTrueWhenNameLengthEqualsSeventeen() {
        Account account = new Account(NamesForAccountTest.NAME_LENGTH_EQUALS_19);
        assertTrue(account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка, что для наименования с длинной равной 18 символам выдаст false")
    public void checkThatFalseWhenNameLengthMoreThenSeventeenByOne() {
        Account account = new Account(NamesForAccountTest.NAME_LENGTH_MORE_THEN_19_BY_1);
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Проверка, что для наименования, начинающегося с пробела выдаст false")
    public void checkThatFalseWhenNameStartsWithWhitespace() {
        Account account = new Account(NamesForAccountTest.NAME_STARTS_WITH_WHITESPACE);
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    @DisplayName("Проверка, что для наименования, заканчивающегося на пробел выдаст false")
    public void checkThatFalseWhenNameEndsWithWhitespace() {
        Account account = new Account(NamesForAccountTest.NAME_ENDS_WITH_WHITESPACE);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что для наименования без пробела выдаст false")
    public void checkThatFalseWhenNameNotContainsWhitespace() {
        Account account = new Account(NamesForAccountTest.NAME_WITHOUT_WHITESPACE);
        assertFalse(account.checkNameToEmboss());

    }

}
