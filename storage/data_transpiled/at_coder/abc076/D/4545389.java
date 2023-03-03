public static double [ ] readDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = Lists . newArrayList ( ) ;
  int [ ] V = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < T [ i ] * b ;
    j ++ ) {
      M [ i ] = V [ i ] ;
    }
  }
  int [ ] R = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    R [ i + 1 ] += T [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int le = R [ i ] * b ;
    int ri = R [ i + 1 ] * b ;
    int j = 0 ;
    if ( i - 1 >= 0 && V [ i - 1 ] > V [ i ] ) {
      while ( le >= 0 ) {
        M [ le ] = Math . min ( M [ le ] , V [ i ] + j * bg ) ;
        j ++ ;
        le -- ;
      }
    }
    j = 0 ;
    if ( i + 1 < n && V [ i + 1 ] > V [ i ] ) {
      while ( ri < M . length ) {
        M [ ri ] = Math . min ( M [ ri ] , V [ i ] + j * bg ) ;
        j ++ ;
        ri ++ ;
      }
    }
  }
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) {
    M [ i ] = Math . min ( i * bg , ( M . length - i ) * bg , M [ i ] ) ;
  }
  M [ 0 ] = 0 ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < M . length - 1 ;
  i ++ ) {
    ans += ( M [ i ] + M [ i + 1 ] ) * bg * 0.5 ;
  }
  System . out . println ( ans ) ;
  return M ;
}
