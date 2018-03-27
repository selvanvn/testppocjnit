package endtoend;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class Parallel {

    @Test
    public void parallelTest() {
        Class cls = AddCardSuccessHappyPathTest.class;
        JUnitCore.runClasses(ParallelComputer.methods(),cls);
    }
}