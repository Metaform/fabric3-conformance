package client;

import junit.framework.TestCase;
import org.oasisopen.sca.annotation.Reference;
import org.oasisopen.sca.test.TestInvocation;

/**
 * @version $Rev$ $Date$
 */
public class ASM12010Client extends TestCase {
    private static final String EXPECTED = "ASM_12010 request servicex operation1 invoked";

    @Reference
    protected TestInvocation invocation;

    public void testInvoke() throws Exception {
        assertEquals(EXPECTED, invocation.invokeTest("request"));
    }
}
