package bench.cpu;

import java.math.BigInteger;

import bench.IBenchmark;
import fft.FFT;

public class MersenneBenchmark implements IBenchmark{

	private int number;
	
	private String result;
	
	private BigInteger s = new BigInteger("4");
	
	private BigInteger prime = new BigInteger("4");
	@Override
	public void warmUp() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 2; i++) {
			this.run();
			s = new BigInteger("4");
			prime = new BigInteger("4");
		}
		
	}

	@Override
	public void run() {
		s = new BigInteger("4");
		prime = new BigInteger("4");
		for(int i = 3; i <= number; i++) {
			prime = prime.multiply(BigInteger.TWO);
			
		}
		prime = prime.subtract(BigInteger.ONE);
		
		for(int i = 2; i < number; i++) {
			s = FFT.multiply(s, s);
			s = s.subtract(BigInteger.TWO);
			s = s.mod(prime);
		}
		
		result = s.equals(BigInteger.ZERO) ? "Mersenne Prime" : "Not Mersenne Prime";
		
		
	}

	@Override
	public void run(Object... params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(Object... params) {
		number = (Integer)params[0];
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
