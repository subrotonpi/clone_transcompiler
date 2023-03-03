private static String solve ( int n , int l , String gs , String b ) {
  if ( gs . contains ( b ) ) return "IMPOSSIBLE" ;
  if ( l == 1 ) return "0 ?" ;
  return "?" + " " + "1" + "0?" + "01" ;
}
int t = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int cas : xrange ( 1 , t + 1 ) ) {
  n = Integer . parseInt ( scanner . nextLine ( ) ) ;
  l = Integer . parseInt ( scanner . nextLine ( ) ) ;
  gs = scanner . nextLine ( ) ;
  b = scanner . nextLine ( ) ;
  String ans = solve ( n , l , gs , b ) ;
  System . out . println ( "Case #" + cas + ": " + ans ) ;
}
