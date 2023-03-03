@ GwtIncompatible ( "java.util.BitSet" ) static void main ( String [ ] args ) {
  B = searchsorted ;
  int a , b ;
  int c = 0 ;
  int h = 0 ;
  int l = 2 * * 29 ;
  while ( l > 0 ) l /= 2 ;
  y = sort ( hstack ( ( b % h - h ) , b % h ) ) ;
  c += sum ( B ( y , h - a % h ) - B ( y , l - a % h ) ) % 2 * l ;
  h = l ;
  System . out . println ( c ) ;
}
