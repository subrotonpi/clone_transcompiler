public static void xa ( ) {
  xa = 0 ;
  ya = 0 ;
  xb = 0 ;
  yb = 0 ;
  xc = 0 ;
  yc = 0 ;
  xb -= xa ;
  xc -= xa ;
  yb -= ya ;
  yc -= ya ;
  System . out . println ( Math . abs ( xb * yc - xc * yb ) / 2 ) ;
}
