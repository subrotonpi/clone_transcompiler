public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int k = Arrays . stream ( a ) . filter ( i -> i % 2 == 1 ) . count ( ) ;
  int y = Arrays . stream ( a ) . filter ( i -> i % 4 == 0 ) . count ( ) ;
  int g = n - k - y ;
  if ( g > 0 ) {
    if ( k <= y ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
  else {
    if ( k <= y + 1 ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
}
