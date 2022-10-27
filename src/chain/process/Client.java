package chain.process;

import chain.process.service.GenericService;
import chain.process.service.ProcessContext;
import chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "user1@teste.com");
		ctx.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "user2@teste.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
	}
}
