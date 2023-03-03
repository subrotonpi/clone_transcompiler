public static int n = Integer . parseInt ( input ) {
  int D = Integer . numberOfTrailingZeros ( n ) - 2 ;
  {
    int x = 1 ;
    for ( int d = 0 ;
    d < 100 ;
    d ++ ) {
      if ( d % 2 == D % 2 ) {
        x *= 2 ;
      }
      else {
        x = 2 * x + 1 ;
      }
      if ( x > n ) {
        break ;
      }
    }
  }
  if ( n % 2 != 0 ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    System . out . println ( "Aoki" ) ;
  }
  return d ;
}
