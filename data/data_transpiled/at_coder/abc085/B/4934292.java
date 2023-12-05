public static void print ( int n ) {
  int [ ] li = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( li ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( li [ i ] == li [ i + 1 ] ) {
      n = n - 1 ;
    }
    else {
    }
  }
  System . out . println ( n ) ;
}
