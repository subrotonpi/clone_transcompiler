public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] [ ] b = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] [ 0 ] = a [ i ] ;
    b [ i ] [ 1 ] = i + 1 ;
  }
  Arrays . sort ( b ) ;
  Arrays . reverse ( b ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( b [ i ] [ 1 ] ) ;
  }
}
