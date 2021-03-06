
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.performance;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Performance testing and multi-threading testing.
 * 
 * @author DPavlov
 */
public class RunGeDARunTest {

	/**
	 * Executors shutdown listener.
	 */
	private class ExecutorListener implements ShutdownListener {
		
		private static final int SLEEP = 1000;
		private final ExecutorService service;
		private final Map<Object, Boolean> observables = new HashMap<Object, Boolean>();
		private boolean keepAlive = true;
		
		public void keepAlive() throws InterruptedException {
			while (keepAlive) {
				Thread.sleep(SLEEP);
			}
		}
		
		public ExecutorListener(final ExecutorService service) {
			this.service = service;
		}

		public synchronized void addObservable(final Object object) {
			this.observables.put(object, Boolean.FALSE);
		}

		public synchronized void notifyFinished(final Object object) {

			System.out.println(object.toString());
			
			this.observables.put(object, Boolean.TRUE);
			for (Boolean isFinished : observables.values()) {
				if (!isFinished) {
					return;
				}
			}
			service.shutdown();
			keepAlive = false;
		}
		
	}
	
	@Test
	public void test1Thread1TaskLevel3() throws InterruptedException {
		final int numThreads = 1;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task = new PerformanceTestLevel3Thread(50000, listener);
		exec.execute(task);
		listener.keepAlive();
		
	}
	
	@Test
	public void test2Threads2TasksLevel3() throws InterruptedException {
		final int numThreads = 2;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task1 = new PerformanceTestLevel3Thread(25000, listener);
		final Runnable task2 = new PerformanceTestLevel3Thread(25000, listener);
		exec.execute(task1);
		exec.execute(task2);
		listener.keepAlive();
	}
	
	@Test
	public void test5Threads5TasksLevel3() throws InterruptedException {
		final int numThreads = 5;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task1 = new PerformanceTestLevel3Thread(10000, listener);
		final Runnable task2 = new PerformanceTestLevel3Thread(10000, listener);
		final Runnable task3 = new PerformanceTestLevel3Thread(10000, listener);
		final Runnable task4 = new PerformanceTestLevel3Thread(10000, listener);
		final Runnable task5 = new PerformanceTestLevel3Thread(10000, listener);
		exec.execute(task1);
		exec.execute(task2);
		exec.execute(task3);
		exec.execute(task4);
		exec.execute(task5);
		listener.keepAlive();
	}
	
	@Test
	public void test1Thread1TaskLevel1() throws InterruptedException {
		final int numThreads = 1;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task = new PerformanceTestLevel1Thread(25, 35, listener);
		exec.execute(task);
		listener.keepAlive();
		
	}
	
	@Test
	public void test2Threads2TasksLevel1() throws InterruptedException {
		final int numThreads = 2;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task1 = new PerformanceTestLevel1Thread(25, 35, listener);
		final Runnable task2 = new PerformanceTestLevel1Thread(25, 35, listener);
		exec.execute(task1);
		exec.execute(task2);
		listener.keepAlive();
	}
	
	@Test
	public void test5Threads5TasksLevel1() throws InterruptedException {
		final int numThreads = 5;
		final ExecutorService exec = Executors.newFixedThreadPool(numThreads);
		final ExecutorListener listener = new ExecutorListener(exec);
		final Runnable task1 = new PerformanceTestLevel1Thread(15, 25, listener);
		final Runnable task2 = new PerformanceTestLevel1Thread(15, 25, listener);
		final Runnable task3 = new PerformanceTestLevel1Thread(15, 25, listener);
		final Runnable task4 = new PerformanceTestLevel1Thread(15, 25, listener);
		final Runnable task5 = new PerformanceTestLevel1Thread(15, 25, listener);
		exec.execute(task1);
		exec.execute(task2);
		exec.execute(task3);
		exec.execute(task4);
		exec.execute(task5);
		listener.keepAlive();
	}
	
}
