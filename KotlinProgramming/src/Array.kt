
fun main(){

    // basic list
    val school = listOf("Traver", "Michel", "Sam")
    println(school)
    println()

    // mutable list
    val mutable = mutableListOf("a", "b", "c", "d")
    println(mutable.remove("d"))
    mutable.removeAt(0)
    mutable.add("e")
    println(mutable)
    println()

    // arrayOf doesn't have a type
    val mixed = arrayOf("duh", 1, true)

    // intArrayOf have int type
    val numbers1 = intArrayOf(1, 2, 3, 4, 5)

    // combining arrays
    val numbers2 = intArrayOf(6, 7, 8 ,9, 10)
    println(numbers1 + numbers2)

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

}