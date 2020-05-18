package logging;

import timing.TimeUnit;

public interface ILogger {
	
	void write(long param);
	
	void write(String param);
	
	void write(Object... params);
	
	void writeTime(long value, TimeUnit unit);
	
	void writeTime(String s, long value, TimeUnit unit);
	
	void close();
}
