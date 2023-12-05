public static int Ax = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> XY = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    XY . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  XY . add ( XY . get ( 0 ) ) ;
  /* Cross the number of points */
  double tc = ( x1 - x2 ) * ( y3 - y1 ) + ( y1 - y2 ) * ( x1 - x3 ) ;
  double td = ( x1 - x2 ) * ( y4 - y1 ) + ( y1 - y2 ) * ( x1 - x4 ) ;
  double ta = ( x3 - x4 ) * ( y1 - y3 ) + ( y3 - y4 ) * ( x3 - x1 ) ;
  double tb = ( x3 - x4 ) * ( y2 - y3 ) + ( y3 - y4 ) * ( x3 - x2 ) ;
  if ( ta * tb < 0 && tc * td < 0 ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
}
