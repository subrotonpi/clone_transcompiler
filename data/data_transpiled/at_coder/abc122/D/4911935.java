public static int MOD = 10 * * 9 + 7 ;
HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
/* ok */
if ( "AGC" . equals ( last4 ) ) {
  return false ;
}
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  StringBuilder s = new StringBuilder ( last4 ) ;
  s . append ( s . charAt ( i ) ) ;
  if ( "AGC" . equals ( s . toString ( ) ) ) {
    return false ;
  }
}
/* dfs */
if ( d < 0 ) {
  return 1 ;
}
if ( ! ( d == 0 ) ) {
  int res = 0 ;
  for ( char c : "ACGT" . toCharArray ( ) ) {
    last4 = last3 + c ;
    if ( ok ( last4 ) ) {
      res = ( res + dfs ( d - 1 , last4 . length ( ) - 3 ) ) % MOD ;
    }
  }
  memo . put ( d , res ) ;
}
return 0 ;
}
