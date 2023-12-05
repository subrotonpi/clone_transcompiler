public static int N = Integer . parseInt ( input ) {
  if ( N < 105 ) {
    System . out . println ( 0 ) ;
  }
  else {
    int ans = 1 ;
    for ( int i = 107 ;
    i <= N ;
    i += 1 ) {
      int count = 0 ;
      if ( i % 2 == 0 ) {
        continue ;
      }
      for ( int j = 3 ;
      j < i ;
      j += 2 ) {
        if ( i % j == 0 ) {
          count ++ ;
        }
        if ( count > 6 ) {
          break ;
        }
      }
      if ( count == 6 ) {
        ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
