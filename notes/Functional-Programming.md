# Functional Programming

### Why FP?

- Short code, Good for test & reusability
- Lambda, higher-order function
- Pure function

# Pure function

- Function without side-effect (same result for same parameter)
- Deterministic (return value is predictable)

    //pure function
    fun sum(a: Int, b: Int) = a + b
    
    //non-pure function
    val c = 3
    fun sum(a: Int, b: Int) = a + b + c

### Why Pure-function?

- No side-effect when merge between pure-functions —> Modulation & Reusability
- No effect to specific state —> Safe for parallel work
- Deterministic → Good for test, Debugging

# Lambda Expression

- Form of anonymous function
- Available without name

    { x, y -> x + y }

Used for **high-order function**

# First Class Citizen (일급 객체)

- Can be used as **Parameter**
- Can be used as **Return Value**
- Can be stored in **Variable**

# High-order function

High-order function can use other function for its **Parameter** or **Return value**

    fun main{
    		println(highFunc({x, y -> x + y}, 10, 30))
    }
    
    fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)