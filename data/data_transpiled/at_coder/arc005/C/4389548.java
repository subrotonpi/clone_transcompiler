public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] c = new char [ H ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      switch ( c [ y ] [ x ] ) {
        case 's' : sy = y ;
        sx = x ;
        break ;
        case 'g' : gy = y ;
        gx = x ;
        break ;
      }
    }
  }
  Queue < int [ ] > q = new LinkedList < int [ ] > ( ) ;
  q . add ( new int [ ] {
    sy , sx , 2 }
    ) ;
    int [ ] [ ] crash = new int [ W ] [ H ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      int y = q . poll ( ) ;
      int x = q . poll ( ) ;
      int power = q . poll ( ) ;
      for ( int dy = 1 , dx = 0 ;
      dy < H ;
      dy ++ , dx = 1 ) {
        int ny = dy + y , nx = dx + x ;
        if ( 0 <= ny && ny < H && 0 <= nx && nx < W && c [ ny ] [ nx ] != '#' && crash [ ny ] [ nx ] < power ) {
          if ( nx == gx && ny == gy ) {
            System . out . println ( "YES" ) ;
            exit ( ) ;
          }
          q . add ( new int [ ] {
            ny , nx , power }
            ) ;
            crash [ ny ] [ nx ] = power ;
          }
        }
      }
      System . out . println ( "NO" ) ;
      return 0 ;
    }
    