package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.LastStep.LAST_STEP_LABEL;

public class AnswerLabel implements Question<Boolean> {
    private final List<UTestData> lastStepLabel;

    public AnswerLabel(List<UTestData> lastStepLabel) {
        this.lastStepLabel = lastStepLabel;
    }

    public static AnswerLabel onLastStep(List<UTestData> lastStepLabel) {
        return new AnswerLabel(lastStepLabel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelConfirm = Text.of(LAST_STEP_LABEL).viewedBy(actor).asString();
        return lastStepLabel.get(0).getLastStepLabel().equals(labelConfirm);
    }
}
