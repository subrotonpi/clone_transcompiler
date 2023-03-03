@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int A = Integer . parseInt ( input . next ( ) ) ;
  int B = Integer . parseInt ( input . next ( ) ) ;
  Map < Integer , Integer > D = new LinkedHashMap < > ( ) ;
  for ( int i = B + 1 ;
  i <= A ;
  i ++ ) {
    int N = i ;
    for ( int j = 2 ;
    j <= 10 * j ;
    j ++ ) {
      while ( N % j == 0 ) {
        D . put ( j , 1 ) ;
        N /= j ;
      }
    }
    if ( N > 10 * 5 ) D . put ( N , 1 ) ;
  }
  int ans = 1 ;
  for ( int i : D . keySet ( ) ) {
    ans *= ( D . get ( i ) + 1 ) ;
    ans %= ( 10 * 9 + 7 ) ;
  }
  System . out . println ( ans ) ;
}
