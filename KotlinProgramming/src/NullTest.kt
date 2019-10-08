fun main(){
    var str1 : String = "Hello Kotlin"
   // str1 = null         // error
    var str2 : String? = "Hello null"
    str2 = null         // null accepted
    println(str2)


    // [Safe call]
    println("\n\n[Safe call]")
    //println(str2.length)      // length unavaliable for nullable
    println(str2?.length)       // launch length if value is non-null
    //println(str2!!.length)      // skip null, cannot catch null, NPE possible


    // [Elvis operator]
    println("\n\n[Elvis operator]")
    str2?.length ?: -1      //if str2 == null, run after ":"
    println("${str2?.length?: -1}")


    //casting
    println("\n\n[Cast]")
    val a : Int = 1
    //val b : Double = a        //type mismatch
    val b : Double = a.toDouble()
    val result = 1L + 3         //Long + Int = Long (Larger data type)


     // [Equality]
     /* == : compare value
        === : compare value && address
        int 같이 기본형으로 바뀌는 자료형에서 ===는 무의미 (스택에 들어가면서 주소가 아닌 값 동일)
      */
    println("\n\n[Equality]")
    val A : Int = 128
    val B = A
    val C : Int? = A

    println("${A == B}, ${A == C}, ${A === B}, ${A===C}")


    //[Smart Cast] --> automatic casting, data type "Number"
    println("\n\n[Smart Cast]")
    var test : Number = 12.2
    println(test::class.simpleName)

    test = 12       //smart cast to Int
    println(test::class.simpleName)

    test = 120L     //smart cast to Long
    println(test::class.simpleName)

    test += 12.0f   //smart cast to Float
    println(test::class.simpleName)


    //["is" keyword]
    println("\n\n[\"is\" keyword]")
    if (test is Float)
        print("test is float")


    //["Any" casting]
    println("\n\n[\"Any\" casting]")
    var any : Any = 1              //cast to Int when initialized to 1
    println(any.javaClass)
    any = 20L                       //cast to Long
    println(any.javaClass)


    // Throw Exception
    val s : String? = null
    val len = s!!.length
    print(len)

}