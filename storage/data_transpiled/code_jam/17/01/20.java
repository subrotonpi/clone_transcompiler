static int go ( String M ) {
  final String S = M . substring ( 0 , M . length ( ) - 1 ) ;
  final int K = Integer . parseInt ( M . substring ( M . length ( ) - 1 ) ) ;
  final int n = S . length ( ) ;
  Arrays . fill ( S , '+' ) ;
  int t = 0 ;
  for ( int i = 0 ;
  i < n - K + 1 ;
  i ++ ) {
    if ( ! S . charAt ( i ) ) {
      t ++ ;
      for ( int j = i ;
      j < i + K ;
      j ++ ) {
        S . charAt ( j ) ^ = 1 ;
      }
    }
  }
  for ( int i = n - K + 1 ;
  i < n ;
  i ++ ) {
    if ( ! S . charAt ( i ) ) {
      return "IMPOSSIBLE" ;
    }
  }
  return t ;
}
