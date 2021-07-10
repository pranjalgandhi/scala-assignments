//Meghana Dinesh-Scala Assignment

//task 01: Get the largest number from two numbers

val a=5
val b=7
println("Larger of the two numbers="+((a).max(b)))

//#########################################################################

//task 02: Get Square of a number and add with another number

val x= 2
val y= 4
val z=(x*x)+y
print("Answer="+z)

//############################################################################

//task 03: Create a List list01 from 1 to 10

val list01:List[Int]=List.range(1,11)

//##########################################################################

//task 04: add 11 to list01 at the end

//Option 1:
val list02:List[Int]=List(11)
val updated_list=list01 ::: list02

//Option 2:
val updated_list01=list01:+11

//##########################################################################

//task 05: add 0 to the beginning of the list in task 04

val list_start=0 +: updated_list01


//############################################################################

//task 06: Do task 03, 04, 05 in one line

val list1=0+:list01:+11

//#########################################################################

//task 07: concatenate list in task 03 and task 05

val concat_list=list01 ::: list_start

//#########################################################################

//task 08: reverse the list in task 06

val list_reverse=list1.reverse

//#########################################################################

//task 09: Write task 02 as a function instead and call the function in the next line

def task2:Unit={
  val ans:Int=(x*x)+y
  println("Answer="+ans)
}
task2

//#########################################################################

//optional task 10: list with a square of the input list01

val square_list:List[Int]=list01 map(x=>x*x)

//****************************************************************************