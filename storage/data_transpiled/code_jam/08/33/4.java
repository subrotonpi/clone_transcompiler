public static long solve ( ) {
  int signs = Integer . parseInt ( readLine ( ) ) ;
  int genlen = Integer . parseInt ( readLine ( ) ) ;
  int X = Integer . parseInt ( readLine ( ) ) ;
  int Y = Integer . parseInt ( readLine ( ) ) ;
  int Z = Integer . parseInt ( readLine ( ) ) ;
  int [ ] gen = new int [ genlen ] ;
  for ( int i = 0 ;
  i < genlen ;
  i ++ ) gen [ i ] = Integer . parseInt ( readLine ( ) ) ;
  HashMap < Integer , Integer > r = new HashMap < Integer , Integer > ( signs ) ;
  for ( int i : xrange ( signs ) ) {
    int limit = gen [ i % genlen ] ;
    gen [ i % genlen ] = ( X * limit + Y * ( i + 1 ) ) % Z ;
    HashMap < Integer , Integer > s = new HashMap < Integer , Integer > ( ) ;
    for ( Map . Entry < Integer , Integer > e : r . entrySet ( ) ) {
      int j = e . getKey ( ) ;
      int n = e . getValue ( ) ;
      s . put ( j , s . get ( j ) + n ) ;
      if ( limit > j ) s . put ( limit , s . get ( limit ) + n ) ;
    }
    r = s ;
  }
  return ( Long . valueOf ( s . values ( ) . iterator ( ) . next ( ) ) - 1 ) % 1000000007 ;
}
