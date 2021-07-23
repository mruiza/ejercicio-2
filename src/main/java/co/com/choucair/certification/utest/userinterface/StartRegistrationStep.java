package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartRegistrationStep {
    public static final Target JOIN_REGISTRATION = Target.the("start registration")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
