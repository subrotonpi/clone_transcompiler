public static String toggle ( char cake ) {
  return "-+" . charAt ( cake == '-' ? '-' : cake ) ;
  /* solve the string */
  int len = Integer . parseInt ( input ( ) ) ;
  int flipCount = 0 ;
  for ( int s = 0 ;
  s < len - K + 1 ;
  s ++ ) {
    if ( input ( ) . charAt ( s ) == '+' ) continue ;
    for ( int k = 0 ;
    k < K ;
    k ++ ) {
      S [ s + k ] = toggle ( input ( ) . charAt ( s + k ) ) ;
    }
    flipCount ++ ;
  }
  if ( input ( ) . charAt ( 0 ) == '-' ) return "IMPOSSIBLE" ;
  /* solve the string */
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int caseNumber = 1 ;
  caseNumber <= T ;
  caseNumber ++ ) {
    String S = input ( ) ;
    String K = input ( ) ;
    K = Integer . parseInt ( K ) ;
    System . out . println ( "Case #" + caseNumber + ":" + solve ( S , K ) ) ;
  }
  return "" ;
}
