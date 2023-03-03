public static String [ ] bruteForceAttack ( @ Nonnegative int N ) {
  String [ ] res = new String [ 3 * N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = "" ;
    for ( ;
    i < N ;
    i ++ ) {
      int d = i % 3 ;
      i /= 3 ;
      switch ( d ) {
        case 0 : s = "a" + s ;
        break ;
        case 1 : s = "b" + s ;
        break ;
        default : s = "c" + s ;
        break ;
      }
    }
    res [ i ] = s ;
  }
  if ( getClass ( ) . isClassPresent ( String . class ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    String [ ] ans = bruteForceAttack ( N ) ;
    System . out . println ( Arrays . toString ( ans ) ) ;
  }
  return res ;
}
