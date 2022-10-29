object Main extends App {

//  // test for 2.1
//  for( a <- 1 to 10){
//    println(Ch2.fib(a))
//  }

//  test for 2.2
  var check: Array[Int] = Array(1,2,3,4,5);
  var sort = (a: Int, b: Int) => b>a
  println(Ch2.isSorted(check, sort))


}