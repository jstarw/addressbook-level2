package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    @Test
    public void isAnyNullTest() throws Exception {
        assertHasNoNull();

        // no null objects
        assertHasNoNull(1);
        assertHasNoNull("");
        assertHasNoNull("abc");
        assertHasNoNull(1, 3);
        assertHasNoNull("", "");
        assertHasNoNull((Object) new Integer(1));

        // has a null object
        assertHasAnyNull((Object) null);
        assertHasAnyNull(1, null);
        assertHasAnyNull("", null);
        assertHasAnyNull(null, null, null);

    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertHasNoNull(Object... objects) { assertFalse(Utils.isAnyNull(objects)); }

    private void assertHasAnyNull(Object... objects) { assertTrue(Utils.isAnyNull(objects)); }
}
