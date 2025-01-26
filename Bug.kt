fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val list2 = listOf(1, 2, 3, 4, 5)
    //list2.removeIf {it > 2} // This will cause a compile-time error because removeIf() is not available for immutable lists
    val newList2 = list2.filter { it <=2 }
    println(newList2) // Output: [1,2]
}