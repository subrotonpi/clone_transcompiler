public static double m ( ) {
  double m = input . nextDouble ( ) / 1000 ;
  double vv ;
  if ( m < 0.1 ) {
    vv = 0 ;
  }
  else if ( m <= 5 ) {
    vv = m * 10 ;
  }
  else if ( m <= 30 ) {
    vv = m + 50 ;
  }
  else if ( 35 <= m && m <= 70 ) {
    vv = ( m - 30 ) / 5 + 80 ;
  }
  else if ( 70 <= m ) {
    vv = 89 ;
  }
  if ( vv < 10 ) {
    System . out . println ( "0" + Integer . toString ( vv ) ) ;
  }
  else {
    System . out . println ( Integer . toString ( vv ) ) ;
  }
  return vv ;
}
