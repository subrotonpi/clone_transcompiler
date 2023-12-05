public static int [ ] solve ( int N , int A , int B , int S ) {
  if ( Integer . parseInt ( A ) % 2 == Integer . parseInt ( B ) % 2 ) {
    System . out . println ( "No" ) ;
    exit ( 0 ) ;
  }
  System . out . println ( "Yes" ) ;
  int [ ] ans = new int [ N ] ;
  {
    int P = ( A ^ B ) & S ;
    int b = 1 ;
    if ( c == 1 ) {
      ans [ 0 ] = A ;
      ans [ 1 ] = B ;
      return ans ;
    }
    while ( ! P & b ) {
      b <<= 1 ;
    }
    int S0 = S ^ b ;
    int k = 1 ;
    while ( ! S0 & k ) {
      k <<= 1 ;
    }
    int C = A ^ k ;
    solve ( c - 1 , A , C , S0 ) ;
    solve ( c - 1 , C ^ b , B , S0 ) ;
  }
}
