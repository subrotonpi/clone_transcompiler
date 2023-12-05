public static int dfs ( String s ) {
  if ( s != null && Integer . parseInt ( s ) > n ) return 0 ;
  if ( s . contains ( "3" ) && s . contains ( "5" ) && s . contains ( "7" ) ) return dfs ( s + "3" ) + dfs ( s + "5" ) + dfs ( s + "7" ) ;
  return 0 ;
}
