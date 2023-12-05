@ VisibleForTesting static Iterable < String > iterable ( ) {
  for ( int i = 0 ;
  i < Integer . parseInt ( input . nextLine ( ) ) ;
  i ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < Integer , String > l = Maps . newHashMap ( ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      l . put ( j , "YES" ) ;
    }
    String ans = "YES" ;
    while ( l . size ( ) > 0 ) {
      int ly = Collections . min ( l . keySet ( ) , l . get ( new Integer ( j ) ) ) ;
      int lx = Collections . min ( l . keySet ( ) , l . get ( new Integer ( j ) ) ) ;
      String lowest = l . get ( new Integer ( ly ) ) ;
      if ( Arrays . equals ( l . get ( new Integer ( lx ) ) , lowest ) ) {
        for ( int j = 0 ;
        j < m ;
        j ++ ) {
          l . remove ( new Integer ( ly ) ) ;
        }
      }
      else if ( Arrays . equals ( l . get ( new Integer ( lx ) ) , lowest ) ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          l . remove ( new Integer ( j ) ) ;
        }
      }
      else {
        ans = "NO" ;
        break ;
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
  }
  return l ;
}
