static private int findBlade ( int [ ] [ ] grid , int R , int C ) {
  final Scanner in = new Scanner ( System . in ) ;
  int result ;
  int T ;
  int R , C , D ;
  for ( int k = xrange ( Math . min ( R , C ) , 2 , - 1 ) ;
  k >= 0 ;
  k -- ) {
    double cx = ( k - 1 ) / 2.0 ;
    double cy = ( k - 1 ) / 2.0 ;
    for ( int xstart = xrange ( 0 , R - k + 1 ) ;
    xstart <= R ;
    xstart ++ ) {
      for ( int ystart = xrange ( 0 , C - k + 1 ) ;
      ystart <= C ;
      ystart ++ ) {
        double mx = 0 ;
        double my = 0 ;
        for ( int dx = xrange ( k ) ;
        dx > 0 ;
        dx -- ) {
          for ( int dy = xrange ( k ) ;
          dy > 0 ;
          dy -- ) {
            if ( ( dx == 0 || dx == k - 1 ) && ( dy == 0 || dy == k - 1 ) ) {
              // do nothing
            }
            else {
              double mass = grid [ xstart + dx ] [ ystart + dy ] ;
              mx += ( cx - dx ) * mass ;
              my += ( cy - dy ) * mass ;
            }
          }
        }
        if ( Math . abs ( mx ) < 1e-5 && Math . abs ( my ) < 1e-5 ) {
          return k ;
        }
      }
    }
  }
  in . close ( ) ;
  T = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    R = Integer . parseInt ( in . nextLine ( ) ) ;
    C = Integer . parseInt ( in . nextLine ( ) ) ;
    D = Integer . parseInt ( in . nextLine ( ) ) ;
    grid = new int [ R ] [ C ] ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      int [ ] deltas = map . get ( in . nextLine ( ) ) ;
      grid [ r ] = new int [ D ] ;
      for ( int d : deltas ) {
        grid [ r ] [ r ] = map . get ( in . nextLine ( ) ) ;
      }
    }
    result = findBlade ( grid , R , C ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( result != null ? result : "IMPOSSIBLE" ) ) ;
  }
  return 0 ;
}
