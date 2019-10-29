# High-order & Lambda

**Using function as Parameters**

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
      val multi = {x: Int, Y: Int -> x * y}   // assign lambda to normal variable
      print(multi(2, 3))                      // var assigned lambda can be used like function
    }
      

> val multi: (Int, Int) → Int = {x: Int, y: Int → x * y}

- Use var "multi" like function
- Lambda declare data type omittable when data type stated at parameter