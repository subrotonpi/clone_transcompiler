public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int d = ( n / 5 ) % 6 ;
  int m = n % 5 ;
  char [ ] c = new char [ 6 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    c [ i ] = String . valueOf ( i + 1 ) ;
  }
  c = c [ d ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    c [ i ] = String . valueOf ( i ) ;
  }
  System . out . println ( c ) ;
}
