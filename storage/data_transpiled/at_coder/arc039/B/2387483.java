@ VisibleForTesting static int factorial ( int n , int k ) {
  int ans , ans ;
  n = ( int ) Math . floor ( n ) ;
  k = ( int ) Math . floor ( k ) ;
  if ( k >= n ) {
    a = k % n ;
    b = n - k % n ;
    a = Math . min ( a , b ) ;
    ans = factorial ( n ) / ( factorial ( a ) * factorial ( n - a ) ) ;
    System . out . println ( ans % ( 10 * * 9 + 7 ) ) ;
  }
  else {
    ans = factorial ( ( k + n ) - 1 ) / ( factorial ( k ) * factorial ( n - 1 ) ) ;
    System . out . println ( ans % ( 10 * * 9 + 7 ) ) ;
  }
  return ans ;
}
