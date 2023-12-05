public static int THIS_X = Integer . parseInt ( input ) {
  int THIS_X = Integer . parseInt ( input . nextLine ( ) ) ;
  int THIS_Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > XY = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    XY . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int minNum = 10 * 8 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = XY . get ( i ) ;
    int y1 = XY . get ( i ) ;
    x1 = x1 - THIS_X ;
    y1 = y1 - THIS_Y ;
    int x2 = XY . get ( i - 1 ) ;
    int y2 = XY . get ( i - 1 ) ;
    x2 = x2 - THIS_X ;
    y2 = y2 - THIS_Y ;
    int d = Math . abs ( x1 * y2 - x2 * y1 ) / ( Math . abs ( x1 - x2 ) * Math . abs ( x1 - x2 ) + Math . abs ( y1 - y2 ) * Math . abs ( y1 - y2 ) * Math . abs ( y1 - y2 ) * Math . abs ( 1 / 2 ) ) ;
    minNum = Math . min ( minNum , d ) ;
  }
  return minNum ;
}
