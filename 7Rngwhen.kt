
//---- use of range in WHEN statements---------package





fun main()
{
    val num = 23
    val res = when(num)
    {
       
        in 1..10 -> "One to ten"
        in 11..20 -> "Eleven to tewnty"
// 		((in 21..30) && (23)) -> "Twenty One to Thirty" -> this is not valid in kotlin try not to use
        23 -> "twenty three"
        else -> "Not in range"
    }
    println(res)
}