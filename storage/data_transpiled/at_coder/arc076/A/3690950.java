public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] fac = new int [ N + 3 ] ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) fac [ i + 1 ] = 1 ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) fac [ i + 1 ] = ( i + 1 ) * fac [ i ] % mod ;
  if ( Math . abs ( N - M ) > 1 ) System . out . println ( 0 ) ;
  else if ( N == M ) System . out . println ( 2 * fac [ N ] * fac [ M ] % mod ) ;
  else System . out . println ( fac [ N ] * fac [ M ] % mod ) ;
  return fac ;
}
