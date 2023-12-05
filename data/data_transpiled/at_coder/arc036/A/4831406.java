public static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    int sleep = T [ i ] + T [ i - 1 ] + T [ i - 2 ] ;
    if ( sleep < k ) {
      System . out . println ( i + 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return 0 ;
}
