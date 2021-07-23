package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserInformationStep {
    public static final Target FIRST_NAME_FIELD = Target.the("write first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the("write last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("write email")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH_FIELD = Target.the("select month birth")
            .located(By.id("birthMonth"));
    public static final Target DAY_BIRTH_FIELD = Target.the("select day birth")
            .located(By.id("birthDay"));
    public static final Target YEAR_BIRTH_FIELD = Target.the("select year birth")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE_SPOKEN_FIELD = Target.the("write language name")
            .located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target NEXT_STEP_LOCATION = Target.the("next step location")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
}
