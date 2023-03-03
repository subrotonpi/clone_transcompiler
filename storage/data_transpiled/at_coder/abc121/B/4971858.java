static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = new int [ N ] ;
  }
  int cnt = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    int sum = 0 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      sum += a [ k ] [ j ] * B [ j ] ;
    }
    if ( sum + C > 0 ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
  return cnt ;
}
