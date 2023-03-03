public static int X = Integer . parseInt ( input ) {
  int a = 0 ;
  for ( int i = 1 ;
  i <= 10 * 9 ;
  i ++ ) {
    a += i ;
    if ( a >= X ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return a ;
}
