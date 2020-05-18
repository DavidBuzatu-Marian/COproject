package test;

import java.math.BigInteger;
import java.util.Random;

import fft.FFT;

public class FFTTest {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		
		BigInteger b1 = new BigInteger(100, 1, rnd);
		
		BigInteger b2 = new BigInteger(100, 1, rnd);
		
		System.out.println(b1);
		System.out.println(b2);
		
		assert(b1.multiply(b2).equals(FFT.multiply(b1, b2)));
		
		System.out.println(b1.multiply(b2));
		System.out.println(FFT.multiply(b1, b2));
	}
	
}
