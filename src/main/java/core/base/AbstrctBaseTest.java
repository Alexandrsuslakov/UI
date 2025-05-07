package core.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class AbstrctBaseTest {
    // Базовый URL
    protected static String baseUrl;


    @BeforeEach
    public void setUp() {
        baseUrl = determinationBaseUrl();
        configure();
    }

    protected  abstract void configure(); // Метод для настройки среды

    private static String determinationBaseUrl() {
        String enviroment = System.getProperty("env", "test");
        String configFileName = "application-" + enviroment + ".properties";

        Properties properties = new Properties();
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream(configFileName)) {
            if (input == null) {
                throw new IllegalStateException("Configuration file not found: " + configFileName);
            }
            properties.load(input);
        } catch (Exception e) {
            throw new IllegalStateException("Unable to load configuration file: " + configFileName, e);
        }
        return properties.getProperty("baseUrl");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}

