public static void main ( String [ ] args ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    final String R = br . readLine ( ) . trim ( ) ;
    final String C = br . readLine ( ) . trim ( ) ;
    final int M = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    final int E = R * C - M ;
    System . out . println ( "Case #" + i + ":" ) ;
    if ( canPass ( R , C , E ) ) printGrid ( R , C , E ) ;
    else System . out . println ( "Impossible" ) ;
  }
  /* print grid */
  int rowsFilled = 0 ;
  int E = 0 ;
  if ( R == 1 ) {
    System . out . println ( "c" + "." + ( E - 1 ) + "*" + ( C - E ) ) ;
    return ;
  }
  if ( E == 1 ) {
    System . out . println ( "c" + "*" + ( C - 1 ) ) ;
    rowsFilled = 1 ;
    E = 0 ;
  }
  else {
    int el ;
    if ( C == 1 ) el = 1 ;
    else if ( E == 2 * C + 1 ) el = C - 1 ;
    else if ( E >= 2 * C ) el = C ;
    else if ( E % 2 == 1 ) el = E / 2 - 1 ;
    else el = E / 2 ;
    System . out . println ( "c" + "." + el - 1 ) ;
    System . out . println ( "." + el + "*" + ( C - el ) ) ;
    rowsFilled = 2 ;
    E -= 2 * el ;
  }
  while ( rowsFilled < R ) {
    if ( E > C ) {
      if ( C == 1 ) el = 1 ;
      else if ( E - C == 1 ) el = C - 1 ;
      else el = C ;
      System . out . println ( "." + el + "*" + ( C - el ) ) ;
      E -= el ;
    }
    else {
      System . out . println ( "." + E + "*" + ( C - E ) ) ;
      E = 0 ;
    }
    rowsFilled ++ ;
  }
  /* canPass */
  if