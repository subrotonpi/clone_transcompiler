public static void print ( int n , int k ) {
  int c = 0 ;
  for ( int i = n ;
  i >= k ;
  i -- ) {
    int p = n / i ;
    c += ( i - k ) * p + ( k != 0 ? Math . max ( 0 , n - p * i - k + 1 ) : n - p * i - k ) ;
  }
  System . out . println ( c ) ;
}
