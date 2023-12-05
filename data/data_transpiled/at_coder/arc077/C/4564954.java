@ VisibleForTesting static Iterable < Integer > acc ( ) {
  return Lists . accumulate ( X ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  }
  final int [ ] X = new int [ M ] ;
  final int [ ] Y = new int [ M ] ;
  /* tri(int, int, int) */
  {
    if ( l < M ) {
      Y [ l ] += a ;
    }
    if ( r + 1 < M ) {
      Y [ r + 1 ] -= a ;
      X [ r + 1 ] -= ( r - l + 1 ) * a ;
    }
  }
  /* box(int, int, int) */
  {
    if ( l < M ) {
      X [ l ] += a ;
    }
    if ( r + 1 < M ) {
      X [ r + 1 ] -= a ;
    }
  }
  /* calc(int, int) */
  {
    if ( a <= b - 2 ) {
      /* tri(a+2, b) */
    }
    else if ( a > b && a <= b + M - 2 ) {
      /* tri(a+2, M-1) */
      /* tri(0, b) */
      /* box(0, b, -a+M-2) */
    }
  }
  ;
  /* rev */
  final int [ ] ret = acc ( Y ) ;
  final int [ ] ret = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ret [ i ] = X [ i ] + ret [ i ] ;
  }
  /* print ans */
  return ret ;
}
