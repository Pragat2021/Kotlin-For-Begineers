// 3rd  lecture of Kotlin Tutorial => Data Types And Operators . 
// Doubt ---> ++i and i++ is not cleared . 
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
//  */
// fun name(Input Arguments)
// {
//     //CODE
// }

// INPUt ------------> Function ---------------> Outpu

//VAR can be reAssigned.To make A reassign use this .  
//VAL canNot Be reAssigned . make a constants 


// Type Inference -> means kotlin can self identify the data type of a vaiablee.
//Type checking -> we cannot change the datagtype of a varible once defined . 


// fun main()
// {
//     var score = 5 ;
//     score =10
//     println(score)
// //     score =20

// var  message = "Hello World " ; 
//     message = "Pragat"
//     println(message)
// }


// DATA TYPES
// fun main ()
// {
//     var score1: Int = 12
//     var temperature : Double = 89.4
//     var israining:Boolean = true
//     var alphabet :Char = 'A'
//     var message1: String = "HeLLO This is Beginning"
// //     println(score1 ,temperature , israining , alphabet) => This is not possible  in kotlin 
//     println(score1)
//      println(temperature)
//       println(israining)
//        println(alphabet)
//       	println(message1)
          

// }


// DATA TYPES : 
// INTEGER ------>  BYTE , SHORT , INT , LONG
// FLOOTING POINT --------> FLOAT , DOUBLE
//  BOOLEAN ------------> TREU , FALSE
//  CHARACTER -----------> CHAR , STRING

//---------OPERATORS----------package

// + , - , * , / 
// fun main()
// {
//     var i = 3 
//     var j = 5

//     println(i+j)//8
//     println(i-j)//-2
//     println(i*j)//15
//     println(i/j)//0 no 0.6 complete 0 value as the int is a type of i and j 
// //in order to make output 0.6  use the conversion of datatype in i or j 
// 	println(i.toFloat() / j ) // 0.6
//     println(i%j)//3

    
//     // Modulus operator gives remainder
    
//     println(i%j) // 3
    
    
    
// //    Relational Operators 

// //greater than > ,  less than < , >= , <= , == , !=

// fun main ()
// {
//     var a = 5 
//     var b = 7 
//     println(a>b)
//     println(a<b)
//     println(a>=b)
//     println(a<=b)
//     println(a==b)
//     println(a!=b)
  
// }

//  Increment and Decrement operators

fun main()
{
    var i = 10
//     i = i + 1
//     i++
//     i--
    
    // POST AND PRE INCREMENT
   // println(++i) //pre
     //println(i++)
//     println(i)
	println(i++  +  ++i )  // 10 + 12
}




// // -------------LOGICAL Operators ----------------
// // ---AND (&&) ,  || (OR) , ! (NOT )

// The use of && , || and ! symbols during programming is known as short circuiting .



// fun main ()
// {
//    var above70 = false 
//     var knowsprogramming = false
    
// //      and 
    
//     var calledforinterview =  above70 && knowsprogramming
//     println(calledforinterview)
//      var calledforinterview =  above70 || knowsprogramming
//      println(calledforinterview)
// }




















