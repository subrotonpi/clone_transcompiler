public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( T ) ) {
    String string = in . nextLine ( ) ;
    int base = new HashSet < > ( string . length ( ) ) . size ( ) ;
    if ( base == 1 ) base = 2 ;
    int ans = 1 ;
    Map < Character , Integer > map = new HashMap < > ( ) ;
    map . put ( string . charAt ( 0 ) , 1 ) ;
    int next = 0 ;
    for ( int i = 1 ;
    i < string . length ( ) ;
    i ++ ) {
      ans *= base ;
      if ( map . containsKey ( string . charAt ( i ) ) ) ans += map . get ( string . charAt ( i ) ) ;
      else {
        ans += next ;
        map . put ( string . charAt ( i ) , next ) ;
        next = next == 0 ? 2 : next + 1 ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return ans ;
}
