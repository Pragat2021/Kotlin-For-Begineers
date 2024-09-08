//  Deep work on if else in kotlin 
// ------IF - EALSE Statements ----------


// fun main ()
// {
//     var num = 4
//         if((num % 2 == 0 ) && (num >0))
//     {
//             	println("Even")
//         }
//         else
//         {
//             println("False")
//         }
// }




// ------- Another example -----

// fun main ()
// {
// //     val issunday = true
//     val issunday = false
//     if(issunday)
//     {
//         println("Enjoy")
//     }
//     else
//     {
//         println("Study Hard")
//     }
    
// }



// fun main ()
// {
//     val x = 13
//     val y = 10
//     if(x>y)
//     {
//         println("X is greater than y")
//     }
//     else if (x<y)
//     {
//         println("X is less than Y ")
//     }
    
//     else
//     {
//         println(" Xand Y are equal ")
//     }
// }

//-----Using if else as an expression -------

// fun main()
// {
//    check()
// }
// check main()
// {	
//     val x = 10 
//     val y = 13
//     val result = if(x>y)
//     {
//         println("X is greater the y")
//     }
//     else:
//     {
//         println("Equal or less than")
//     }
// }

fun main ()
{
//     val num = 13
    val num = 12
    val res = if(num%2 == 0 ){"Even"} else{"odd"}
    println(res)
}

//  There are no Ternery operators in Kotlin instead we use this type of syntax . 