public static String solve ( String s ) {
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( ans + c < c + ans ) {
      ans = c + ans ;
    }
    else {
      ans = ans + c ;
    }
  }
  return ans ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    String ans = solve ( ( String ) readLine ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + ans ) ;
  }
  return ans ;
}
