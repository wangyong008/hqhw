package com.hqhw.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ThreadPoolTest {

	@Autowired
	ThreadPoolTaskExecutor threadPoolTask;
	
	@Autowired
    private TaskExecutor executor;
	
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
	
	    
	    public void filesMng(String path, String fileName) {
	    	threadPoolTask.execute(new CutFilesThread(path,fileName));
	    }
	    
	    private class CutFilesThread implements Runnable {
	        private String path;
	        private String fileName;
	        private CutFilesThread(String path, String fileName) {
	            super();
	            this.path = path;
	            this.fileName = fileName;
	        }
	        @Override
	        public void run() {
	            System.out.println("barry... run...");
	        }
	    }
    
}
