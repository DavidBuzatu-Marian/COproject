package testbench;

import bench.IBenchmark;
import bench.cpu.MersenneBenchmark;
import logging.ConsoleLogger;
import logging.ILogger;
import timing.ITimer;
import timing.TimeUnit;
import timing.Timer;

public class MersenneTestbench {
	public double getResult() {
		ITimer timer = new Timer();
		
		IBenchmark bench = new MersenneBenchmark();
		
		ILogger logger = new ConsoleLogger();
		
		double score = 0.0;
		int cnt = 0;
		
		bench.initialize(6279);
		
		bench.warmUp();
		
		for(int i = 1279; i <= 6279; i += 1000) {
			int workflow = i;
			
			cnt++;
			
			
			bench.initialize(i);
			
			
			
			timer.start();
			bench.run();
			double time = TimeUnit.convertTime(timer.stop(), TimeUnit.S);
			
			score += i / ((Math.log(time)) + 1);
			
		}
		
		score /= 1.0 * cnt;
		
		
		return score;
	}
	
	
	public static void main(String args[]) {
		System.out.println(new MersenneTestbench().getResult());
	}
}
