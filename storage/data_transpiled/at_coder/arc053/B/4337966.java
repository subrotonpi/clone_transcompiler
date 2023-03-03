@ Function public static int bSpliterPalindrome ( String S ) {
  Map < Integer , Integer > numCharactertorAppeared = new HashMap < > ( ) ;
  numCharactertorAppeared . forEach ( v -> {
    if ( v % 2 == 1 ) {
      return 1 ;
    }
  }
  ) ;
  int ans = numCharactertorAppeared . size ( ) == 0 ? S . length ( ) : 2 * ( ( S . length ( ) - numCharactertorAppeared . size ( ) ) / ( 2 * numCharactertorAppeared . size ( ) ) ) + 1 ;
  return ans ;
}
