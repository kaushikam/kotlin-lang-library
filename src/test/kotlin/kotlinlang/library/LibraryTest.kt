/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlinlang.library

import org.junit.Test
import org.junit.Assert.*


class LibraryTest {
    @Test
    fun testMyLanguage() {
        assertEquals("Kotlin", Library().kotlinLanguage().name)
        assertEquals(10, Library().kotlinLanguage().hotness)
    }
}