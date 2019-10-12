import com.choiysapple.edu.Person as User
fun main() {
    println("Hello Kotlin")

    val person = User("Choi", 20)
    val person2 = Person(123, "Jet", "Developer")

    println(person)
    println("Name: "+person.name)
    println("Age: "+person.age)

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}

class Person(val no: Int, val name: String, val jab: String)