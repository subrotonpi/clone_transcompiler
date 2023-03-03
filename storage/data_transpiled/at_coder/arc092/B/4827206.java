@ GwtIncompatible ( "java.util.BitSet" ) static void loadBitSet ( BitSet b ) {
  B = searchBitSet ( b ) ;
  int a = b . get ( 0 ) ;
  int b = b . get ( 1 ) ;
  int c = 0 ;
  int l = 2 * * 29 ;
  while ( l > 0 ) {
    int h = l ;
    l /= 2 ;
    int y = sort ( HConstants . INT_MASK ) ;
    c += sum ( B . get ( y , h - a % h ) - B . get ( y , l - a % h ) ) % 2 * l ;
  }
  System . out . println ( c ) ;
}
