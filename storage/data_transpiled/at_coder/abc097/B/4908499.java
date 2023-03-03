static final int input ( ) {
  int x = Integer . parseInt ( input ( ) ) ;
  int t = Math . floor ( x * ( 1 / 2 ) ) ;
  int [ ] a = new int [ t ] ;
  a [ t ] = 1 ;
  for ( int i = 2 ;
  i <= t ;
  i ++ ) {
    int b = i ;
    while ( ( b <= x ) && ( b < a [ b ] ) ) {
      a [ t ] ++ ;
      b *= i ;
    }
  }
  System . out . println ( max ( a ) ) ;
  return a [ t ] ;
}
