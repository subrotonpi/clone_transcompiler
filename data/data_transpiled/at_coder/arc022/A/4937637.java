public static void input ( Scanner in ) {
  int [ ] I = new int [ in . nextInt ( ) ] ;
  int [ ] C = new int [ in . nextInt ( ) ] ;
  int [ ] T = new int [ in . nextInt ( ) ] ;
  for ( int j = 0 ;
  j < in . nextInt ( ) ;
  j ++ ) {
    if ( in . next ( ) . equalsIgnoreCase ( "i" ) ) I [ j ] = in . nextInt ( ) + 1 ;
    if ( in . next ( ) . equalsIgnoreCase ( "c" ) ) C [ j ] = in . nextInt ( ) + 1 ;
    if ( in . next ( ) . equalsIgnoreCase ( "t" ) ) T [ j ] = in . nextInt ( ) + 1 ;
  }
  for ( int i = 0 ;
  i < C . length ;
  i ++ ) {
    if ( I [ i ] == 0 || T [ i ] == 0 ) {
      System . out . println ( "NO" ) ;
      break ;
    }
    else if ( I [ 0 ] < C [ i ] && C [ i ] < T [ i ] ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else System . out . println ( "NO" ) ;
}
