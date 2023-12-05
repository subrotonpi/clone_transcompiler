public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , w = Integer . parseInt ( input ) ;
  int [ ] [ ] w4 = new int [ 4 ] [ 4 ] ;
  int w1 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ws = Integer . parseInt ( input ) , vs = Integer . parseInt ( input ) ;
    if ( i == 0 ) {
      w1 = ws ;
    }
    ws -= w1 ;
    w4 [ ws ] [ 0 ] = vs ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    Arrays . sort ( w4 [ i ] , Collections . reverseOrder ( ) ) ;
    int [ ] tmp = new int [ w4 [ i ] . length ] ;
    tmp [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < w4 [ i ] . length ;
    j ++ ) {
      tmp [ j ] = tmp [ tmp . length - 1 ] + w4 [ i ] [ j ] ;
    }
    w4 [ i ] = tmp ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < w4 [ 0 ] . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < w4 [ 1 ] . length ;
    j ++ ) {
      for ( int k = 0 ;
      k < w4 [ 2 ] . length ;
      k ++ ) {
        for ( int l = 0 ;
        l < w4 [ 3 ] . length ;
        l ++ ) {
          if ( w >= w1 * ( i + j + k + l ) + j + 2 * k + 3 * l ) {
            ans = Math . max ( ans , w4 [ 0 ] [ i ] + w4 [ 1 ] [ j ] + w4 [ 2 ] [ k ] + w4 [ 3 ] [ l ] ) ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
