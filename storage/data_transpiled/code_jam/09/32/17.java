@ Sys public static void Sys ( ) {
  int c = Integer . parseInt ( stdin . readLine ( ) . trim ( ) ) ;
  for ( ;
  ;
  ) {
    int fc = Integer . parseInt ( stdin . readLine ( ) . trim ( ) ) ;
    List < Integer > flies = new ArrayList < > ( ) ;
    for ( int __ : xrange ( c ) ) flies . add ( Integer . parseInt ( stdin . readLine ( ) . trim ( ) ) ) ;
    double a = 0 , b = 0 , c = 0 ;
    for ( int off : xrange ( 3 ) ) {
      for ( int x : flies ) {
        for ( int y : flies ) {
          c += x [ off ] * y [ off ] ;
          b += x [ off ] * y [ off + 3 ] ;
          b += x [ off + 3 ] * y [ off ] ;
          a += x [ off + 3 ] * y [ off + 3 ] ;
        }
      }
    }
    double t ;
    if ( a == 0 ) t = 0.0 ;
    else t = ( double ) - b / ( double ) ( 2 * a ) ;
    if ( t < 0.0 ) t = 0.0 ;
    double f = a * t * t + b * t + c ;
    if ( f < 0 ) f = 0.0 ;
    System . out . println ( "Case #" + ( ++ c ) + ": " + sqrt ( ( double ) f / ( double ) flies . size ( ) / ( double ) flies . size ( ) ) + " " + t ) ;
  }
}
