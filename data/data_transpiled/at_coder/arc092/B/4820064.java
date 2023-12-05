@ GwtIncompatible ( "java.util.Arrays" ) public static int [ ] [ ] ints ( ) {
  int [ ] [ ] b = new int [ 29 ] [ 29 ] ;
  int a = I . length ;
  int b = I . length ;
  int c = 0 ;
  for ( int k = 0 ;
  k < 29 ;
  k ++ ) {
    int l = 2 * k ;
    int h = 2 * l ;
    int y = sort ( Hx . ints ( b % h - h , b % h ) ) ;
    c += sum ( B [ y ] [ h - a % h ] - B [ y ] [ l - a % h ] ) % 2 * l ;
  }
  System . out . println ( c ) ;
  return b ;
}
