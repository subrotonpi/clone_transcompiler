public static void solve ( int R , int C , char [ ] [ ] p ) {
  for ( int i : xrange ( 1 , R ) ) {
    for ( int j : xrange ( 1 , C ) ) {
      if ( p [ i ] [ j ] == p [ i ] [ j - 1 ] == p [ i - 1 ] [ j ] == p [ i - 1 ] [ j - 1 ] == '#' ) {
        p [ i - 1 ] [ j - 1 ] = '/' ;
        p [ i - 1 ] [ j ] = '\\' ;
        p [ i ] [ j - 1 ] = '\\' ;
        p [ i ] [ j ] = '/' ;
      }
    }
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    R = Integer . parseInt ( readLine ( ) ) ;
    C = Integer . parseInt ( readLine ( ) ) ;
    p = new char [ R ] [ C ] ;
    for ( int j : xrange ( R ) ) {
      char [ ] row = new char [ C ] ;
      for ( char c : readLine ( ) ) {
        row [ j ] = c ;
      }
      p [ j ] = row ;
    }
    solve ( R , C , p ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    boolean ok = true ;
    for ( int r : xrange ( R ) ) {
      for ( int c : xrange ( C ) ) {
        if ( p [ r ] [ c ] == '#' ) {
          ok = false ;
        }
      }
    }
    if ( ok ) {
      for ( char [ ] row : p ) {
        System . out . print ( row ) ;
      }
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
}
