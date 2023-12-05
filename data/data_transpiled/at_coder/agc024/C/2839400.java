public static int ans ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a [ n ] = 0 ;
  /* if (a[0]>0) return -1; else */
  {
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i + 1 ] - a [ i ] > 1 ) return - 1 ;
      else if ( a [ i + 1 ] - a [ i ] < 1 ) ans += a [ i ] ;
    }
  }
  return ans ;
}
