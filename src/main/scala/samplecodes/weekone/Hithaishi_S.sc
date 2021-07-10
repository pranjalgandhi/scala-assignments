// SCALA ASSIGNMENT - HITHAISHI S

//Task1: Get the largest number from two numbers
var num1=10;
var num2=7;
val largest:Unit= if(num1>num2) println(s"Largest value is $num1")
else println(s"Largest value is $num2")

//*********************************************************************

//Task2: Get Square of a number and add with another number
var num1=5;
var num2=9;

val res= (scala.math.sqrt(num1)) + num2;
println(res);

//*********************************************************************

//Task 3: Create a List list01 from 1 to 10

//Method-1
val list01= List.range(1,11,1);
println(list01);

//Method-2
val list01= List(1,2,3,4,5,6,7,8,9,10);
println(list01);

//**********************************************************************

//Task 4: add 11 to list01 at the end

val list01_end = list01 :+ 11;
println(list01_end);

//**********************************************************************

//Task 5:add 0 to the beginning of the list in task 04

val list01_start = 0 :: list01_end;
println(list01_start);

//**********************************************************************

//Task 6: Do task 03, 04, 05 in one line

val new_list = 0 :: (List.range(1,11,1) :+ 11);
println(new_list);

//***********************************************************************

//Task 7: concatenate list in task 03 and task 05

//Method-1
val concat_list = List.concat(list01,list01_start);
println(concat_list);

//Method-2
val concat_list = list01 ++ list01_start;
println(concat_list);

//Method-3
val concat_list = list01 ::: list01_start;
println(concat_list);

//************************************************************************

//Task 8: reverse the list in task 06

val reverse_list = new_list.reverse;
println(reverse_list);

//************************************************************************

//Task 9: Write task 02 as a function instead and call the function in the next line

def square_add(x:Double,y:Int):Double={
   (scala.math.sqrt(x)) + y;
}

val res = square_add(5,9);
println(res);

//**********************************************************************

//Optional Task-10:list with a square of the input list01

val sqaure_list:List[Double] = list01.map(x=>scala.math.sqrt(x));
println(sqaure_list);







