import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executerService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executerService.submit(new CallableTask("in28minutes"));
		
		String welcomeMessage = welcomeFuture.get();

		System.out.println("\n new CallableTask(\"in28minutes\") executed");

		System.out.println(welcomeMessage);

		System.out.println("\n Main completed");

	}

}
