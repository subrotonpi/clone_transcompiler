public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = new LinkedList ( ) ;
  a . sort ( Collections . reverseOrder ( a ) ) ;
  System . out . println ( a [ 1 ] ) ;
}
