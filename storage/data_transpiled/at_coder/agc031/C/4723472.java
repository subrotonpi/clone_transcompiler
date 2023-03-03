public static int [ ] solve ( int N , int A , int B ) {
  if ( Integer . parseInt ( A ) % 2 == Integer . parseInt ( B ) % 2 ) {
    System . out . println ( "No" ) ;
    exit ( 0 ) ;
  }
  System . out . println ( "Yes" ) ;
  int [ ] ans = new int [ N ] ;
  {
    int P = A ^ B ;
    int U = P & S ;
    int b = 1 ;
    if ( c == 1 ) {
      ans [ 0 ] = A ;
      ans [ 1 ] = B ;
      return ans ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( U & b > 0 ) {
        assert S & b > 0 : ( P & S ) ;
        int S0 = S ^ b ;
        int k = 1 ;
        while ( ! S0 & k > 0 ) k <<= 1 ;
        int C = A ^ k ;
        solve ( c - 1 , A , C , S0 ) ;
        solve ( c - 1 , C ^ b , B , S0 ) ;
        break ;
      }
      b <<= 1 ;
    }
  }
  solve ( N , A , B , 2 * N - 1 ) ;
  return ans ;
}
