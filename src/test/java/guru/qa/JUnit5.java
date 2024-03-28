package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class JUnit5 {

    @BeforeAll
    static void beforeAll (){
        Configuration.browser="chrome";
    }

    @Test
    void firstTest () {
        open("https://google.com");

    }



}

