public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += A [ i ] / 2 ;
    if ( i != N - 1 ) {
      if ( A [ i + 1 ] >= 1 ) {
        A [ i + 1 ] += A [ i ] % 2 ;
      }
    }
  }
  System . out . println ( ans ) ;
}
