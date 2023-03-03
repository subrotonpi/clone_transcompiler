@ VisibleForTesting static Iterable < String > combinations ( ) {
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    String [ ] S = new String [ M ] ;
    for ( int m : xrange ( M ) ) S [ m ] = scanner . nextLine ( ) ;
    int nodes = 0 ;
    int ways = 0 ;
    for ( int comb : xrange ( N ) ) {
      T = new HashSet [ comb ] ;
      for ( int n : xrange ( N ) ) T [ comb ] = new HashSet < String > ( ) ;
      for ( int m : xrange ( M ) ) {
        String s = S [ m ] ;
        for ( int i : xrange ( 0 , s . length ( ) + 1 ) ) T [ comb ] . add ( s . substring ( 0 , i ) ) ;
      }
      int cnt = 0 ;
      for ( int n : xrange ( N ) ) cnt += T [ n ] . size ( ) ;
      if ( cnt > nodes ) {
        ways = 1 ;
        nodes = cnt ;
      }
      else if ( cnt == nodes ) ways ++ ;
    }
    System . out . printf ( "Case #%d: %d %d%n" , t , nodes , ways ) ;
  }
  return Arrays . asList ( S ) ;
}
