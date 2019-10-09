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
}

class Person(val no: Int, val name: String, val jab: String)