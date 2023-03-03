static final int input ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  int n = Integer . parseInt ( input ) ;
  int s = Integer . parseInt ( input ) ;
  /* if n < b = n + s = n + s */
  boolean isB = false ;
  if ( n < s ) {
    System . out . println ( - 1 ) ;
  }
  else if ( n == s ) {
    System . out . println ( n + 1 ) ;
  }
  else {
    int b = 2 ;
    isB = false ;
    while ( b * b <= n ) {
      if ( s == n ) {
        isB = true ;
        break ;
      }
      b ++ ;
    }
    if ( isB ) {
      System . out . println ( b ) ;
    }
    else {
      int p = 1 ;
      int ans = - 1 ;
      while ( p * p <= n ) {
        if ( ( n - s ) % p != 0 ) {
          p ++ ;
          continue ;
        }
        else {
          b = ( n - s ) / p + 1 ;
          if ( s == n ) {
            ans = ans != - 1 ? Math . min ( b , ans ) : b ;
          }
        }
        p ++ ;
      }
      System . out . println ( ans ) ;
    }
  }
  return n ;
}
