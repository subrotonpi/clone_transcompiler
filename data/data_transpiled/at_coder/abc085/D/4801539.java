public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , h = Integer . parseInt ( input ) ;
  int [ ] A = new int [ n ] ;
  int [ ] B = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  int count = 0 ;
  a = Math . max ( A , B ) ;
  for ( int b : B ) {
    if ( ( b > a ) & ( h > 0 ) ) {
      h -= b ;
      count ++ ;
    }
  }
  if ( h > 0 ) {
    count += ( h + a - 1 ) / a ;
  }
  System . out . println ( count ) ;
}
