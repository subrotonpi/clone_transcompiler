public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] imos = new int [ R + 1 ] [ C + 1 ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    String s = input . readLine ( ) ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( s . charAt ( j ) == 'x' ) {
        for ( int k = 0 ;
        k < K ;
        k ++ ) {
          if ( i - k >= 0 ) {
            imos [ i - k ] [ Math . max ( 0 , j - K + k + 1 ) ] ++ ;
            imos [ i - k ] [ Math . min ( C , j + K - k ) ] -- ;
          }
          if ( i + k < R ) {
            imos [ i + k ] [ Math . max ( 0 , j - K + k + 1 ) ] ++ ;
          }
        }
      }
    }
  }
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 1 ;
    j <= C ;
    j ++ ) {
      if ( imos [ j ] [ y ] <= 0 ) {
        res ++ ;
      }
    }
  }
  System . out . println ( res ) ;
  return 0 ;
}
