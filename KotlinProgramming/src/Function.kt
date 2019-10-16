fun sum(a: Int, b: Int): Int{
    return a+b
}

//fun sum(a: Int, b: Int):Int = a + b

//fun sum(a: Int, b: Int) = a + b       //return Int
/*
fun printSum(a: Int, b: Int): Unit{
    println(sum(a, b))
}*/

fun printSum(a: Int, b: Int) = println(sum(a,b))

fun add(name: String = "Who", mail: String = "defalt") = println("Name: $name, Mail: $mail")

fun printAll (vararg counts: Int){
    for (num in counts){
        print("$num ")
    }
}

//fun fishFood (day : String) : String{
//    when (day){
//        "Monday" -> return "flakes"
//        "Tuesday" -> return "pellets"
//        "Wednesday" -> return "redworms"
//        "Thursday" -> return "granules"
//        "Friday" -> return "flaplankton"
//    }
//    return "wow" }

fun fishFood (day : String) : String{
    return when (day){
        "Monday" ->  "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "flaplankton"
        else -> "nothing"
    }
}


fun main(){
    printSum(1, 2)

    add("Choi", "Google")
    add("Jake")
    add(mail = "Google")

    printAll(1, 3, 5, 1, 2)

    print(fishFood("Monday"))
}