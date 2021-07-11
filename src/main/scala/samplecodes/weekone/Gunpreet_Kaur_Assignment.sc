/*
Instructions:
1. Write your code below the comment and click run. Results will be shown to your right.
2. Run the worksheet once and check if you see "hello" to your right
3. Use only val and not var
4. Try out with lazy val too
5. Try doing things in single or as less number of lines as possible.
 */

var num1: Int = 5
var num2: Int = 10

//task 01: Get the largest number from two numbers
val result = (num1).max(num2)


//task 02: Get Square of a number and add with another number
val result = (num1*num1)+num2


//task 03: Create a List list01 from 1 to 10
val list01 = List.range(1,11,1)


//task 04: add 11 to list01 at the end
val list02=list01:+11


//task 05: add 0 to the beginning of the list in task 04
val list03=0+:list02


//task 06: Do task 03, 04, 05 in one line
val list04=0+:(List.range(1,11,1)):+11

//task 07: concatenate list in task 03 and task 05
val list05=List.concat(list01,list03)

//task 08: reverse the list in task 06
val reversedList=list04.reverse


//task 09: Write task 02 as a function instead and call the function in the next line
def squaring_and_adding(num1:Int,num2:Int):Int={
  (num1*num1) + num2;
}
val result=squaring_and_adding(num1,num2)

//optional task 10: list with a square of the input list01
val resultList=list01.map(num => num * num )