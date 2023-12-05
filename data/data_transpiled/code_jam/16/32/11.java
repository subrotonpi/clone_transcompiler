private static void solve ( String a ) throws IOException {
  int b = Integer . parseInt ( a . substring ( 0 , a . indexOf ( " " ) ) ) ;
  int m = Integer . parseInt ( a . substring ( a . indexOf ( " " ) + 1 , a . length ( ) ) ) ;
  if ( m > 2 * ( b - 2 ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
    return ;
  }
  a = new int [ b ] [ b ] ;
  for ( int i : xrange ( b ) ) {
    for ( int j : xrange ( i + 1 , b ) ) {
      a [ i ] [ j ] = 1 ;
    }
  }
  int current = 2 * ( b - 2 ) ;
  int bias = b - 3 ;
  while ( ( current > m ) && ( bias >= 0 ) ) {
    if ( ( current - 2 * bias >= m ) ) {
      a [ bias + 1 ] [ b - 1 ] = 0 ;
      current -= 2 * bias ;
    }
    bias -- ;
  }
  if ( ( current != m ) && ( current != m ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    System . out . println ( "POSSIBLE" ) ;
    for ( int i : xrange ( b ) ) {
      System . out . println ( Arrays . toString ( a ) ) ;
    }
  }
  Scanner scanner = new Scanner ( new File ( "B-large.in" ) ) ;
  scanner . useDelimiter ( "\\A" ) ;
  int T = Integer . parseInt ( scanner . next ( ) ) ;
  for ( int i : xrange ( T ) ) {
    System . out . format ( "Case #%d:%n" , i + 1 ) ;
    solve ( scanner . next ( ) ) ;
  }
}
