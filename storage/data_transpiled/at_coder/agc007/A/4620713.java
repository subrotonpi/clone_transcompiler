@ VisibleForTesting static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int w = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  char [ ] [ ] a = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] [ 0 ] = input . toCharArray ( ) ;
  }
  int rightCount = Arrays . stream ( a ) . mapToInt ( int :: length ) . sum ( ) ;
  int [ ] pattern = {
    ( 1 == 0 ) ? 0 : 1 }
    ;
    Queue < Point > queue = new LinkedList < > ( ) ;
    queue . add ( new Point ( 0 , 0 ) ) ;
    /* bfs */
    int cnt = 1 ;
    while ( queue . size ( ) > 0 ) {
      final Point x = queue . poll ( ) ;
      if ( ( x == w ) && ( x == h ) ) return cnt ;
      boolean around = false ;
      for ( int i = 0 ;
      i < pattern . length ;
      i ++ ) {
        if ( pattern [ i ] < x + j ) {
          if ( a [ y + i ] [ x + j ] == '#' ) {
            queue . add ( new Point ( x + j , y + i ) ) ;
            around = true ;
            cnt ++ ;
          }
        }
      }
      if ( around == false ) return false ;
    }
    System . out . println ( bfs . size ( ) == rightCount ? "Possible" : "Impossible" ) ;
  }
  