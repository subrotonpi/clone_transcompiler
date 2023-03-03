private static int [ ] getCounts ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] count = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    count [ i ] = 0 ;
  }
  for ( int j = 0 ;
  j < count . length ;
  j ++ ) {
    if ( count [ j ] % 2 == 1 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  return count ;
}
