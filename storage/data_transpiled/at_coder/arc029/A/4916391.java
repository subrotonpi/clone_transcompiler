public static int N = Integer . parseInt ( input ) {
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int INF = 10 * 9 ;
  int res = INF ;
  for ( int i = 0 ;
  i < 1 << N ;
  i ++ ) {
    int plateA = 0 ;
    int plateB = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) != 0 ) plateB += t [ j ] ;
      else plateA += t [ j ] ;
    }
    res = Math . min ( res , Math . max ( plateA , plateB ) ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
