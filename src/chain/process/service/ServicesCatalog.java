package chain.process.service;


import chain.process.steps.SaveUser;
import chain.process.steps.StepProcess;
import chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {
	
	public static StepProcess saveUserProcess = buildChain(
			new ValidateMandatoryField("name"),
			new ValidateMandatoryField("email"),
			new ValidateMandatoryField("password"),
			new SaveUser());
	
	private static StepProcess buildChain(StepProcess... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			StepProcess currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
