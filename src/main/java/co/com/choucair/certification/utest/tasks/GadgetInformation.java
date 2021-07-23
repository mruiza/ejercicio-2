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

import static co.com.choucair.certification.utest.userinterface.GadgetInformationStep.*;

public class GadgetInformation implements Task {
    private final List<UTestData> deviceData;

    public GadgetInformation(List<UTestData> deviceData) {
        this.deviceData = deviceData;
    }

    public static GadgetInformation withDevice(List<UTestData> deviceData) {
        return Tasks.instrumented(GadgetInformation.class,deviceData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_OS_FIELD),
                Enter.theValue(deviceData.get(0).getComputerOs()).into(COMPUTER_OS_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_INPUT_FIELD),
                Click.on(COMPUTER_VERSION_FIELD),
                Enter.theValue(deviceData.get(0).getComputerVersion()).into(COMPUTER_VERSION_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(COMPUTER_VERSION_INPUT_FIELD),
                Click.on(COMPUTER_LANGUAGE_FIELD),
                Enter.theValue(deviceData.get(0).getComputerLanguage()).into(COMPUTER_LANGUAGE_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(COMPUTER_LANGUAGE_INPUT_FIELD),
                Click.on(MOBILE_BRAND_FIELD),
                Enter.theValue(deviceData.get(0).getMobileBrand()).into(MOBILE_BRAND_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(MOBILE_BRAND_INPUT_FIELD),
                Click.on(MOBILE_MODEL_FIELD),
                Enter.theValue(deviceData.get(0).getMobileModel()).into(MOBILE_MODEL_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(MOBILE_MODEL_INPUT_FIELD),
                Click.on(MOBILE_OS_FIELD),
                Enter.theValue(deviceData.get(0).getMobileOs()).into(MOBILE_OS_INPUT_FIELD),
                Hit.the(Keys.ENTER).into(MOBILE_OS_INPUT_FIELD),
                Click.on(LAST_STEP));
    }
}
