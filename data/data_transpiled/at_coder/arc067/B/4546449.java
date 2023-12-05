public static int n ( int a , int b ) {
  int xlist = Integer . parseInt ( input . nextLine ( ) ) ;
  int prevx = xlist [ 0 ] ;
  int c = 0 ;
  for ( int i = 1 ;
  i < xlist ;
  i ++ ) {
    if ( ( xlist - prevx ) * a > b ) c += b ;
    else c += ( xlist - prevx ) * a ;
    prevx = xlist [ i ] ;
  }
  return c ;
}
