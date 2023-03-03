@ GwtIncompatible ( "java.util.BitSet" ) static void loadBitSet ( BitSet b ) {
  B = searchBitSet ;
  a = loadBitSet ( b . get ( 0 ) , b . get ( 1 ) ) ;
  int c = 0 ;
  int l = 2 * * 29 ;
  while ( l > 0 ) h = l ;
  l /= 2 ;
  y = sort ( hstack ( b , b % h - h , b % h ) ) ;
  c += sum ( B ( y , h - a % h ) - B ( y , l - a % h ) ) % 2 * l ;
  System . out . println ( c ) ;
}
