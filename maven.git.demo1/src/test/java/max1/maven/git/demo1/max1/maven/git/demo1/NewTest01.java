package max1.maven.git.demo1.max1.maven.git.demo1;

import org.testng.annotations.Test;

import junit.framework.Assert;
import max1.maven.git.demo1.testDemo1;

public class NewTest01 {
  @Test
  public void test1() {
	  System.out.println("we are in newTest01...");
	  testDemo1 td1 = new testDemo1();
	  Assert.assertEquals("Hello", td1.testMethod1());
	  
  }
}
