@ VisibleForTesting static List < Integer > inpl ( ) {
  return Lists . newArrayList ( input . split ( " " ) ) ;
  class Counter {
    int index = - 1 ;
    @ Override public int index ( ) {
      return index ++ ;
    }
  }
  Counter < Integer > ui = new Counter < Integer > ( ) ;
  List < Integer > xyList = new ArrayList < Integer > ( ) ;
  int H = inpl . nextInt ( ) ;
  int W = inpl . nextInt ( ) ;
  int N = inpl . nextInt ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int X = inpl . nextInt ( ) ;
    int Y = ui . getValue ( X ) ;
    int n = ui . getValue ( Y ) ;
    if ( n < xyList . size ( ) ) xyList . set ( n , 1 , 1 ) ;
    else xyList . add ( X , Y ) ;
  }
  Collections . sort ( xyList ) ;
  xyList . add ( H + 1 , 1 ) ;
  int Xprev = 0 ;
  int Yprev = 1 ;
  for ( int X = 0 ;
  X < Xprev ;
  X ++ ) {
    int Y = xyList . get ( X ) ;
    int Ybound = Yprev + X - Xprev ;
    if ( Y < Ybound ) {
      ans = X - 1 ;
      break ;
    }
    else if ( Y == Ybound ) {
      Xprev = X ;
      Yprev = Ybound - 1 ;
    }
    else {
      Xprev = X ;
      Yprev = Ybound ;
    }
  }
  System . out . println ( ans ) ;
  return xyList ;
}
