public static double watch ( @ NonNull int n , @ NonNull int m ) {
  double longAngle = ( n % 12 ) * ( 360 / 12 ) + m * ( 360 / 12 ) / 60 ;
  double shorAngle = m * 360 / 60 ;
  double angleDiff = Math . abs ( longAngle - shorAngle ) ;
  return Math . min ( angleDiff , 360 - angleDiff ) ;
}
