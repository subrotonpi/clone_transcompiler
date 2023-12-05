public static void tcou ( Scanner in ) {
  for ( int tnum = 0 ;
  tnum < tcou ;
  tnum ++ ) {
    int n = in . nextInt ( ) , m = in . nextInt ( ) ;
    int [ ] [ ] tbl = new int [ n ] [ m ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) tbl [ i ] = in . nextInt ( ) ;
    boolean [ ] [ ] good = new boolean [ n ] [ m ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) for ( int j = 0 ;
    j < m ;
    j ++ ) good [ ( i ) ] [ j ] = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int M = Collections . max ( tbl [ i ] ) ;
      for ( int j = 0 ;
      j < m ;
      j ++ ) if ( tbl [ i ] [ j ] == M ) good [ i ] [ j ] = true ;
    }
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int M = Collections . max ( tbl [ i ] ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) if ( tbl [ i ] [ j ] == M ) good [ i ] [ j ] = true ;
    }
    System . out . println ( "Case #" + ( tnum + 1 ) + ": " + ( false == good . values ( ) . length ? "NO" : "YES" ) ) ;
  }
}
