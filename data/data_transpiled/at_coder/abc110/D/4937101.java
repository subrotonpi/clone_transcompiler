@ VisibleForTesting static int factorial ( int n ) {
  int r = Math . min ( n - r , r ) ;
  if ( r == 0 ) return 1 ;
  int over = Math . pow ( n , n - r ) ;
  int under = Math . pow ( 1 , r + 1 ) ;
  return over / under ;
}
