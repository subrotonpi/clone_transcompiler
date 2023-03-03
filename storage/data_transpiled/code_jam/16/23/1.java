private static boolean dfs ( Map < String , List < String >> e , Map < String , Boolean > ma , Map < String , String > u , String v ) {
  if ( u . containsKey ( v ) ) {
    return false ;
  }
  u . put ( v , true ) ;
  for ( String s : e . get ( v ) ) {
    if ( ( ! s . equals ( "" ) ) || dfs ( e , ma , u , ma . get ( s ) ) ) {
      ma . put ( s , v ) ;
      return true ;
    }
  }
  return false ;
}
