public static int N = Integer . parseInt ( input ) {
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    int g1 = 0 , g2 = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( i > j ) & 1 ) g1 += t [ j ] ;
      else g2 += t [ j ] ;
    }
    ans = Math . min ( ans , Math . max ( g1 , g2 ) ) ;
  }
  return ans ;
}
