println("Hello")
/*
Instructions:
1. Write your code below the comment and click run. Results will be shown to your right.
2. Run the worksheet once and check if you see "hello" to your right
3. Use only val and not var
4. Try out with lazy val too
5. Try doing things in single or as less number of lines as possible.
 */

//task 01: Get the largest number from two numbers

val n1:Int = 10
val n2: Int =20
val result=(n1).max(n2)

//task 02: Get Square of a number and add with another number
val x:Int =5
val y:Int =2
val result= (x*x)+y
println(result)

//task 03: Create a List list01 from 1 to 10
val List01=List(1,2,3,4,5,6,7,8,9,10)

//or
val List01 = List.range(1,11)

//task 04: add 11 to list01 at the end
val List02=List01 :+11

//task 05: add 0 to the beginning of the list in task 04
val List03 = 0 +: List02

//task 06: Do task 03, 04, 05 in one line
val List04 = 0 +: (List01) :+ 11

//task 07: concatenate list in task 03 and task 05
val List05 = List.concat(List01,List03)

//task 08: reverse the list in task 06
val List06 = List04.reverse

//task 09: Write task 02 as a function instead and call the function in the next line
def function(x : Int, y : Int)= (x*x)+y
println(function(5,2))

//optional task 10: list with a square of the input list01
val square = List01.map(x=> x*x)