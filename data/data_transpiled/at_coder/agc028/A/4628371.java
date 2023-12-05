static final int [ ] getDivisor ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  int g = MathUtils . gcd ( N , M ) ;
  int n = N / g ;
  int m = M / g ;
  int out = n * m * g ;
  for ( int k = 0 ;
  k < g ;
  k ++ ) {
    if ( S [ k * n ] != T [ k * m ] ) {
      out = - 1 ;
      break ;
    }
  }
  System . out . println ( out ) ;
}
