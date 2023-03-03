static final int binarySearch ( final boolean f , final int s , final int t ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] maze = new String [ H ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      if ( maze [ y ] . charAt ( x ) == 'S' ) sx = x ;
      sy = y ;
      if ( maze [ y ] . charAt ( x ) == 'G' ) gx = x ;
      gy = y ;
    }
  }
  final float INF = Float . POSITIVE_INFINITY ;
  final int [ ] [ ] dxy = {
    {
      ( 0 ) , ( 1 ) , ( 1 ) , ( 0 ) , ( 0 ) , ( - 1 ) , ( - 1 ) }
    }
    ;
    return s * 2 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 ;
  }
  