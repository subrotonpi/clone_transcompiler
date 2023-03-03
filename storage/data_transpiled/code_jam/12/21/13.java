@ Sys public static void fill ( double [ ] si , double tot ) {
  for ( int j : xrange ( si . length - 1 ) ) {
    if ( si [ j ] < si [ j + 1 ] ) {
      double diff = Math . min ( tot , ( si [ j + 1 ] - si [ j ] ) * ( j + 1 ) ) ;
      si [ j ] += ( double ) diff / ( j + 1 ) ;
      tot -= diff ;
      for ( int k : xrange ( 0 , j ) ) {
        s [ k ] = s [ j ] ;
      }
      if ( tot <= 0.0 ) {
        break ;
      }
    }
  }
  double diff = ( double ) tot / si . length ;
  for ( int k : xrange ( 0 , si . length ) ) {
    si [ k ] += diff ;
  }
  /* solve the array */
  double [ ] ans = new double [ si . length ] ;
  double tot = sum ( si ) ;
  double [ ] [ ] xi = new double [ si . length ] [ si . length ] ;
  for ( int j = 0 ;
  j < si . length ;
  j ++ ) {
    xi [ j ] = ( s [ j ] == 0 ) ? 1.0 : 0.0 ;
  }
  Arrays . sort ( xi ) ;
  Arrays . sort ( ans ) ;
  fill ( si , tot ) ;
  si = new double [ si . length ] [ ] ;
  for ( int j = 0 ;
  j < si . length ;
  j ++ ) {
    si [ j ] = ( xi [ j ] [ 1 ] == 0 ) ? 1.0 : 0.0 ;
  }
  Arrays . sort ( si ) ;
  Arrays . sort ( ans ) ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int case = 1 ;
  case <= t ;
  case ++ ) {
    int [ ] s = new int [ t ] ;
    for ( int x = readLine ( ) . split ( " " ) . length - 1 ;
    x >= 0 ;
    x -- ) {
      s [ x ] = solve ( s ) ;
    }
    System . out . print ( "Case #" + case + ":" ) ;
    for ( int a : s ) {
      System . out . print ( " " + ( a * 100.0 ) ) ;
    }
    System . out . println ( ) ;
  }
}
