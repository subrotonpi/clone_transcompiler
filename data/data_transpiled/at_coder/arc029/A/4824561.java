public static long getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  long ans = 100000000000 ;
  int n = N ;
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( ( 1 & i >> j ) == 1 ) ) {
        arr [ j ] = 1 ;
      }
      else {
        arr [ j ] = 0 ;
      }
    }
    long aTime = 0 ;
    long bTime = 0 ;
    long time = 0 ;
    for ( int j = 0 ;
    j < arr . length ;
    j ++ ) {
      if ( arr [ j ] == 0 ) {
        aTime += t [ j ] ;
      }
      else {
        bTime += t [ j ] ;
      }
    }
    time = Math . max ( aTime , bTime ) ;
    ans = Math . min ( ans , time ) ;
  }
  return ans ;
}
