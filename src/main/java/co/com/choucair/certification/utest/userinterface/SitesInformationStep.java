package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitesInformationStep {
    public static final Target CITY_FIELD = Target.the("write city location")
            .located(By.id("city"));
    public static final Target POSTAL_CODE_FIELD = Target.the("write postal code location")
            .located(By.id("zip"));
    public static final Target COUNTRY_FIELD = Target.the("select country location")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_INPUT_FIELD = Target.the("write country location")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_STEP_DEVICES = Target.the("next step devices")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
}
