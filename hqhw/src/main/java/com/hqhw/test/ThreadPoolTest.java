package com.hqhw.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ThreadPoolTest {

	@Autowired
	ThreadPoolTaskExecutor threadPoolTask;

	@Test
	public void callableTest() {
		Future<Integer> future = threadPoolTask.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int i = 1;
				return i;
			}
		});
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void runableTest() {
		for (int i = 0; i < 10; i++) {
			threadPoolTask.execute(new Runnable() {
				public void run() {
					System.out.println("---" + Thread.currentThread().getName());
				}
			});
		}
	}

}
