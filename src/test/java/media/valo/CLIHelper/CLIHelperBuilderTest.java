/*
 * Copyright (c) 2026
 * valo.media GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package media.valo.CLIHelper;

/*
 * CLIHelperBuilderTest.java
 * CLIHelper
 */

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for {@link CLIHelperBuilder}.
 */
class CLIHelperBuilderTest {

    @Test
    void buildUsesDefaultConfiguration() {

        CLIHelper helper = new CLIHelperBuilder().build();

        assertEquals('#', helper.infoFrame);
        assertEquals('@', helper.errFrame);
        assertEquals('%', helper.warnFrame);
        assertEquals("INFO", helper.infoHead);
        assertEquals("ERROR", helper.errHead);
        assertEquals("WARN", helper.warnHead);
        assertEquals("I did not understand that, please try again.", helper.notUnderstood);
        assertTrue(helper.positive.matcher("yes").matches());
        assertTrue(helper.negative.matcher("no").matches());

    }

    @Test
    void buildUsesConfiguredValues() {

        Pattern positive = Pattern.compile("sure");
        Pattern negative = Pattern.compile("never");

        CLIHelper helper = new CLIHelperBuilder()
                .infoFrame('=')
                .errFrame('!')
                .warnFrame('?')
                .infoHead("NOTE")
                .errHead("FAIL")
                .warnHead("CAUTION")
                .notUnderstood("Try again.")
                .positive(positive)
                .negative(negative)
                .build();

        assertEquals('=', helper.infoFrame);
        assertEquals('!', helper.errFrame);
        assertEquals('?', helper.warnFrame);
        assertEquals("NOTE", helper.infoHead);
        assertEquals("FAIL", helper.errHead);
        assertEquals("CAUTION", helper.warnHead);
        assertEquals("Try again.", helper.notUnderstood);
        assertSame(positive, helper.positive);
        assertSame(negative, helper.negative);

    }

}
