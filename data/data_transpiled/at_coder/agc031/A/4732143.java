public static int n = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  Set < String > sSet = new HashSet < String > ( s ) ;
  int [ ] S = new int [ sSet . size ( ) ] ;
  for ( int i = 0 ;
  i < sSet . size ( ) ;
  i ++ ) {
    S [ i ] = s . indexOf ( sSet . get ( i ) ) ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    ans *= S [ i ] + 1 ;
    ans %= 10 * 9 + 7 ;
  }
  System . out . println ( ans - 1 ) ;
  return ans ;
}
