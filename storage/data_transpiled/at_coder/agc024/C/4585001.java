public static int N = Integer . parseInt ( input ) {
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i == 0 && l [ i ] != 0 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    if ( i >= 1 ) {
      if ( l [ i ] - l [ i - 1 ] > 1 ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
    }
  }
  int ans = 0 ;
  int pre = - 1 ;
  for ( int a : l ) {
    if ( pre - 1 != a ) ans += a ;
    pre = a ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
