static final double [ ] range ( int i , int j ) {
  for ( int j = 0 ;
  j < Range . N ;
  j ++ ) {
    Arrays . fill ( N , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( M , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( p1x , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( p1y , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( p2x , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( p2y , Integer . parseInt ( readLine ( ) ) ) ;
  }
  String answer = "Case #" + i + ": " ;
  for ( int j = 0 ;
  j < Range . M ;
  j ++ ) {
    Arrays . fill ( qx , Integer . parseInt ( readLine ( ) ) ) ;
    Arrays . fill ( qy , Integer . parseInt ( readLine ( ) ) ) ;
    double r1 = Math . sqrt ( ( ( p1x - qx ) * ( p1x - qy ) ) + ( ( p1y - qy ) * ( p1y - qy ) ) ) ;
    double r2 = Math . sqrt ( ( ( p2x - qx ) * ( p2x - qy ) ) + ( ( p2y - qy ) * ( p2y - qy ) ) ) ;
    double dist = Math . sqrt ( ( ( p1x - p2x ) * ( p1y - p2y ) ) + ( ( p1y - p2y ) * ( p1x - p2y ) ) ) ;
    double cosAngle1 = ( ( r1 * r1 ) + ( dist * r2 ) - ( r2 * r2 ) ) / ( 2 * r1 * dist ) ;
    double Angle1 = Math . acos ( cosAngle1 ) ;
    double doubleAngle1 = 2 * Angle1 ;
    double cosAngle2 = ( ( r2 * r2 ) + ( dist * r2 ) - ( r1 * r1 ) ) / ( 2 * r2 * dist ) ;
    double Angle2 = Math . acos ( cosAngle2 ) ;
    double doubleAngle2 = 2 * Angle2 ;
    double doubleArea = r1 * r1 * ( doubleAngle1 - Math . sin ( doubleAngle1 ) ) + r2 * r2 * ( doubleAngle2 - Math . sin ( doubleAngle2 ) ) ;
    answer += Double . toString ( doubleArea / 2 ) + " " ;
  }
  System . out . println ( answer )