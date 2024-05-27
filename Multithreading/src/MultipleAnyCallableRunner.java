import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executerService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask("in28minutes"), new CallableTask("Ranga"),
				new CallableTask("Adam"));
		String result = executerService.invokeAny(tasks);

		System.out.println(result);


		executerService.shutdown();

	}

}
