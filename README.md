# Kotlin's removeIf() function on immutable Lists

This example demonstrates a common error in Kotlin related to the `removeIf()` function.  The function modifies the list in place and is only applicable to mutable lists. Attempting to use it with an immutable list (`listOf()`) will lead to a compile-time error. The solution involves using the `filter()` function to create a new list with the desired elements, instead of modifying the original list.

The `Bug.kt` file showcases the problem and the `BugSolution.kt` provides a working solution using `filter()`.