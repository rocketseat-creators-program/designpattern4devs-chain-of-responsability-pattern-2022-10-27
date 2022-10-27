package chain.processplus.steps;


import chain.processplus.repository.UserRepository;
import chain.processplus.service.ProcessContext;

public class GetUsers extends StepProcess {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
