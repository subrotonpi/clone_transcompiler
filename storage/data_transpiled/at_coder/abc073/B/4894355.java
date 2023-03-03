public static void print ( int n ) {
  int [ ] [ ] lr = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lr [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int persona = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    persona += lr [ i ] [ 1 ] - lr [ i ] [ 0 ] + 1 ;
  }
  System . out . println ( persona ) ;
}
