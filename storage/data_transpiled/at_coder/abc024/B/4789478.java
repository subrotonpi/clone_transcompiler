public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( a [ i + 1 ] - a [ i ] > T ) cnt += T ;
    else cnt += a [ i + 1 ] - a [ i ] ;
  }
  return cnt ;
}
