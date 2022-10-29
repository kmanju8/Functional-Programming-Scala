object Ch2 {

  // Ex 2.1
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, ans: Int, prev: Int): Int = {
      if (n <= 0) ans
      else go(n - 1, ans + prev, ans)
    }
    go(n, 1, 0)
  }

  // Ex 2.2
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length-1) true
      else if (!ordered(as(n),as(n+1))) false
      else go(n + 1)
    }
    go(0)
  }

  // Ex 2.3
  def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a,b)
  }

  // Ex 2.4
  def uncurry[A,B,C](f: A => B => C): (A,B) => C = {
    (a: A, b: B) => (f(a)(b))
  }

  // Ex 2.5
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
        (a: A) => f(g(a: A))
//    f compose g
//     g andThen f
  }
}
