public static double xa ( ) {
  double xa = 0 ;
  double ya = 0 ;
  double xb = 0 ;
  double yb = 0 ;
  double xc = 0 ;
  double yc = 0 ;
  double ans = Math . abs ( ( xb - xa ) * ( yc - ya ) - ( yb - ya ) * ( xc - xa ) ) / 2 ;
  System . out . println ( ans ) ;
  return ans ;
}
