object Demo extends App:

  // assign character 'a' to variable c
  val c: Char =
    'a'

  // assign integer 666 to variable i
  val i: Int =
    666

  // define function plus that takes two integers and returns the sum of those two integers
  def plus(x: Int, y: Int): Int =
    x + y

  val numbers: List[Int] =
    List(1,2,3,4,5,6,7,8,9)

  val strings: List[String] =
    numbers.map(n => n.toString)

  val even: List[Int] =
    numbers.filter(n => n % 2 == 0)

  println(s"val c=$c")
  println(s"val i=$i")
  println(s"val plus(3,2)=${plus(3,2)}")
  println(s"val numbers=$numbers")
  println(s"val strings=$strings")
  println(s"val even=$even")
