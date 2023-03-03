public static int [ ] readIntArray ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int now = 0 ;
  int ans = 0 ;
  if ( A [ 0 ] != 0 ) {
    ans = - 1 ;
  }
  else {
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      int a = A [ i ] ;
      if ( now + 1 == a ) {
        ans ++ ;
        now ++ ;
      }
      else if ( now >= a ) {
        ans += a ;
        now = a ;
      }
      else {
        ans = - 1 ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
