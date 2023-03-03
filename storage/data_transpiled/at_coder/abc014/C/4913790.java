public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Tuple [ ] items = new Tuple [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    items [ i ] = tuple ( Integer . parseInt ( input ) ) ;
  }
  int [ ] enogu = new int [ 10 * 6 + 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = items [ i ] . get ( ) ;
    int b = items [ i ] . get ( ) ;
    enogu [ a ] ++ ;
  }
  for ( int i = 0 ;
  i < enogu . length ;
  i ++ ) {
    enogu [ i + 1 ] += enogu [ i ] ;
  }
  System . out . println ( max ( enogu ) ) ;
}
