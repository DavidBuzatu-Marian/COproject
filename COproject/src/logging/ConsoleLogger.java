package logging;

import timing.TimeUnit;

public class ConsoleLogger implements ILogger {

	@Override
	public void write(long param) {
		System.out.println(param);

	}

	@Override
	public void write(String param) {
		System.out.println(param);

	}

	@Override
	public void write(Object... params) {
		for(Object object : params)
			System.out.print(object + " ");
		System.out.println();
	}

	@Override
	public void close() {
		
	}

	@Override
	public void writeTime(long value, TimeUnit unit) {
		System.out.println(TimeUnit.convertTime(value, unit) + " " + TimeUnit.timeUnitName(unit));
	}

	@Override
	public void writeTime(String s, long value, TimeUnit unit) {
		System.out.println(s + TimeUnit.convertTime(value, unit) + " " + TimeUnit.timeUnitName(unit));
	}

}
