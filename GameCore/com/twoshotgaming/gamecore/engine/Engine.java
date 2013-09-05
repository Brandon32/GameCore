package com.twoshotgaming.gamecore.engine;

@SuppressWarnings("unused")
public class Engine implements Runnable {

	private static final double DEFAULT_FPS = 60;
	private boolean running;
	private long currentTime;
	private int currentFrames;
	private int currentTicks;
	private boolean shouldRender = true;

	public void run() {
		long lastTime = System.nanoTime();
		int ticks = 0;
		int frames = 0;
		double unprocessed = 0;
		long timer = System.currentTimeMillis();
		double nsPerTick = 1000000000.0 / DEFAULT_FPS;

		running = true;
		while (running) {
			currentTime = System.nanoTime();
			unprocessed += (currentTime - lastTime) / nsPerTick;
			lastTime = currentTime;

			while (unprocessed >= 1) {
				ticks++;
				// game.collisions();
				// game.update();
				unprocessed -= 1;
			}

			if (shouldRender) {
				frames++;
				// game.render();
				// game.draw();
			}

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				currentFrames = frames;
				currentTicks = ticks;
				frames = 0;
				ticks = 0;
			}
		}
	}
}
