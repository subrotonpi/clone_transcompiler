private static int chk ( int h , int w ) {
  for ( int i = 1 ;
  i < 8 ;
  i ++ ) {
    if ( 0 <= 1 * i + h && 0 <= 0 * i + w && b [ 1 * i + h ] [ 0 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= - 1 * i + h && 0 <= 0 * i + w && b [ 0 * i + h ] [ 0 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= 0 * i + h && 0 <= - 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= 0 * i + h && 0 <= 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= - 1 * i + h && 0 <= - 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= 1 * i + h && 0 <= - 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= 1 * i + h && 0 <= - 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
    if ( 0 <= 1 * i + h && 0 <= 1 * i + w && b [ 0 * i + h ] [ 0 ] == "Q" ) return 0 ;
    if ( 0 <= 1 * i + h && 0 <= 1 * i + w && b [ 0 * i + h ] [ 1 * i + w ] == "Q" ) return 0 ;
  }
  int q = 0 ;
  b = new String [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    String tmp = input . next ( ) ;
    q += tmp . length ( ) ;
    b [ i ] = tmp ;
  }
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    String tmp = input . next ( ) ;
    if ( i == 0 ) {
      for ( int j = 0 ;
      j < b . length ;
      j ++ ) System . out . println ( ( i + j )