static final int [ ] binarySearch ( int A , int B , int Q ) {
  int INF = 10 * 11 ;
  int [ ] s = new int [ A ] ;
  int [ ] t = new int [ B ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) s [ i ] = - INF ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) t [ i ] = - INF ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int min = INF ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Arrays . binarySearch ( s , x ) ;
    int d = Arrays . binarySearch ( t , x ) ;
    for ( int S = s [ b - 1 ] ;
    S <= s [ b ] ;
    S ++ ) {
      for ( int T = t [ d - 1 ] ;
      T <= t [ d ] ;
      T ++ ) {
        min = Math . min ( Math . abs ( S - x ) + Math . abs ( T - S ) , Math . abs ( T - x ) + Math . abs ( S - T ) , min ) ;
      }
    }
  }
  System . out . println ( min ) ;
  return s ;
}
