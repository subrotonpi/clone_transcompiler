public static int [ ] [ ] getans ( int N , int x ) {
  int [ ] [ ] ans = new int [ N ] [ 2 ] ;
  int tmp ;
  int i , j ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x == 1 || x == 2 * N - 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( "Yes" ) ;
  if ( N == 2 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 2 ) ;
    System . out . println ( 3 ) ;
    exit ( ) ;
  }
  ans = new int [ 2 * N - 1 ] [ 2 ] ;
  ans [ 0 ] = - 1 ;
  ans [ 1 ] = 3 ;
  ans [ 2 ] = 2 ;
  ans [ 3 ] = 1 ;
  ans [ 4 ] = 4 ;
  tmp = 5 ;
  for ( i = 0 ;
  i < 2 * N - 1 ;
  i ++ ) {
    if ( ans [ i ] != - 1 ) {
      continue ;
    }
    else {
      ans [ i ] = tmp ;
      tmp ++ ;
    }
  }
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = x - 1 ;
    ans [ i ] = x ;
    ans [ i ] = x + 1 ;
    ans [ i ] = x - 2 ;
    tmp = x + 2 ;
    for ( i = 0 ;
    i < 2 * N - 1 ;
    i ++ ) {
      if ( ans [ i ] != - 1 ) {
        continue ;
      }
      else {
        if ( tmp >= 2 * N ) {
          tmp = 1 ;
        }
        ans [ i ] = tmp ;
        tmp ++ ;
      }
    }
  }
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}
