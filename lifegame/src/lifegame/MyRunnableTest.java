package lifegame;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

	public class MyRunnableTest {
		 private static MyRunnable myable = new MyRunnable();
		@Test
		public void testInit() {
			myable.init();
		}
	
		@Test
		public void testSuanfa() {
			myable.suanfa();
		}
	
		@Ignore
		public void testChange() {
		}
	
		@Test
		public void testShow() {
			myable.show();
		}
	
	}
