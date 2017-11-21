package junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  Test1Class.class,
  Test2Class.class,
  Test3Class.class
})
public class SuiteTest {
  // the class remains empty, used only as a holder for the above annotations
}
