public static boolean can ( int r , int t , int n ) {
  int paintNeeded = n * ( 2 * r + 1 ) + 2 * n * ( n - 1 ) ;
  return paintNeeded <= t ;
}
