@ VisibleForTesting static void f ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] S = new char [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( S [ i ] [ j ] == 'S' ) {
        start = i ;
      }
      if ( S [ i ] [ j ] == 'G' ) {
        goal = i ;
      }
    }
  }
  final int [ ] dy = {
    0 , 1 , 0 , - 1 }
    ;
    final int [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      /* [4] v = new boolean[w]; */
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        v [ i ] = new boolean [ w ] ;
      }
      PriorityQueue < Integer > Q = new PriorityQueue < Integer > ( ) ;
      Q . add ( new Integer ( 0 ) ) ;
      Q . add ( start ) ;
      while ( Q . size ( ) != 0 ) {
        int c = Q . poll ( ) ;
        final int y = Q . poll ( ) ;
        final int x = Q . poll ( ) ;
        for ( int i = 0 ;
        i < 4 ;
        i ++ ) {
          final int ny = y + dy [ i ] ;
          final int nx = x + dx [ i ] ;
          if ( ! 0 <= ny < h || ! 0 <= nx < w ) {
            continue ;
          }
          if ( v [ ny ] [ nx ] ) {
            continue ;
          }
          v [ ny ] [ nx ] = true ;
          if ( ( ny = ny ) == goal ) {
            return nc <= t ;
          }
          Q . add ( new Integer ( nc ) ) ;
        }
      }
      int low = 1 ;
      int high = t ;
      while ( low + 1 < high ) {
        final int mid = ( low + high ) / 2 ;
        if ( f ( mid ) ) {
          low = mid ;
        }
        else {
          high = mid ;
        }
      }
      System . out . println ( low ) ;
    }
    