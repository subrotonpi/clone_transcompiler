public static int a = Integer . parseInt ( input ) {
  int b = input . nextInt ( ) ;
  String [ ] l = new String [ b + 1 ] ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    l [ i ] = String . valueOf ( i ) ;
  }
  int ctr = 0 ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    if ( l [ i ] . charAt ( 0 ) == l [ i ] . charAt ( 4 ) && l [ i ] . charAt ( 1 ) == l [ i ] . charAt ( 3 ) ) ctr ++ ;
  }
  System . out . println ( ctr ) ;
  return ctr ;
}
