package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import org.oasisopen.sca.test.TestInvocation;

/**
 * @version $Rev$ $Date$
 */
public class ASM5042Client extends TestCase {
    private static final String EXPECTED = "ASM_5042 request service1 operation1 invoked second operation1 invoked";

    @Reference
    protected TestInvocation invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.invokeTest("request"));
    }
}
