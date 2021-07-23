package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.SitesInformationStep.*;

public class SitesInformation implements Task {
    private final List<UTestData> addressData;

    public SitesInformation(List<UTestData> addressData) {
        this.addressData = addressData;
    }

    public static SitesInformation withAddress(List<UTestData> addressData) {
        return Tasks.instrumented(SitesInformation.class,addressData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CITY_FIELD),
                Enter.theValue(addressData.get(0).getCity()).into(CITY_FIELD),
                Hit.the(Keys.ARROW_DOWN).into(CITY_FIELD),
                Hit.the(Keys.ENTER).into(CITY_FIELD),
                Click.on(POSTAL_CODE_FIELD),
                Enter.theValue(addressData.get(0).getPostalCode()).into(POSTAL_CODE_FIELD),
                Click.on(COUNTRY_FIELD),
                Enter.theValue(addressData.get(0).getCountry()).into(COUNTRY_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(COUNTRY_INPUT_FIELD),
                Click.on(NEXT_STEP_DEVICES));
    }
}
