public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( M % N == 0 ) {
    System . out . println ( M / N ) ;
    exit ( ) ;
  }
  int ans = 1 ;
  for ( int i = 2 ;
  i <= 100000 ;
  i ++ ) {
    int k = M % i ;
    if ( k == 0 ) {
      int j = M / i ;
      if ( i >= N && j >= N ) {
        ans = Math . max ( ans , i , j ) ;
      }
      else if ( i >= N ) {
        ans = Math . max ( ans , j ) ;
      }
      else if ( j >= N ) {
        ans = Math . max ( ans , i ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
