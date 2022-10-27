package chain.processplus.steps;


import chain.processplus.service.ProcessContext;

public class CreateMap extends StepProcess {

	public CreateMap(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		context.encapsulate((String) args[0]);
		return next(context, true);
	}

}
