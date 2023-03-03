public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = Integer . valueOf ( T [ 0 ] ) ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    ans += T [ i ] ;
    if ( ans < K ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
    ans -= T [ i - 2 ] ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return ans ;
}
