public static void print ( int N ) {
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] q = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) q [ p [ i ] - 1 ] = i ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . print ( 30000 * i + 1 ) ;
    if ( i == N - 1 ) System . out . println ( ) ;
    else System . out . print ( " " ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . print ( 30000 * ( N - i ) + q [ i ] + 1 ) ;
    if ( i == N - 1 ) System . out . println ( ) ;
    else System . out . print ( " " ) ;
  }
}
