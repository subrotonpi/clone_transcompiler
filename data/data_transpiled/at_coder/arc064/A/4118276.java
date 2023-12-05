public static int N ( int x ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( ( a [ i ] + a [ i + 1 ] ) > x ) {
      int s = ( a [ i ] + a [ i + 1 ] - x ) ;
      a [ i + 1 ] = Math . max ( a [ i + 1 ] - s , 0 ) ;
      ans += s ;
    }
  }
  return ans ;
}
