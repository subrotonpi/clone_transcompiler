public static int N ( int N , int P ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( A ) ;
  int zero = A . length ;
  int one = A . length ;
  int ans = 0 ;
  /* combinations of the n and r */
  final int a = N / 2 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i % 2 ;
  }
  int zero = A . length ;
  int one = A . length ;
  int ans = 0 ;
  /* combinations of the n and r */
  for ( int i = 0 ;
  i < one ;
  i ++ ) {
    final int n = n / 2 ;
  }
  if ( P == 0 ) {
    ans += 2 * zero ;
    int a = 0 ;
    for ( int i = 0 ;
    i < one / 2 ;
    i ++ ) {
      a += combinations ( one , 2 * ( i + 1 ) ) ;
    }
    ans += a * ( 2 * zero ) ;
    ans = 2 * N - ans ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
