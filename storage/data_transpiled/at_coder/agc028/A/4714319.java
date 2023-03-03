@ VisibleForTesting static void fractions ( int N , int M ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  S = input . nextLine ( ) ;
  T = input . nextLine ( ) ;
  int g = gcd ( N , M ) ;
  int l = N * M / g ;
  for ( int i = 0 ;
  i < g ;
  i ++ ) {
    if ( S [ N * i / g ] != T [ M * i / g ] ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( l ) ;
}
