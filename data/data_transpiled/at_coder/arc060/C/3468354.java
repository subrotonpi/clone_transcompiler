@ VisibleForTesting static int [ ] [ ] binarySearch ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input ) ;
  int L = Integer . parseInt ( input ) ;
  int [ ] [ ] P = new int [ 30 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int q = binarySearch ( X , X [ i ] + L ) ;
    P [ 0 ] [ i ] = q - 1 ;
  }
  for ( int i = 1 ;
  i < 30 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      P [ i ] [ j ] = P [ i - 1 ] [ P [ i - 1 ] [ j ] ] ;
    }
  }
  int Q = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a , b ;
    a = Integer . parseInt ( input ) ;
    if ( a > b ) {
      a = b ;
      b = a ;
    }
    a = a - 1 ;
    b = b - 1 ;
    int num = 0 ;
    for ( int j = 29 ;
    j >= 0 ;
    j -- ) {
      if ( P [ j ] [ a ] < b ) {
        a = P [ j ] [ a ] ;
        num += 2 * j ;
      }
    }
    System . out . println ( num + 1 ) ;
  }
  return P ;
}
