static void n ( int n ) {
  char [ ] C = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    C [ i ] = input . charAt ( i ) ;
  }
  System . out . println ( '' . join ( C ) ) ;
}
