package tiger.api.test.runner;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
  public Karate runTest() {
	  return Karate.run("classpath:features")
			  .tags("Smoke");
    
}

}
