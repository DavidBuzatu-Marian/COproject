package timing;

public class Timer implements ITimer {

	private long currTime = 0, totalTime = 0;
	private boolean stopped = true;
	@Override
	public void start() {
		stopped = false;
		currTime = System.nanoTime();
		totalTime = 0;
	}

	@Override
	public long stop() {
		long time = System.nanoTime();
		if(!stopped) {
			totalTime += time - currTime;
		}
		stopped = true;
		long result = totalTime;
		totalTime = 0;
		return result;
	}

	@Override
	public long pause() {
		long time = System.nanoTime() - currTime;
		if(!stopped) {
			totalTime += time;
		}
		else {
			time = 0;
		}
		stopped = true;
		return time;
	}

	@Override
	public void resume() {
		long time = System.nanoTime();
		if(!stopped) {
			totalTime += time - currTime;
		}
		stopped = false;
		currTime = time;
	}

}
