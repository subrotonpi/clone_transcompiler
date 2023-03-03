public static int solve ( String s ) {
  int ans = 0 ;
  for ( int i : xrange ( 1 , s . length ( ) ) ) {
    if ( ( s . charAt ( i ) != s . charAt ( i - 1 ) ) && ( s . charAt ( i ) != s . charAt ( i ) ) ) ans ++ ;
  }
  return ans ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    String seq = readLine ( ) + "+" ;
    System . out . println ( "Case #" + cas + ": " + solve ( seq ) ) ;
  }
  return t ;
}
