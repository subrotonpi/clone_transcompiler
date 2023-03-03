public static int [ ] [ ] createArray ( int N ) {
  List < List < Integer >> D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] P = new int [ Q ] [ Q ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) P [ i ] = new int [ Q ] ;
  int [ ] [ ] S = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) S [ i + 1 ] [ j + 1 ] = S [ i ] [ j + 1 ] + S [ i + 1 ] [ j ] - S [ i ] [ j ] + D [ i ] [ j ] ;
  int [ ] [ ] val = new int [ N * N + 1 ] [ N * N + 1 ] ;
  for ( int x1 = 0 ;
  x1 <= N ;
  x1 ++ ) for ( int x2 = x1 + 1 ;
  x2 <= N ;
  x2 ++ ) for ( int y1 = 0 ;
  y1 <= N ;
  y1 ++ ) for ( int y2 = y1 + 1 ;
  y2 <= N ;
  y2 ++ ) {
    int area = ( x2 - x1 ) * ( y2 - y1 ) ;
    int v = S [ x2 ] [ y2 ] - S [ x1 ] [ y2 ] - S [ x2 ] [ y1 ] + S [ x1 ] [ y1 ] ;
    val [ area ] = Math . max ( val [ area ] , v ) ;
  }
  for ( int i = 0 ;
  i <= N * N ;
  i ++ ) val [ i + 1 ] = Math . max ( val [ i + 1 ] , val [ i ] ) ;
  for ( int p : P ) System . out . println ( val [ p ] ) ;
  return P ;
}
