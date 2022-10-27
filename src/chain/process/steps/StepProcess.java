package chain.process.steps;


import chain.process.service.ProcessContext;

public abstract class StepProcess {
	protected StepProcess nextStep;
	protected Object[] args;
	
	public StepProcess(Object... args) {
		this.args = args;
	}

	public abstract ProcessContext execute(ProcessContext context) throws Exception;
	
	public void setNextStep(StepProcess next) {
		this.nextStep = next;
	}
	
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.addProcessResult(actualResult);
		return this.nextStep != null? nextStep.execute(context): context;
	}
 }
