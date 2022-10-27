package chain.processplus.service;


import chain.processplus.steps.StepProcess;

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
