public static String solve ( int r , int o , int y , int g , int b , int v ) {
  HashMap < Integer , Integer > e = new HashMap < Integer , Integer > ( ) ;
  e . put ( "rg" , 2 * g ) ;
  e . put ( "yv" , 2 * v ) ;
  e . put ( "bo" , 2 * o ) ;
  e . put ( "rb" , r + b - y - g - o + v ) ;
  e . put ( "by" , b + y - r - o - v + g ) ;
  List < Integer > edges = new LinkedList < Integer > ( ) ;
  for ( int i = 1 ;
  i < t + 1 ;
  i ++ ) {
    int n = Integer . parseInt ( e . get ( i ) . toString ( ) . trim ( ) ) ;
    int r = e . get ( i ) ;
    int o = e . get ( i ) ;
    int b = e . get ( i ) ;
    int v = e . get ( i ) ;
    String ret = solve ( r , o , b , v ) ;
    System . out . println ( String . format ( "Case #%d:" , n ) + " " + e . get ( i ) . toString ( ) . toUpperCase ( ) ) ;
  }
  HashMap < Integer , String > adj = new HashMap < Integer , String > ( ) ;
  adj . put ( "r" , "y" ) ;
  adj . put ( "b" , "y" ) ;
  adj . put ( "g" , "r" ) ;
  adj . put ( "b" , "y" ) ;
  adj . put ( "r" , "r" ) ;
  adj . put ( "b" , "y" ) ;
  Set < Integer > vs = adj . keySet ( ) ;
  if ( e . get ( "rb" ) < 0 || e . get ( "by" ) < 0 || e . get ( "yr" ) < 0 ) return "IMPOSSIBLE" ;
  String v1 ;
  if ( e . get ( "rg" ) > 0 || e . get ( "rb" ) > 0 || e . get ( "yr" ) > 0 ) v1 = "r" ;
  else if ( e . get ( "bo" ) > 0 || e . get ( "by" ) > 0 ) v1 = "b" ;
  else v1 = "y" ;
  StringBuilder sb