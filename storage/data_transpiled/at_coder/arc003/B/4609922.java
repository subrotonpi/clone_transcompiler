public static void print ( int n ) {
  int [ ] rec = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rec [ i ] = input . nextInt ( ) ;
  }
  Arrays . sort ( rec ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( rec [ i ] . toString ( ) ) ;
  }
}
