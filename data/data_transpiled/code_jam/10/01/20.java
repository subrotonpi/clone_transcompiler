static final void solve ( ) throws IOException {
  if ( args . length > 0 ) {
    System . setIn ( new FileInputStream ( args [ 0 ] + ".in" ) ) ;
    System . setOut ( new FileOutputStream ( args [ 0 ] + ".out" ) ) ;
  }
  /* solve */
  int n = Integer . parseInt ( args [ 0 ] ) ;
  int k = Integer . parseInt ( args [ 1 ] ) ;
  if ( ( k + 1 ) % ( 1 << n ) == 0 ) {
    /* on */
    return ;
  }
  else {
    /* off */
    return ;
  }
  int ccc = Integer . parseInt ( args [ 0 ] ) ;
  for ( int cc = 1 ;
  cc <= ccc ;
  cc ++ ) {
    System . out . println ( "Case #" + cc + ": " + solve ( ) ) ;
  }
}
