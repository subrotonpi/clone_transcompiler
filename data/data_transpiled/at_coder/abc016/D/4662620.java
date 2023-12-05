public static boolean check ( int ax , int ay , int bx , int by ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> xy = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xy . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  /* check the x,y,z,w */
  double s = ( bx - ax ) * ( y - ay ) - ( by - ay ) * ( x - ax ) ;
  double t = ( bx - ax ) * ( w - ay ) - ( by - ay ) * ( z - ax ) ;
  double u = ( z - x ) * ( ay - y ) - ( w - y ) * ( ax - x ) ;
  double v = ( z - x ) * ( by - y ) - ( w - y ) * ( bx - x ) ;
  return s * t < 0 && u * v < 0 ;
}
