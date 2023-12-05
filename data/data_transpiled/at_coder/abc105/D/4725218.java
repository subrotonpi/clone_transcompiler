public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  int ans = 0 , s = 0 ;
  for ( int a : A ) {
    s += a ;
    s %= M ;
    ans += map . getOrDefault ( s , 0 ) ;
    map . put ( s , map . getOrDefault ( s , 0 ) + 1 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
