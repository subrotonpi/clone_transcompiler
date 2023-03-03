public static int [ ] [ ] getS ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] P = new int [ Q ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] S_BR = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) for ( int x = i ;
  x < N ;
  x ++ ) for ( int y = j ;
  y < N ;
  y ++ ) S_BR [ i ] [ j ] += D . get ( x ) . get ( y ) ;
  int [ ] S = new int [ N * N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) for ( int x = i + 1 ;
  x <= N ;
  x ++ ) for ( int y = j + 1 ;
  y <= N ;
  y ++ ) {
    int s ;
    if ( y < N && x < N ) s = S_BR [ i ] [ j ] - S_BR [ i ] [ y ] - S_BR [ x ] [ j ] + S_BR [ x ] [ y ] ;
    else if ( y >= N && x >= N ) s = S_BR [ i ] [ j ] ;
    else if ( y >= N ) s = S_BR [ i ] [ j ] - S_BR [ x ] [ j ] ;
    else if ( x >= N ) s = S_BR [ i ] [ j ] - S_BR [ i ] [ y ] ;
    else throw new RuntimeException ( ) ;
    S [ ( x - i ) * ( y - j ) - 1 ] = Math . max ( S [ ( x - i ) * ( y - j ) - 1 ] , s ) ;
  }
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) S [ i ] = Math . max ( S [ i -