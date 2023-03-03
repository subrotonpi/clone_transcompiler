public static double A , double B , double C , double X , double Y ) {
  double mi = A * X + B * Y ;
  mi = Math . min ( mi , C * 2 * Math . min ( X , Y ) + ( X - Math . min ( X , Y ) ) * A + ( Y - Math . min ( X , Y ) ) * B ) ;
  mi = Math . min ( mi , C * 2 * Math . max ( X , Y ) ) ;
  return mi ;
}
