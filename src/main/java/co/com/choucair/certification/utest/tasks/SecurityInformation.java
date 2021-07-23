package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.SecurityInformationStep.*;

public class SecurityInformation implements Task {
    private final List<UTestData> privateData;

    public SecurityInformation(List<UTestData> privateData) {
        this.privateData = privateData;
    }

    public static SecurityInformation withPrivate(List<UTestData> privateData) {
        return Tasks.instrumented(SecurityInformation.class, privateData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PASSWORD_FIELD),
                Enter.theValue(privateData.get(0).getPassword()).into(PASSWORD_FIELD),
                Click.on(PASSWORD_CONFIRMATION_FIELD),
                Enter.theValue(privateData.get(0).getPassword()).into(PASSWORD_CONFIRMATION_FIELD),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_POLICY));
    }
}
