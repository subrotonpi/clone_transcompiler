static final int [ ] [ ] solve ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String [ ] [ ] w = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = input ( ) ;
  }
  if ( Arrays . equals ( w [ j ] [ w . length - 1 ] , w [ j + 1 ] [ 0 ] ) && w . length == n ) {
    System . out . println ( "Yes" ) ;
    System . exit ( 0 ) ;
  }
  System . out . println ( "No" ) ;
}
