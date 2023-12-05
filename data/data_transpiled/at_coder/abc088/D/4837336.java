static final Queue < Point > queue = new ArrayDeque < > ( ) {
  @ Override public int size ( ) {
    return Integer . parseInt ( input . readLine ( ) ) ;
  }
}
;
int [ ] d = {
  ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) , ( - 1 , 0 ) }
  ;
  List < List < Character >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  int [ ] [ ] m = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) m [ i ] [ 0 ] = - 1 ;
  Queue < Point > q = new ArrayDeque < > ( ) ;
  q . add ( new Point ( 0 , 0 ) ) ;
  while ( ! q . isEmpty ( ) ) {
    Point p = q . poll ( ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      int x = p . x + d [ i ] [ 0 ] ;
      int y = p . y + d [ i ] [ 1 ] ;
      if ( 0 <= x && x < h && 0 <= y && y < w && m [ x ] [ y ] < 0 && s . get ( x ) . charAt ( y ) == '.' ) {
        q . add ( x , y ) ;
        m [ x ] [ y ] = m [ p . x ] [ p . y ] + 1 ;
      }
    }
  }
  return s . size ( ) ;
}
