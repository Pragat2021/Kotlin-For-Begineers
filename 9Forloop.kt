
// Use of for loop in kotlin is a way more special as in this we can use as steps inorder to Jump in steps 
// for loop in kotlin 

//  fun main()
// {
//     for (i in 1..5)
//     {
//         println("hello")
//     }
// }

//  for loop Using steps 
fun main()
{
    for (i in 1..5 step 2)
    {
        println("World")
    }
    for (i in 1 until 5 )
    {
        println("4 times")
    }
    for (i in 10 downTo 1) // 10 to 1
    {
        println(i)
    }
    for (i in 10 downTo 1 step 2 ) // Steps in for loop
    {
        println(i)
    }
}

