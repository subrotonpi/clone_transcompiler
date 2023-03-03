public static int N ( int x ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a : input . nextLine ( ) . split ( " " ) ) {
    A [ a ] = Integer . parseInt ( a ) ;
  }
  int s = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int t = A [ i - 1 ] + A [ i ] ;
    if ( t > x ) {
      s += t - x ;
      A [ i ] = Math . max ( 0 , A [ i ] + x - t ) ;
    }
  }
  System . out . println ( s ) ;
  return s ;
}
