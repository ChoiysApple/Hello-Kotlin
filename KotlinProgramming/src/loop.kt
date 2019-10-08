
fun main(){

    // basic for loop
    val school = arrayOf("A", "B", "C")
    for (i in school)
        print(i)

    println()
    for ((index, value) in school.withIndex())
        println("$index : $value")

    println()
    for (i in 1..5)
        print(i)

    println()
    for (i in 5 downTo 1)
        print(i)

    println()
    for (i in 5..1)
        print(i)

    println()
    for (i in 'a'..'d')
        print(i)
}