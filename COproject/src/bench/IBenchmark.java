package bench;

public interface IBenchmark {
	
	int OPS = 23;
	
	void warmUp();
	
	void run();
	
	void run(Object... params);
	
	void clean();
	
	void initialize(Object... params);
	
	void cancel();
	
	String getResult();
}
