public static int dfs ( String s ) {
  if ( Integer . parseInt ( s ) > N ) return 0 ;
  int ct = Arrays . binarySearch ( "357" , s ) >= 0 ? 1 : 0 ;
  ct += dfs ( s + "3" ) ;
  ct += dfs ( s + "5" ) ;
  ct += dfs ( s + "7" ) ;
  return ct ;
}
