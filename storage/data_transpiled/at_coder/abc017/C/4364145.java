public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = 0 ;
  int r = 0 ;
  int s = 0 ;
  int [ ] X = new int [ M ] ;
  int S = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l = Integer . parseInt ( input . nextLine ( ) ) ;
    r = Integer . parseInt ( input . nextLine ( ) ) ;
    s = l -- ;
    if ( 0 <= l && l < M ) X [ l ] += s ;
    if ( 0 <= r + 1 && r < M ) X [ r + 1 ] -= s ;
    S += s ;
  }
  int [ ] A = new int [ M ] ;
  A [ 0 ] = X [ 0 ] ;
  for ( int i = 1 ;
  i < M ;
  i ++ ) A [ i ] = X [ i ] + A [ i - 1 ] ;
  System . out . println ( S - min ( A ) ) ;
  return A ;
}
