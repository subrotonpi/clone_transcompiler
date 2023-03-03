public static void print ( int n , int k ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int psum = 0 ;
  int asum = 0 ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    if ( i == 0 ) {
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        if ( a [ j ] > 0 ) psum += a [ j ] ;
        asum += a [ j ] ;
      }
    }
    else {
      if ( a [ i - 1 ] > 0 ) psum -= a [ i - 1 ] ;
      asum -= a [ i - 1 ] ;
      if ( a [ i + k - 1 ] > 0 ) psum += a [ i + k - 1 ] ;
      asum += a [ i + k - 1 ] ;
    }
    ans = Math . max ( ans , s - psum + new int [ asum ] [ asum > 0 ] ) ;
  }
  System . out . println ( ans ) ;
}
