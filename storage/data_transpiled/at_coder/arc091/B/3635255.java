public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Ans = 0 ;
  if ( K == 0 ) {
    System . out . println ( N * N ) ;
  }
  else {
    /* Mods the number of numbers to keep the number of digits */
    int lim = N / K ;
    int pattern = K - K ;
    int total = lim * pattern ;
    if ( N - i * lim < K ) {
      return total ;
    }
    else {
      int extra = N - i * lim - K + 1 ;
      return total + extra ;
    }
  }
  for ( int i = K + 1 ;
  i <= N ;
  i ++ ) {
    Ans += Mods ( i , N , K ) ;
  }
  System . out . println ( Ans ) ;
  return Ans ;
}
