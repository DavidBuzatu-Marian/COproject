package logging;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import timing.TimeUnit;

public class FileLogger implements ILogger{
	private PrintStream file;
	
	public FileLogger(String fileName) throws FileNotFoundException {
		file = new PrintStream(new FileOutputStream(fileName));
	}

	
	
	@Override
	public void write(long param) {
		file.println(param);
	}

	@Override
	public void write(String param) {
		file.println(param);
		
	}

	@Override
	public void write(Object... params) {
		for(Object object : params)
			file.print(object + " ");
		file.println();
	}

	@Override
	public void close() {
		file.close();
	}



	@Override
	public void writeTime(long value, TimeUnit unit) {
		file.println(TimeUnit.convertTime(value, unit) + " " + TimeUnit.timeUnitName(unit));
	}



	@Override
	public void writeTime(String s, long value, TimeUnit unit) {
		file.println(s + TimeUnit.convertTime(value, unit) + " " + TimeUnit.timeUnitName(unit));
	}
	
	
}
