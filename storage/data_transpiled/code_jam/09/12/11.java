static final int [ ] [ ] solve ( int y , int x , int M ) {
  int [ ] [ ] intersections = null ;
  int [ ] [ ] corners = null ;
  int N = 0 ;
  int M = 0 ;
  {
    int i ;
    int s = intersections [ y ] [ x ] ;
    int w = intersections [ y ] [ x ] ;
    int t = intersections [ y ] [ x ] ;
    time = time % ( s + w ) ;
    if ( time <= s - 1 ) {
      return 1 ;
    }
    else {
      return ( s - time ) + w + 1 ;
    }
  }
  {
    int C = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
    for ( i = 0 ;
    i < C ;
    i ++ ) {
      int s = intersections [ y ] [ x ] ;
      int w = intersections [ y ] [ x ] ;
      int t = intersections [ y ] [ x ] ;
      time = time - t + w ;
      time = time % ( s + w ) ;
      if ( time <= w - 1 ) {
        return 1 ;
      }
      else {
        return ( w - time ) + s + 1 ;
      }
    }
  }
  {
    int i ;
    int x = Handle ( ) ;
    System . err . println ( "Case #" + ( i + 1 ) + ": " + x ) ;
    System . err . println ( "Case done" + ( i + 1 ) ) ;
  }
  {
    int corner = intersections [ y ] [ x ] ;
    if ( corner == 0 || corner > newtime ) {
      corners [ y ] [ x ] = newtime ;
      Flow ( y , x ) ;
    }
  }
  {
    int mytime = intersections [ y ] [ x ] ;
    if ( y > 0 ) {
      if ( y % 2 == 0 ) {
        MaybeSet ( y - 1 , x , mytime + 2 ) ;
      }
      else {
        MaybeSet ( y - 1 , x , mytime + GoNS ( y / 2 , x / 2 , mytime ) ) ;
      }
    }
    if ( y < ( N * 2 - 1 ) ) {
      if ( y % 2 == 1 ) {
        MaybeSet ( y , x - 1 , mytime + 2 ) ;
      }
      else {
        MaybeSet ( y , x - 1 , mytime + GoEW ( y / 2 , x / 2 , mytime ) ) ;
      }
    }
  }
  {
    int i ;
    int x = Handle ( ) ;
    System . err . println ( " Case ▁ done