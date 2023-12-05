@ VisibleForTesting static void input ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] c = new char [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    char ci = input . nextLine ( ) ;
    c [ i ] = ci ;
  }
  int [ ] [ ] reached = new int [ W ] [ H ] ;
  Queue < int [ ] > queue = new LinkedList < > ( ) ;
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      switch ( c [ j ] [ i ] ) {
        case 's' : sy = j ;
        sx = i ;
        break ;
        case 'g' : gy = j ;
        gx = i ;
        break ;
      }
    }
  }
  queue . add ( new int [ ] {
    sy , sx }
    ) ;
    reached [ sy ] [ sx ] = 0 ;
    int [ ] dx = {
      1 , - 1 , 0 , 0 }
      ;
      int [ ] dy = {
        0 , 0 , 1 , - 1 }
        ;
        while ( ( sy = queue . poll ( ) ) != - 1 ) {
          int [ ] p = queue . poll ( ) ;
          for ( int i = 0 ;
          i < 4 ;
          i ++ ) {
            int y = p [ 0 ] + dy [ i ] ;
            int x = p [ 1 ] + dx [ i ] ;
            if ( y == gy && x == gx ) {
              reached [ y ] [ x ] = reached [ p [ 0 ] ] [ p [ 1 ] ] ;
              queue . clear ( ) ;
              break ;
            }
            if ( x < 0 || x >= W || y < 0 || y >= H ) continue ;
            if ( c [ y ] [ x ] == '#' ) {
              if ( reached [ p [ 0 ] ] [ p [ 1 ] ] == 2 ) continue ;
              queue . add ( new int [ ] {
                y , x }
                ) ;
                reached [ y ] [ x ] = reached [ p [ 0 ] ] [ p [ 1 ] ] + 1 ;
              }
              else {
                queue . add ( new int [ ] {
                  y , x }
                  ) ;
                  reached [ y ] [ x ] = reached [ p [ 0 ] ] [ p [ 1 ] ] ;
                }
              }
            }
            if ( reached [ gy ] [ gx ] == - 1 ) System . out . println ( "NO"