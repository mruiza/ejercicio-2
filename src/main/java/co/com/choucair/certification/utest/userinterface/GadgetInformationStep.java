package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GadgetInformationStep {
    public static final Target COMPUTER_OS_FIELD = Target.the("select computer os field")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_OS_INPUT_FIELD = Target.the("write computer os")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target COMPUTER_VERSION_FIELD = Target.the("select computer version field")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_VERSION_INPUT_FIELD = Target.the("write computer version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target COMPUTER_LANGUAGE_FIELD = Target.the("select computer language field")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_LANGUAGE_INPUT_FIELD = Target.the("write computer language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_BRAND_FIELD = Target.the("select mobile brand field")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_BRAND_INPUT_FIELD = Target.the("write mobile brand")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target MOBILE_MODEL_FIELD = Target.the("select mobile model field")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_MODEL_INPUT_FIELD = Target.the("write mobile model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target MOBILE_OS_FIELD = Target.the("select mobile os field")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_OS_INPUT_FIELD = Target.the("write mobile os")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target LAST_STEP = Target.the("last step")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}
