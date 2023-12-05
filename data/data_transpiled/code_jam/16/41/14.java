private static final HashMap < Integer , String > players = new HashMap < Integer , String > ( ) {
  {
    put ( 'R' , "RS" ) ;
    put ( 'S' , "SP" ) ;
    put ( 'P' , "RP" ) ;
  }
}
private String generateTourney ( int n , String winner ) {
  if ( ( n == 0 ) && ( winner != null ) ) {
    return memo . get ( n , winner ) ;
  }
  String result ;
  if ( n == 0 ) {
    result = winner ;
  }
  else {
    String t1 = generateTourney ( n - 1 , players . get ( winner ) . get ( 0 ) ) ;
    String t2 = generateTourney ( n - 1 , players . get ( winner ) . get ( 1 ) ) ;
    if ( t1 . compareTo ( t2 ) < 0 ) {
      result = t1 + t2 ;
    }
    else {
      result = t2 + t1 ;
    }
  }
}
@ SuppressWarnings ( "unchecked" ) private String solve ( int n , String r , String p , String s ) throws IOException {
  HashMap < String , String > desiredHist = new HashMap < String , String > ( ) ;
  for ( String winner : "RPS" . split ( " " ) ) {
    String t = generateTourney ( n , winner ) ;
    HashMap < String , String > hist = new HashMap < String , String > ( ) ;
    for ( String c : "RPS" . split ( " " ) ) {
      hist . put ( c , desiredHist . get ( c ) ) ;
    }
  }
  return "IMPOSSIBLE" ;
}
}
