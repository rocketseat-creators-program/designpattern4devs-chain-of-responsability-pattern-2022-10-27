package chain.processplus.service;


import chain.processplus.steps.*;

public class ServicesCatalog {
	
	public static StepProcess saveUserProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.name"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new SaveUser());
	
	public static StepProcess loginProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new GetUserByEmail(),
			new CheckPassword(),
			new GetUserToken());
	
	public static StepProcess getUsersProcess = buildChain(
			new ValidateToken(),
			new GetUsers());
	
	private static StepProcess buildChain(StepProcess... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			StepProcess currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
