public static void main ( String [ ] args ) {
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < t ;
  ti ++ ) {
    double c = Double . parseDouble ( readLine ( ) ) ;
    double f = Double . parseDouble ( readLine ( ) ) ;
    double x = Double . parseDouble ( readLine ( ) ) ;
    double tim = 0.0 ;
    double p = 2.0 ;
    if ( x <= c ) {
      System . out . println ( "Case #" + ( ti + 1 ) + ": " + x / p ) ;
      continue ;
    }
    while ( ( x / p ) > ( c / p + x / ( p + f ) ) ) {
      tim += c / p ;
      p += f ;
    }
    System . out . println ( "Case #" + ( ti + 1 ) + ": " + tim + x / p ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( args ) ;
  }
}
