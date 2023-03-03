public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  int [ ] haveEdgeTo = new int [ N ] ;
  int [ ] bipow = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = inpl ( ) ;
    int y = inpl ( ) ;
    haveEdgeTo [ y ] += bipow [ x ] ;
  }
  int [ ] DP = new int [ 2 * N ] ;
  for ( int i = 1 ;
  i <= 2 * N ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int S_minus_v = i & ~ bipow [ j ] ;
      if ( ( ( i >> j ) & 1 ) == 0 || ( haveEdgeTo [ j ] & S_minus_v ) != 0 ) continue ;
      tmp += DP [ S_minus_v ] ;
    }
    DP [ i ] = Math . max ( 1 , tmp ) ;
  }
  System . out . println ( DP [ DP . length - 1 ] ) ;
  return DP ;
}
