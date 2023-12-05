public static void input ( int h , int w ) {
  int [ ] [ ] C = new int [ 10 ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] A = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  float inf = Float . POSITIVE_INFINITY ;
  float cost = 0 ;
  float [ ] [ ] D = new float [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    D [ i ] [ i ] = inf ;
  }
  for ( int k = 0 ;
  k < 10 ;
  k ++ ) {
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 10 ;
      j ++ ) {
        D [ i ] [ j ] = Math . min ( C [ i ] [ j ] , C [ i ] [ k ] + C [ k ] [ j ] ) ;
      }
    }
  }
  for ( int k = 0 ;
  k < 10 ;
  k ++ ) {
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 10 ;
      j ++ ) {
        D [ i ] [ j ] = Math . min ( D [ i ] [ j ] , D [ i ] [ k ] + D [ k ] [ j ] ) ;
      }
    }
  }
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      if ( A [ y ] [ x ] == - 1 || A [ y ] [ x ] == 1 ) {
        continue ;
      }
      else {
        cost += D [ A [ y ] [ x ] ] [ 1 ] ;
      }
    }
  }
  System . out . println ( cost ) ;
}
