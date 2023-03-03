public static String print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int m = Integer . parseInt ( input ) ;
  int [ ] b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input ) ;
  }
  String ans = "yes" ;
  int c = 0 ;
  if ( n >= m ) {
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      for ( int k = c ;
      k < n ;
      k ++ ) {
        if ( b [ i ] - a [ k ] <= t && b [ i ] - a [ k ] >= 0 ) {
          c ++ ;
          break ;
        }
      }
      if ( c < i + 1 ) {
        ans = "no" ;
        break ;
      }
    }
  }
  else {
    ans = "no" ;
  }
  return ans ;
}
