public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = N ;
  for ( int i = 2 ;
  i <= ( int ) Math . pow ( N , 0.5 ) ;
  i ++ ) {
    if ( N % i == 0 ) {
      A = N / i ;
    }
  }
  for ( int j = 1 ;
  j <= N ;
  j ++ ) {
    if ( A < 10 * j ) {
      System . out . println ( j ) ;
      exit ( ) ;
    }
  }
  return N ;
}
