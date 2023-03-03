@ VisibleForTesting static int [ ] [ ] bfs ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int sy = Integer . parseInt ( input . nextLine ( ) ) ;
  int sx = Integer . parseInt ( input . nextLine ( ) ) ;
  int gy = Integer . parseInt ( input . nextLine ( ) ) ;
  int gx = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Cell > cellList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) cellList . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  final int inf = 100000000 ;
  int [ ] [ ] d = new int [ c ] [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) d [ i ] [ 0 ] = inf ;
  int [ ] dx = {
    1 , 0 , - 1 , 0 }
    ;
    int [ ] dy = {
      0 , 1 , 0 , - 1 }
      ;
      /* bfs */
      Queue < Integer > q = new LinkedList < > ( ) ;
      q . add ( new Integer ( sy - 1 ) ) ;
      q . add ( new Integer ( sx - 1 ) ) ;
      d [ sy - 1 ] [ sx - 1 ] = 0 ;
      while ( ! q . isEmpty ( ) ) {
        int qy = q . poll ( ) ;
        int qx = q . poll ( ) ;
        if ( qx == gx - 1 && qy == gy - 1 ) break ;
        for ( int i = 0 ;
        i < 4 ;
        i ++ ) {
          int nx = qx + dx [ i ] ;
          int ny = qy + dy [ i ] ;
          try {
            if ( 0 <= ny && ny < r && 0 <= nx && cellList . get ( ny ) [ nx ] != '#' && d [ ny ] [ nx ] == inf ) {
              q . add ( new Integer ( ny ) ) ;
              d [ ny ] [ nx ] = d [ qy ] [ qx ] + 1 ;
            }
          }
          catch ( NoSuchElementException e ) {
          }
        }
      }
      return d [ gy - 1 ] [ gx - 1 ] ;
    }
    