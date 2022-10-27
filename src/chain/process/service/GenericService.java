package chain.process.service;


import chain.process.steps.StepProcess;

public class GenericService {
	
	public static Object run(StepProcess startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
