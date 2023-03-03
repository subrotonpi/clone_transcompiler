static final int [ ] binarySearch ( int A , int B , int Q ) {
  int INF = 10 * 18 ;
  int [ ] s = new int [ A ] ;
  int [ ] t = new int [ B ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) s [ i ] = - INF ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) t [ i ] = - INF ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = binarySearch ( s , x ) ;
    int d = binarySearch ( t , x ) ;
    int res = INF ;
    for ( int S = s [ b - 1 ] ;
    S <= s [ b ] ;
    S ++ ) for ( int T = t [ d - 1 ] ;
    T <= t [ d ] ;
    T ++ ) {
      int d1 = Math . abs ( S - x ) + Math . abs ( T - S ) , d2 = Math . abs ( T - x ) + Math . abs ( S - T ) ;
      res = Math . min ( res , d1 , d2 ) ;
    }
  }
  System . out . println ( res ) ;
  return s ;
}
