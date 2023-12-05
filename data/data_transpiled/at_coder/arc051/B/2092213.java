public static void main ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] fib = new int [ 50 ] ;
  for ( int i = 2 ;
  i < 50 ;
  i ++ ) {
    fib [ i ] = fib [ i - 1 ] + fib [ i - 2 ] ;
  }
  System . out . println ( fib [ k + 1 ] + " " + fib [ k ] ) ;
}
