public static void print ( int N ) {
  int minSum = 9 * 10 ;
  for ( int x = 1 ;
  x <= N / 2 ;
  x ++ ) {
    minSum = Math . min ( minSum , Math . pow ( Integer . parseInt ( String . valueOf ( x ) + String . valueOf ( N - x ) ) , 10 ) ) ;
  }
  System . out . println ( minSum ) ;
}
