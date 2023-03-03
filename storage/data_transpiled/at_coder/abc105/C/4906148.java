public static String solve ( int n ) {
  if ( n == 0 ) {
    return "0" ;
  }
  int p = 2 ;
  StringBuilder sb = new StringBuilder ( ) ;
  while ( n != 0 ) {
    if ( n % p == 0 ) {
      sb . append ( 0 ) ;
    }
    else {
      n -= ( p / 2 ) ;
      sb . append ( 1 ) ;
    }
    p *= - 2 ;
  }
  return sb . toString ( ) ;
}
