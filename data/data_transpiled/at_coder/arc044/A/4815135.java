public static boolean isPrime ( int N ) {
  int i ;
  for ( i = 2 ;
  i <= ( int ) ( N * 0.5 ) ;
  i ++ ) {
    if ( i % i == 0 ) {
      return false ;
    }
  }
  return i != 1 ;
}
