@ GwtIncompatible ( "java.util.Arrays" ) static void main ( String [ ] args ) {
  B = searchsorted ;
  int a , b ;
  int l , h ;
  b = split ( int32 ( open ( 0 ) . split ( " " ) [ 1 ] ) , 2 ) ;
  c = 0 ;
  for ( int k = 0 ;
  k < 29 ;
  k ++ ) {
    l = 2 * * k ;
    h = 2 * l ;
    y = sort ( hstack ( ( b % h - h ) , b % h ) ) ;
    c += sum ( B ( y , h - a % h ) - B ( y , l - a % h ) ) % 2 * l ;
  }
  System . out . println ( c ) ;
}
