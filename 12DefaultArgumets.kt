
// ------- Default arguments--------

// fun main()
// {
//    printMessage(3)
// }
// fun printMessage(c:Int) //No default value of printmessage

// {
//     for(i in 1..c){
//         println("Hello $i")
        
//     }
// }


fun main()
{
   printmessage()
}
    fun printmessage(count:Int = 2) // default value of printmessage

    {
        for(i in 1..count){
            println("I have default argument $i")

        }
    }
// Parameter are variables defined inside a function eg- fun add(num1,num2)) here num1 and num2 are paremeter
// Arguments are add(2,3)  2 and 3 are arguments 
//  Start from Method Overriding and Overloading