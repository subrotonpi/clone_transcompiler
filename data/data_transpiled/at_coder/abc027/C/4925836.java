public static String baibaiChance ( @ Nonnegative int N ) {
  int depth = 0 ;
  int n = N ;
  while ( ++ n < N ) {
    depth ++ ;
    n >>= 1 ;
  }
  {
    int m2 = n << 1 ;
    int m2p1 = ( n << 1 ) + 1 ;
    if ( depth % 2 == 0 ) {
      Tst = m2p1 ;
      Ast = m2 ;
    }
    else {
      Tst = m2 ;
      Ast = m2p1 ;
    }
    int x = 1 ;
    do {
      x = Tst . next ( x ) ;
    }
    while ( N < x ) ;
    return "Aoki" ;
    x = Ast . next ( x ) ;
    if ( N < x ) return "Takahashi" ;
  }
  if ( Class . isEnum ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    String ans = baibaiChance ( N ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
