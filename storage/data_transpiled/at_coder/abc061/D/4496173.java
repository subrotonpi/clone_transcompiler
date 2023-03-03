public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int e [ ] [ ] = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    e [ i ] [ 0 ] = new int [ ] {
      a - 1 , b - 1 , c }
      ;
    }
    double maxdis [ ] = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      maxdis [ i ] = - Double . MAX_VALUE ;
    }
    maxdis [ 0 ] = 0 ;
    boolean mugen = false ;
    for ( int i = 0 ;
    i < 2 * n ;
    i ++ ) {
      for ( int j = 0 ;
      j < e . length ;
      j ++ ) {
        int st = e [ j ] [ 0 ] ;
        int gl = e [ j ] [ 1 ] ;
        double cost = e [ j ] [ 2 ] ;
        if ( ( maxdis [ gl ] < maxdis [ st ] + cost ) && ( i < n - 1 ) ) {
          maxdis [ gl ] = maxdis [ st ] + cost ;
          if ( ( i >= n - 1 ) && ( gl == n - 1 ) ) {
            mugen = true ;
            break ;
          }
        }
      }
    }
    if ( mugen ) {
      System . out . println ( "inf" ) ;
    }
    else {
      System . out . println ( maxdis [ n - 1 ] ) ;
    }
  }
  