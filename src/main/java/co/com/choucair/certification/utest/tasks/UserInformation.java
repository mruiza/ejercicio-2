package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.UserInformationStep.*;

public class UserInformation implements Task {
    private final List<UTestData> personalData;

    public UserInformation(List<UTestData> personalData) {
        this.personalData = personalData;
    }

    public static UserInformation withPersonal(List<UTestData> personalData) {
        return Tasks.instrumented(UserInformation.class, personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRST_NAME_FIELD),
                Enter.theValue(personalData.get(0).getFirstName()).into(FIRST_NAME_FIELD),
                Click.on(LAST_NAME_FIELD),
                Enter.theValue(personalData.get(0).getLastName()).into(LAST_NAME_FIELD),
                Click.on(EMAIL_FIELD),
                Enter.theValue(personalData.get(0).getEmail()).into(EMAIL_FIELD),
                Click.on(MONTH_BIRTH_FIELD),
                SelectFromOptions.byVisibleText(personalData.get(0).getMonthBirth()).from(MONTH_BIRTH_FIELD),
                Click.on(DAY_BIRTH_FIELD),
                SelectFromOptions.byVisibleText(personalData.get(0).getDayBirth()).from(DAY_BIRTH_FIELD),
                Click.on(YEAR_BIRTH_FIELD),
                SelectFromOptions.byVisibleText(personalData.get(0).getYearBirth()).from(YEAR_BIRTH_FIELD),
                Click.on(LANGUAGE_SPOKEN_FIELD),
                Enter.theValue(personalData.get(0).getLanguageSpoken()).into(LANGUAGE_SPOKEN_FIELD),
                Click.on(NEXT_STEP_LOCATION));
    }
}
