public static void xa ( ) {
  int xa = 0 ;
  int ya = 0 ;
  int xb = 0 ;
  int yb = 0 ;
  int xc = 0 ;
  int yc = 0 ;
  xb = xb - xa ;
  xc = xc - xa ;
  yb = yb - ya ;
  yc = yc - ya ;
  System . out . println ( Math . abs ( xb * yc - xc * yb ) / 2 ) ;
}
