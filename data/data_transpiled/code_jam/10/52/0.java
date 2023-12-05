public static void solve ( int casenum , int [ ] [ ] args ) {
  for ( int i = 1 ;
  i < args . length ;
  i ++ ) {
    Arrays . fill ( args [ i ] , Integer . parseInt ( args [ i ] [ 0 ] ) ) ;
  }
  int [ ] Bs = new int [ args . length ] ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) {
    Arrays . fill ( args [ i ] , Integer . parseInt ( args [ i ] [ 1 ] ) ) ;
  }
  int maxB = Collections . max ( Arrays . asList ( args ) ) ;
  Arrays . fill ( Bs , Integer . MIN_VALUE ) ;
  int [ ] nu = new int [ 10 * 200 ] ;
  nu [ 0 ] = 0 ;
  int [ ] q = new int [ 2 ] ;
  q [ 0 ] = new int [ 2 ] ;
  q [ 1 ] = new int [ 2 ] ;
  while ( ( q . length > 0 ) && ( ( nu [ qe [ 0 ] ] ) == qe [ 1 ] ) ) {
    for ( int i = 0 ;
    i < Bs . length ;
    i ++ ) {
      int [ ] qe = q [ i ] ;
      q = new int [ 2 ] ;
      if ( ( nu [ qe [ 0 ] ] ) == qe [ 1 ] ) {
        for ( int j = 0 ;
        j < qe . length ;
        j ++ ) {
          int b = Bs [ j ] ;
          int [ ] qf ;
          if ( ( qe [ 0 ] + b ) < maxB ) {
            qf = new int [ 2 ] ;
            qf [ 0 ] = qe [ 0 ] + b ;
            qf [ 1 ] = qe [ 1 ] + 1 ;
          }
          else {
            qf = new int [ 2 ] ;
            qf [ 0 ] = qe [ 0 ] + b - maxB ;
            qf [ 1 ] = qe [ 1 ] ;
          }
          if ( qf [ 1 ] < nu [ qf [ 0 ] ] ) {
            nu [ qf [ 0 ] ] = qf [ 1 ] ;
            q [ i ] = new int [ 2 ] ;
          }
        }
      }
    }
  }
  if ( ( nu [ L % maxB ] ) != ( 10 * 200 ) ) System . out . println ( "Case #" + casenum + ": " + ( nu [ L % maxB ] + ( L / maxB ) ) ) ;
  