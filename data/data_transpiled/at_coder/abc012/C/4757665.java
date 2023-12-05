public static String [ ] getans ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] ans = new String [ 2026 ] ;
  for ( int i = 1 ;
  i <= 2026 - N ;
  i ++ ) {
    if ( i >= 10 ) break ;
    if ( ( 2025 - N ) % i == 0 && ( 2025 - N ) / i < 10 ) ans [ i ] = String . valueOf ( i ) ;
  }
  return ans ;
}
