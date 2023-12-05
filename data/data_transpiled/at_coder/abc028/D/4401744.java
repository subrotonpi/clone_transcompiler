public static void print ( String input ) {
  int n = ( int ) input . charAt ( 0 ) ;
  int k = ( int ) input . charAt ( 1 ) ;
  int zentoori = n * n * 3 ;
  double ryoutan = ( 3 * n - 2 ) / zentoori ;
  if ( n == k || k == 1 ) {
    print ( ryoutan ) ;
  }
  else {
    print ( ( ( 3 * n - 2 ) + 6 * ( k - 1 ) * ( n - k ) ) / zentoori ) ;
  }
}
