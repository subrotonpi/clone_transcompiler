public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] [ ] b = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = Arrays . copyOf ( a , a . length ) ;
    b [ i ] [ 0 ] = i + 1 ;
  }
  Arrays . sort ( b ) ;
  for ( int i = b . length - 1 ;
  i >= 0 ;
  i -- ) {
    System . out . println ( b [ i ] [ 1 ] ) ;
  }
}
