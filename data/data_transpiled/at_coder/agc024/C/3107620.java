public static int N = Integer . parseInt ( input ) {
  int [ ] As = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As [ i ] = Integer . parseInt ( input . next ( ) ) ;
  if ( As [ 0 ] != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( As [ i - 1 ] + 1 < As [ i ] ) {
      ans = - 1 ;
      break ;
    }
    else if ( As [ i - 1 ] + 1 == As [ i ] ) {
      ans ++ ;
    }
    else {
      ans += As [ i ] ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
