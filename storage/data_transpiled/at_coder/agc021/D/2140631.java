public static int solve ( String s , int k ) {
  int n = s . length ( ) ;
  if ( k >= n / 2 ) {
    return n ;
  }
  int [ ] [ ] dpp = new int [ k + 1 ] [ ] ;
  for ( int r = 1 ;
  r < n ;
  r ++ ) {
    int [ ] [ ] dpc = new int [ r + 2 ] [ ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      dpc [ i ] = new int [ k + 1 ] ;
    }
    dpc [ r ] = new int [ k + 1 ] ;
    for ( int l = r - 1 ;
    l >= 0 ;
    l -- ) {
      int [ ] dpl = dpc [ l ] , dpl1 = dpp [ l + 1 ] ;
      if ( s . charAt ( l ) == s . charAt ( r ) ) {
        dpc [ l ] = new int [ ] {
          dpl1 [ 0 ] + 2 }
          ;
        }
        else {
          int [ ] dppl = dpp [ l ] , dpcl1 = dpc [ l + 1 ] ;
          dpl [ 0 ] = Math . max ( dppl [ 0 ] , dpcl1 [ 0 ] ) ;
          for ( int p = 1 ;
          p <= k ;
          p ++ ) {
            dpl [ p ] = Math . max ( dppl [ p ] , dpcl1 [ p ] , dpl1 [ p - 1 ] + 2 ) ;
          }
        }
      }
      dpp = dpc ;
    }
    return dpp [ 0 ] [ k ] ;
  }
  