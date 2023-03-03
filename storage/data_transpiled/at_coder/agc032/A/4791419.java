public static void print ( int n ) {
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < b . length ;
    j ++ ) {
      if ( b [ j ] == i + 1 ) {
        a [ count ] = b [ j ] ;
        count ++ ;
        break ;
      }
    }
  }
  if ( count != n ) {
    System . out . println ( - 1 ) ;
  }
  else {
    for ( int ai = a . length - 1 ;
    ai >= 0 ;
    ai -- ) {
      System . out . println ( a [ ai ] ) ;
    }
  }
}
