public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = i ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ans += Math . min ( B , ( x [ i + 1 ] - x [ i ] ) * A ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
