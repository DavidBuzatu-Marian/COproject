package timing;

public enum TimeUnit {
	NS, US, MS, S;
	public static double convertTime(long time, TimeUnit unit) {
		switch(unit) {
			case NS: return time * 1.0;
			case US: return time / 1000.0;
			case MS: return time / 1000000.0;
			case S: return time / 1000000000.0;
		}
		return time * 1.0;
	}
	
	public static String timeUnitName(TimeUnit unit) {
		switch(unit) {
			case NS: return "nanoseconds";
			case US: return "microseconds";
			case MS: return "miliseconds";
			case S: return "seconds";
		}
		return "seconds";
	}
}
