@ VisibleForTesting static Iterable < String > combinations ( int ti ) {
  for ( int ti = 1 ;
  ti <= Integer . MAX_VALUE ;
  ti ++ ) {
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    String [ ] s = new String [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) s [ i ] = input . nextLine ( ) ;
    Arrays . sort ( s ) ;
    int most = 0 ;
    int ways = 0 ;
    for ( int [ ] perm : new int [ n ] ) {
      if ( ! Arrays . equals ( perm , s ) ) continue ;
      int nodes = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        String x = "" ;
        nodes ++ ;
        for ( int j = 0 ;
        j < m ;
        j ++ ) {
          if ( perm [ j ] != i ) continue ;
          String y = s [ j ] ;
          int k = 0 ;
          while ( k < x . length ( ) && k < y . length ( ) && x . charAt ( k ) == y . charAt ( k ) ) k ++ ;
          nodes += y . length ( ) - k ;
          x = y ;
        }
      }
      if ( nodes > most ) {
        most = nodes ;
        ways = 1 ;
      }
      else if ( nodes == most ) ways ++ ;
    }
    System . out . println ( "Case #" + ti + ":" + most + " " + ways ) ;
  }
  return new Iterable < String > ( ) {
    @ Override public Iterator < String > iterator ( ) {
      return new Iterator < String > ( ) {
        @ Override public boolean hasNext ( ) {
          return true ;
        }
        @ Override public String next ( ) {
          return s [ 0 ] ;
        }
        @ Override public String next ( ) {
          return s [ 1 ] ;
        }
        @ Override public String remove ( ) {
          return s [ 2 ] ;
        }
      }
      ;
    }
  }
  ;
}
