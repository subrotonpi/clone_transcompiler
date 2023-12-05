public static int N = Integer . parseInt ( input ) {
  int ans ;
  int i = 0 ;
  int N = input . nextInt ( ) ;
  int S1 = input . nextInt ( ) ;
  int S2 = input . nextInt ( ) ;
  int i ;
  if ( S1 [ 0 ] == S2 [ 0 ] ) {
    ans = 3 ;
    i = 1 ;
  }
  else {
    ans = 6 ;
    i = 2 ;
  }
  long MOD = 1000000007 ;
  while ( i < N ) {
    if ( S1 [ i - 1 ] == S2 [ i - 1 ] ) {
      ans = ans * 2 % MOD ;
      if ( S1 [ i ] != S2 [ i ] ) i ++ ;
    }
    else {
      if ( S1 [ i ] != S2 [ i ] ) {
        ans = ans * 3 % MOD ;
        i ++ ;
      }
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
