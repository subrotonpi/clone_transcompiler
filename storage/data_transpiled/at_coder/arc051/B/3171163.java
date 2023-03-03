public static void fib ( int a , int b , int cnt ) {
  if ( K == cnt ) {
    System . out . println ( a + b ) ;
    exit ( ) ;
  }
  else {
    cnt ++ ;
    fib ( a + b , a , cnt ) ;
  }
}
