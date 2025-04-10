package core.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import Configuration;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static Selenide.closeWebDriver;


public class BaseTest {

    // Базовый URL
    protected static String baseUrl;

    @BeforeAll
    public static void setUp(){
        baseUrl = determinationBaseUrl ();
        Configuration.browser ="chrome";
        Configuration.browserSize = "1920x1080";
    }

    private static String determinationBaseUrl(){
        String enviroment =System.getProperty("env","test");
        String configFileName = "application" + enviroment + ".properties";

        Properties properties = new Properties();
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("configFileName") {
            if (input == null) {
                throw new IllegalAccessException("Configuration file not found: " + configFileName);
            }
            properties.load(input);
        } catch (IOException e) {
            throw new IllegalAccessException("Unable to load configuration file: " + configFileName, e)
        }
        return properties.getProperty("baseUrl");
            }
            public String getBaseUrl() {
        return baseUrl;
        }

        @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}