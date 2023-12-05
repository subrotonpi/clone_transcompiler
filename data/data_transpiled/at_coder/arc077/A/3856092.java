public static void print ( int a ) {
  int [ ] ar = Integer . parseInt ( input ( ) ) ;
  StringBuilder br = new StringBuilder ( ) ;
  if ( a % 2 == 0 ) {
    for ( int i = ar . length - 1 ;
    i > 0 ;
    i -= 2 ) br . append ( ar [ i ] ) ;
    for ( int i = 0 ;
    i <= ar . length - 1 ;
    i += 2 ) br . append ( ar [ i ] ) ;
  }
  else br . append ( a ) ;
}
