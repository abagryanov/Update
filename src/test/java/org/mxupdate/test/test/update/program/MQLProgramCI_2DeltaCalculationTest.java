/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.test.test.update.program;

import org.mxupdate.test.data.program.MQLProgramData;
import org.mxupdate.update.program.MQLProgram_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.Test;

/**
 * Tests the {@link MQLProgram_mxJPO mql program CI} delta calculation.
 *
 * @author The MxUpdate Team
 */
@Test()
public class MQLProgramCI_2DeltaCalculationTest
    extends AbstractProgramCI_2DeltaCalculationTest<MQLProgram_mxJPO,MQLProgramData>
{
    @Override()
    protected MQLProgram_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                             final String _name)
    {
        return new MQLProgram_mxJPO(_paramCache.getMapping().getTypeDef(CI.PRG_MQL.updateType), _name);
    }

    @Override
    protected MQLProgramData createNewTestData(final String _name)
    {
        return new MQLProgramData(this, _name);
    }
}
