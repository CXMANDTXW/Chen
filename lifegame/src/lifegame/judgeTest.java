package lifegame;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class judgeTest {
	 private static MyRunnable myable = new MyRunnable();
	 private int param1;
	 private int param2;
	 private int result;
	 @Parameters 
	 public static Collection<Object[]> data(){
	        return Arrays.asList(new Object[][]{
	                {0,2,0},
	                {2,4,4},
	                {3,5,1},
	        });
	}
	 public judgeTest(int param1,int param2,int result){
	        this.param1 = param1;
	        this.param2 = param2;
	        this.result = result;
	}
	@Test
	public void testJudge() {
		int a = myable.judge(param1, param2);	
		assertEquals(a,result);
	}
}
