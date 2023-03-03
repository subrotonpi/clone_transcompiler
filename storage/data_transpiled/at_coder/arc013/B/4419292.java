public static void print ( int c ) {
  List < Integer > [ ] info = new List [ c ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    info [ i ] = new List < Integer > ( ) ;
  }
  int nMax = 0 ;
  int m_max = 0 ;
  int lMax = 0 ;
  for ( int j = 0 ;
  j < c ;
  j ++ ) {
    Arrays . sort ( info [ j ] ) ;
    if ( nMax < info [ j ] . get ( 0 ) ) nMax = info [ j ] . get ( 0 ) ;
    if ( m_max < info [ j ] . get ( 1 ) ) m_max = info [ j ] . get ( 1 ) ;
    if ( lMax < info [ j ] . get ( 2 ) ) lMax = info [ j ] . get ( 2 ) ;
  }
}
