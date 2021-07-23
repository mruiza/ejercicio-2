package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.utest.userinterface.StartRegistrationStep.JOIN_REGISTRATION;

public class StartRegistration implements Task {
    public static StartRegistration withJoinButton() {
        return Tasks.instrumented(StartRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JOIN_REGISTRATION)
        );
    }
}
