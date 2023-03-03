@ VisibleForTesting static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] c = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] = String . valueOf ( input ) ;
  }
  Point st = new Point ( - 1 , - 1 ) ;
  Point gl = new Point ( - 1 , - 1 ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( c [ i ] [ j ] == 's' ) {
        st = new Point ( i , j ) ;
      }
      if ( c [ i ] [ j ] == 'g' ) {
        gl = new Point ( i , j ) ;
      }
    }
  }
  Queue < Point > q = new LinkedList < > ( ) ;
  int [ ] [ ] dist = new int [ W ] [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( c [ i ] [ j ] == 's' ) {
        st [ i ] = new Point ( i , j ) ;
      }
      if ( c [ i ] [ j ] == 'g' ) {
        gl [ i ] = new Point ( i , j ) ;
      }
    }
  }
  Queue < Point > q = new LinkedList < > ( ) ;
  int [ ] [ ] dx = {
    - 1 , 1 , 0 , 0 }
    ;
    int [ ] dy = {
      0 , 0 , 1 , - 1 }
      ;
      while ( ( r = q . poll ( ) ) != null ) {
        Point x = r . getPoint ( ) ;
        int y = r . getPoint ( ) ;
        for ( int k = 0 ;
        k < 4 ;
        k ++ ) {
          int nx = x + dx [ k ] ;
          int ny = y + dy [ k ] ;
          if ( 0 <= nx && nx < H && 0 <= ny && ny < W ) {
            if ( dist [ nx ] [ ny ] != - 1 ) continue ;
            if ( c [ nx ] [ ny ] == '#' ) {
              q . add ( new Point ( nx , ny ) ) ;
              dist [ nx ] [ ny ] = dist [ x ] [ y ] + 1 ;
            }
            else {
              q . add ( new Point ( nx ,