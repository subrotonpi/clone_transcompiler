@ Function public static int calc ( @ AggregationState int x ) {
  int a = x ;
  int b = x ;
  int v = 0 ;
  for ( int i = 0 ;
  i < b + 1 ;
  i ++ ) {
    v += a * i ;
  }
  return v ;
  /* Factorization */
  Map < Integer , Integer > map = map ( Integer :: intValue ) ;
  for ( int i = 2 ;
  i <= 1 + ( int ) ( n * 0.5 ) ;
  i ++ ) {
    while ( n % i == 0 ) {
      map . put ( i , 1 ) ;
      n /= i ;
    }
  }
  if ( n > 1 ) map . put ( n , 1 ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( "Deficient" ) ;
  }
  else {
    Map < Integer , Integer > map = map ( n ) ;
    int result = map . entrySet ( ) . stream ( ) . mapToInt ( Map . Entry :: getValue ) . max ( ) . getAsInt ( ) - n ;
    System . out . println ( n == result ? "Perfect" : result > n ? "Abundant" : "Deficient" ) ;
  }
}
