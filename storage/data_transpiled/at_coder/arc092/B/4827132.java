@ GwtIncompatible ( "java.util.BitSet" ) public static void main ( String [ ] args ) {
  B B = searchsorted ;
  a , b = split ( int32 ( open ( 0 ) . toCharArray ( ) ) , 2 ) ;
  c = 0 ;
  int l = 2 * * 29 ;
  while ( l > 0 ) h = l ;
  l /= 2 ;
  y = sort ( hstack ( ( b % h - h ) , b % h ) ) ;
  c += sum ( B ( y , h - a % h ) - B ( y , l - a % h ) ) % 2 * l ;
  System . out . println ( c ) ;
}
