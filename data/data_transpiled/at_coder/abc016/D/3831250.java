public static boolean cross ( int Ax , int Ay , int Bx , int By ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> pos = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) pos . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  pos . add ( new ArrayList < > ( ) ) ;
  /* Cross judge (x0, y0, x1, y1, x2, y2, x3, y3) */
  int ax = x1 - x0 ;
  int ay = y1 - y0 ;
  int bx = x2 - x0 ;
  int by = y2 - y0 ;
  int crossProduct0 = ax * by - ay * bx ;
  ax = x1 - x0 ;
  ay = y1 - y0 ;
  bx = x3 - x0 ;
  by = y3 - y0 ;
  int crossProduct1 = ax * by - ay * bx ;
  ax = x3 - x2 ;
  ay = y3 - y2 ;
  bx = x2 - x0 ;
  by = y2 - y0 ;
  int crossProduct2 = ax * by - ay * bx ;
  ax = x3 - x2 ;
  ay = y3 - y2 ;
  bx = x2 - x1 ;
  by = y2 - y1 ;
  int crossProduct3 = ax * by - ay * bx ;
  if ( crossProduct0 * crossProduct1 < 0 && crossProduct2 * crossProduct3 < 0 ) {
    return true ;
  }
  else {
    return false ;
  }
  int preX = pos . get ( 0 ) . get ( 0 ) ;
  int preY = pos . get ( 0 ) . get ( 1 ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < pos . size ( ) ;
  i ++ ) {
    final int x = pos . get ( i ) . get ( 0 ) ;
    final int y = pos . get ( i ) . get ( 1 ) ;
    if ( i == 0 ) continue ;
    if ( crossjudge ( Ax , Ay , Bx , By , preX , preY , x , y ) ) {
      count ++ ;
    }
    preX = x ;
    preY = y ;
  }
  System . out . println ( count / 2 + 1 ) ;
  return true ;
}
