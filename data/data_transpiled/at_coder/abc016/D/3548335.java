public static int [ ] [ ] Ax , int [ ] Ay , int [ ] Bx , int [ ] By ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int num = 0 ;
  {
    int P0 = ( x0 - x1 ) * ( y2 - y0 ) + ( y0 - y1 ) * ( x0 - x2 ) ;
    int Q0 = ( x0 - x1 ) * ( y3 - y0 ) + ( y0 - y1 ) * ( x0 - x3 ) ;
    int P1 = ( x2 - x3 ) * ( y0 - y2 ) + ( y2 - y3 ) * ( x2 - x0 ) ;
    int Q1 = ( x2 - x3 ) * ( y1 - y2 ) + ( y2 - y3 ) * ( x2 - x1 ) ;
    return P0 * Q0 < 0 && P1 * Q1 < 0 ? 1 : 0 ;
  }
  num = 0 ;
  int preX0 = Integer . parseInt ( input . nextLine ( ) ) ;
  int preY0 = Integer . parseInt ( input . nextLine ( ) ) ;
  int preX = preX0 , preY = preY0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( calc ( Ax , Ay , Bx , By , preX , preY , preX0 , preY0 ) ) num ++ ;
  }
  System . out . println ( num / 2 + 1 ) ;
  return new int [ num ] [ N ] ;
}
