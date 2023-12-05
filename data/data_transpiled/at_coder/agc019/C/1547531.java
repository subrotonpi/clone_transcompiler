@ VisibleForTesting static void binarySearch ( String input ) {
  int x1 = Integer . parseInt ( input ) ;
  int y1 = Integer . parseInt ( input ) ;
  int x2 = Integer . parseInt ( input ) ;
  int y2 = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int xL = Math . min ( x1 , x2 ) ;
  int xR = Math . max ( x1 , x2 ) ;
  int yL = Math . min ( y1 , y2 ) ;
  int yR = Math . max ( y1 , y2 ) ;
  List < Point > xyl = new ArrayList < > ( ) ;
  int x , y ;
  Direction direction ;
  if ( x1 < x2 && y1 > y2 ) {
    direction = Direction . RIGHT_DOWN ;
  }
  else if ( x1 > x2 && y1 < y2 ) {
    direction = Direction . RIGHT_DOWN ;
  }
  else {
    direction = Direction . RIGHT_UP ;
  }
  if ( direction == Direction . RIGHT_UP ) {
    for ( ;
    x1 < x2 && y1 > y2 ;
    x1 ++ ) {
      x = Integer . parseInt ( input ) ;
      y = Integer . parseInt ( input ) ;
      if ( xL <= x && x <= xR && yL <= y && y <= yR ) {
        xyl . add ( new Point ( x , y - yL ) ) ;
      }
    }
  }
  else {
    for ( ;
    x1 < x2 && y1 > y2 ;
    x1 ++ ) {
      x = Integer . parseInt ( input ) ;
      y = Integer . parseInt ( input ) ;
      if ( xL <= x && x <= xR && yL <= y && y <= yR ) {
        xyl . add ( new Point ( x , yR - y ) ) ;
      }
    }
  }
  int ind = xyl . size ( ) ;
  Collections . sort ( xyl ) ;
  int [ ] dp = new int [ ind ] ;
  for ( int i = 0 ;
  i < ind ;
  i ++ ) {
    dp [ i ] = yR - yL + 1 ;
  }
  for ( int i = 0 ;
  i < ind ;
  i ++ ) {
    final Point y = xyl . get ( i ) ;
    dp [ MathUtils . binarySearch ( dp , y ) ] = y ;
  }
  int count_ = dp . length ;
  double diff = 5 * Math . PI - 20 ;
  double diff2 = 10 * Math . PI - 20 ;
  if ( count_ == Math . min ( ( xR - xL ) , ( yR - yL ) ) + 1 ) {
    System . out