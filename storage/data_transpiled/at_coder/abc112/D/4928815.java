@ VisibleForTesting static void from ( Scanner input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int tmp = ( int ) Math . sqrt ( M ) ;
  int ma = 1 ;
  for ( int i = 1 ;
  i <= tmp ;
  i ++ ) {
    if ( ! M % i == 0 ) {
      int div = M / i ;
      ma = Math . max ( i * N <= M ? i : 0 , ma , div * N <= M ? div : 0 ) ;
    }
  }
  System . out . println ( ma ) ;
}
