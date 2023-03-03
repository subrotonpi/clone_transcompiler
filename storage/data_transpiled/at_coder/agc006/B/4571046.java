public static int N , x ;
N = Integer . parseInt ( input ) ;
x = input . intValue ( ) ;
if ( x == 1 ) {
  System . out . println ( "No" ) ;
}
else if ( x == 2 * N - 1 ) {
  System . out . println ( "No" ) ;
}
else {
  System . out . println ( "Yes" ) ;
  if ( N == 2 ) {
    for ( int i = 1 ;
    i <= 4 ;
    i ++ ) {
      System . out . println ( i ) ;
    }
  }
  else {
    if ( x != 2 * N - 2 ) {
      L = new int [ N ] ;
      M = new int [ N ] ;
      M [ 0 ] = x + 2 ;
      M [ 1 ] = x - 1 ;
      M [ 2 ] = x ;
      M [ 2 ] = x + 1 ;
      for ( int i = 1 ;
      i <= 2 * N ;
      i ++ ) {
        if ( ! M [ i ] . equals ( M ) ) {
          L [ i ] = i ;
        }
      }
      for ( int j = 0 ;
      j < N - 2 ;
      j ++ ) {
        System . out . println ( L [ j ] ) ;
      }
      for ( int k = 0 ;
      k < 4 ;
      k ++ ) {
        System . out . println ( M [ k ] ) ;
      }
      for ( int l = 0 ;
      l < N - 3 ;
      l ++ ) {
        System . out . println ( L [ l + N - 2 ] ) ;
      }
    }
    else {
      L = new int [ N ] ;
      M = new int [ N ] ;
      M [ 0 ] = x - 2 ;
      M [ 1 ] = x ;
      M [ 2 ] = x + 1 ;
      M [ 3 ] = x - 1 ;
      for ( int i = 1 ;
      i <= 2 * N ;
      i ++ ) {
        if ( ! M [ i ] . equals ( M ) ) {
          L [ i ] = i ;
        }
      }
      for ( int j = 0 ;
      j < N - 2 ;
      j ++ ) {
        System . out . println ( L [ j ] ) ;
      }
      for ( int k = 0 ;
      k < 4 ;
      k ++ ) {
        System . out . println ( M [ k ] ) ;
      }
      for ( int l = 0 ;
      l < N - 3 ;
      l ++ ) {
        System . out . println ( L [ l + N - 2 ] ) ;
      }
    }
  }
}
