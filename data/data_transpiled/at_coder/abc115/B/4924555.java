public static int N = Integer . parseInt ( input ) {
  int m = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    if ( p > m ) {
      m = p ;
    }
    ans += p ;
  }
  return ( int ) ( ans - m / 2 ) ;
}
