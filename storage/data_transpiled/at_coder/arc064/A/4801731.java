public static int N ( int x ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = 0 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] + A [ i + 1 ] >= x ) {
      ans += A [ i ] + A [ i + 1 ] - x ;
      A [ i + 1 ] -= A [ i ] + A [ i + 1 ] - x ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
