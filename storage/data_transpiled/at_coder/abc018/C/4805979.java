public static int [ ] [ ] input ( ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Character >> S = new ArrayList < > ( ) ;
  S . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  List < int [ ] > [ ] imos = new List [ r + 1 ] [ c + 1 ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( S . get ( i ) . get ( j ) == 'x' ) {
        for ( int kk = 0 ;
        kk < k ;
        kk ++ ) {
          if ( i - kk >= 0 ) {
            imos [ i - kk ] [ Math . max ( 0 , j - k + kk + 1 ) ] ++ ;
            imos [ i - kk ] [ Math . min ( c , j + k - kk ) ] -- ;
          }
          if ( i + kk < r ) {
            imos [ i + kk ] [ j ] += imos [ i ] [ j - 1 ] ;
          }
        }
      }
    }
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 1 ;
    j <= c - k ;
    j ++ ) {
      if ( imos [ i ] [ j ] == 0 ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
  return imos ;
}
