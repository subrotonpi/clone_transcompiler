public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  boolean [ ] l = new boolean [ n / 2 ] ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    l [ i ] = s . nextInt ( ) == s . nextInt ( ) - i - 1 ? true : false ;
  }
  if ( Arrays . equals ( l , s . nextInt ( ) ) ) {
    System . out . println ( 25 * ( n - n % 2 ) ) ;
  }
  else if ( n / 2 - sum ( l ) == 1 ) {
    System . out . println ( 25 * n - 2 ) ;
  }
  else {
    System . out . println ( 25 * n ) ;
  }
}
