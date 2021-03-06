/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotlinlang.library

/**
 * @author kaushikam@gmail.com
 *
 * This class represents the name of the programming language and the hotness of it
 */
data class Language(val name: String, val hotness: Int)

/**
 * @author kaushikam@gmail.com
 *
 * This class represents Kotlin Language
 */
class Library {
    /**
     * @return Language
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}
