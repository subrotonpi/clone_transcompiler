@ VisibleForTesting static int cmb ( int n , int k ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  /* Cb */
  int r = Math . min ( n - r , r ) ;
  if ( r == 0 ) return 1 ;
  int over = Math . pow ( n , n - r ) ;
  int under = Math . pow ( 1 , r + 1 ) ;
  /* Cb */
  if ( n > k ) {
    System . out . println ( cmb ( n + k - 1 , k ) % mod ) ;
  }
  else {
    int t = k % n ;
    System . out . println ( cmb ( n , t ) % mod ) ;
  }
}
