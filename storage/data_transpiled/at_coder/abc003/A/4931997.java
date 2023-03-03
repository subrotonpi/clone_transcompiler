public static void print ( int n ) {
  int avg = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    avg += i ;
  }
  System . out . println ( ( int ) ( avg / n * 10000 ) ) ;
}
