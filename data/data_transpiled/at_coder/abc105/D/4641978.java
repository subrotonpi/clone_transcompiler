@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int N = Integer . parseInt ( input . next ( ) ) ;
  int M = Integer . parseInt ( input . next ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i + 1 ] += A [ i ] ;
    A [ i + 1 ] %= M ;
  }
  int ans = 0 ;
  for ( int i : A ) {
    if ( i > 1 ) ans += i * ( i - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
