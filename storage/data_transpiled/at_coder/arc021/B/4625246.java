public static void print ( int n ) {
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i + 1 ] = l [ i ] ^ b [ i ] ;
  }
  if ( l [ l . length - 1 ] != 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    l [ l . length - 1 ] = 0 ;
    for ( int i = 0 ;
    i < l . length ;
    i ++ ) {
      System . out . println ( l [ i ] ) ;
    }
  }
}
