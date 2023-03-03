public static double l = Double . parseDouble ( input ) {
  double x = Double . parseDouble ( input . readLine ( ) ) ;
  double y = Double . parseDouble ( input . readLine ( ) ) ;
  double s = Double . parseDouble ( input . readLine ( ) ) ;
  double d = Double . parseDouble ( input . readLine ( ) ) ;
  double m = ( d - s ) * ( d > s ) ? l + d - s : l ;
  if ( x >= y ) {
    System . out . println ( m / ( x + y ) ) ;
  }
  else {
    System . out . println ( Math . min ( m / ( x + y ) , ( l - m ) / ( y - x ) ) ) ;
  }
  return m ;
}
