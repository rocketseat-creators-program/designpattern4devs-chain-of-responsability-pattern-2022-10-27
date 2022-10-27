package chain.processplus.steps;

import chain.processplus.service.ProcessContext;

public class ValidateMandatoryField extends StepProcess {

	public ValidateMandatoryField(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object field = context.get((String) args[0]);
		if(field == null) throw new Exception(String.format("%s is empty", args[0]));
		return next(context, true);
	}

}
