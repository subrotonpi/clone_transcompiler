public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = inpl ( ) ;
  int A4 = 0 ;
  int A2 = 0 ;
  int A1 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] % 4 == 0 ) A4 ++ ;
    else if ( a [ i ] % 2 == 0 ) A2 = 1 ;
    else A1 ++ ;
  }
  if ( ( A4 + A2 + A1 ) / 2 <= A4 ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return a ;
}
