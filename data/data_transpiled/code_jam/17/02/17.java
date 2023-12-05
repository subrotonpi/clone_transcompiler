public static void input ( int tc ) {
  for ( tc = 1 ;
  tc <= Integer . parseInt ( input ( ) ) ;
  tc ++ ) {
    String A = input ( ) ;
    int N = A . length ( ) ;
    String ans = "" ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String pans = "" ;
      for ( int d = 0 ;
      d <= 10 ;
      d ++ ) {
        String str = String . valueOf ( d ) ;
        if ( Integer . parseInt ( ans + str . charAt ( d * ( N - i ) ) ) <= Integer . parseInt ( A ) ) pans = ans + str ;
      }
      ans = pans ;
    }
    System . out . println ( "Case #" + tc + ": " + Integer . parseInt ( ans ) ) ;
  }
}
