@ VisibleForTesting static Iterable < String > findStr ( int n , int r , int o , int y , int g , int b , int v ) {
  final String fail = "IMPOSSIBLE" ;
  if ( r == g && r + g == n ) return "RG" . format ( r ) ;
  if ( y == v && y + v == n ) return "YV" . format ( y ) ;
  if ( b == o && b + o == n ) return "BO" . format ( b ) ;
  if ( g >= Math . max ( r , 1 ) || v >= Math . max ( y , 1 ) || o >= Math . max ( b , 1 ) ) return fail ;
  r -= g ;
  y -= v ;
  b -= o ;
  if ( Math . max ( r , y , b ) * 2 > r + y + b ) return fail ;
  final List < String > s = new ArrayList < > ( Collections . nCopies ( n , "RYB" ) ) ;
  final Comparator < String > c = Comparator . comparing ( s :: get ) ;
  final int cnt = s . size ( ) ;
  String p1 = c . get ( 0 ) * cnt ;
  String p2 = c . get ( 1 ) * cnt + c . get ( 2 ) * cnt ;
  p2 = p2 . substring ( 0 , cnt ) ;
  String p3 = p2 . substring ( cnt ) ;
  String ans = StringUtils . join ( s . subList ( 1 , s . size ( ) ) , "" ) ;
  ans = ans . replace ( "R" , "RG" + g + "R" , 1 ) ;
  ans = ans . replace ( "Y" , "YV" + v + "Y" , 1 ) ;
  ans = ans . replace ( "B" , "BO" + o + "B" , 1 ) ;
  return ans ;
}
