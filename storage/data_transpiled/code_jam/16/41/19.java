public static String [ ] [ ] a ( ) {
  String [ ] [ ] a = new String [ 13 ] [ ] ;
  a [ 0 ] [ 0 ] = "P" ;
  a [ 0 ] [ 1 ] = "R" ;
  a [ 0 ] [ 2 ] = "S" ;
  for ( int n = 1 ;
  n < 13 ;
  n ++ ) {
    String [ ] v = new String [ 3 ] ;
    for ( int t = 0 ;
    t < 3 ;
    t ++ ) {
      String x = a [ n - 1 ] [ t ] ;
      String y = a [ n - 1 ] [ ( t + 1 ) % 3 ] ;
      v [ t ] = Math . min ( x + y , y + x ) ;
    }
    a [ n ] = v ;
  }
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int r = Integer . parseInt ( input ( ) ) ;
    int p = Integer . parseInt ( input ( ) ) ;
    int s = Integer . parseInt ( input ( ) ) ;
    String res = "IMPOSSIBLE" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      u = a [ j ] [ i ] ;
      if ( u . indexOf ( "R" ) == r && u . indexOf ( "S" ) == s && u . indexOf ( "P" ) == p ) {
        if ( res . equals ( "IMPOSSIBLE" ) ) res = u ;
        else res = Math . min ( res , u ) ;
      }
    }
  }
  System . out . println ( "Case #" + ( i + 1 ) + ":" + res ) ;
  return a ;
}
