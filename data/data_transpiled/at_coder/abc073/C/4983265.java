public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int memo = a [ 0 ] ;
  int ans = 0 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == memo ) {
      cnt ++ ;
      if ( i == n - 1 ) {
        if ( cnt % 2 != 0 ) ans ++ ;
      }
    }
    else {
      if ( cnt % 2 != 0 ) ans ++ ;
      if ( i == n - 1 ) ans ++ ;
      cnt = 1 ;
    }
    memo = a [ i ] ;
  }
  System . out . println ( ans ) ;
}
