# High-order & Lambda

**function as Parameters**

    fun sum(a: Int, b: Int) = a + b
    fun mul(a: Int, b: Int) = a * b
    
    fun main(){
    	val add = sum(3,3)          // normal parameter
      val mul = mul(sum(3,2), 3)  // Function parameter
    }

**Using functions as return value**

    fun sum(a: Int, b: Int) = a + b
    
    fun r_sum(): Int{
      return sum(2,2)
    }
    
    fun main(){
      println(r_sum)
    }

**Using function as variable**

    fun main(){
      val multi = {x: Int, y: Int -> x * y}   // assign lambda to normal variable
      print(multi(2, 3))                      // var assigned lambda can be used like function
    }
      

> val multi: (Int, Int) → Int = {x: Int, y: Int → x * y}

- Use var "multi" like function
- Lambda declare data type omittable when data type stated at parameter

**Declare datatype**     (Int, Int) → Int 
**Parameter**                  x: Int, y: Int
**Return value**              x * y

**Multi line Lambda expression returned**

    val multi: (Int, Int) -> Int = {x: Int, y: Int ->
            "x * y"
             x * y     // expression at last line returned 
    }
    print(multi(2, 3)) // 6

**Ommitting data type**

    val multi: (Int, Int) → Int = {x: Int, y: Int → x * y}    // original
    val multi = {x: Int, y: Int → x * y}                      // x, y data type declared, can guess x*y
    val multi: (Int, Int) -> Int = {x, y -> x * y}            // x, y, x * y declared
    val multi = {x, y -> x * y}                               // ERROR

**No return datatype or single parameter**

    val greet: ()->Unit = {println("Hello Kotlin"}    // No datatype → declare return datatype Unit
    val shortGreet: = {println("Hello Kotlin"}        // Ommitted
    val square: (Int)->Int = { x -> x * x }
    val shortSquare: { x: Int -> x * x }              // Ommitted

**Nested lambda**

    val nestedLambda: ()->()->Unit = { { println("nested") } }
    val shortNested: { { println("nested") } }          // Ommitted