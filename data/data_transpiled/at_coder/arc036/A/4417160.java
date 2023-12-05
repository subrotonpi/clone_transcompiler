public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 3 ;
  i <= n ;
  i ++ ) {
    if ( t [ i ] + t [ i - 1 ] + t [ i - 2 ] < k ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return 0 ;
}
