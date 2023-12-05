public static void print ( int n , int k ) {
  int patot = 1 + ( n - 1 ) * 3 + ( k - 1 ) * ( n - k ) * 6 ;
  System . out . println ( patot / n * n * 3 ) ;
}
