public static void readFile ( InputStream in ) throws IOException {
  PrintStream out = new PrintStream ( new FileOutputStream ( "square_tiles.out" ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  /* fill spot */
  if ( R - 1 >= C - 1 ) {
    return ;
  }
  for ( int i2 : xrange ( R , i + 2 ) ) {
    for ( int j2 : xrange ( j , j + 2 ) ) {
      if ( grid [ i2 ] [ j2 ] != '#' ) {
        return ;
      }
    }
  }
  grid [ i ] [ j ] = '/' ;
  grid [ i ] [ j + 1 ] = '\\' ;
  grid [ i + 1 ] [ j ] = '\\' ;
  grid [ i + 1 ] [ j + 1 ] = '/' ;
  /* convertToRed */
  for ( int i : xrange ( R ) ) {
    for ( int j : xrange ( C ) ) {
      if ( grid [ i ] [ j ] == '#' ) {
        if ( ! fillSpot ( i , j ) ) {
          return ;
        }
      }
    }
  }
  /* convert to red */
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int R = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    int C = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    char [ ] [ ] grid = new char [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      grid [ i ] [ j ] = in . read ( ) ;
    }
    out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    if ( ! convertToRed ( ) ) {
      out . println ( "Impossible" ) ;
      continue ;
    }
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      out . println ( new String ( grid [ i ] ) ) ;
    }
  }
}
