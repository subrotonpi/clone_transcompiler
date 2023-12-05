static final int [ ] [ ] getGreys ( int H , int W ) {
  int ans = H * W ;
  List < List < String >> L = new ArrayList < List < String >> ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    List < String > s = new ArrayList < String > ( ) ;
    s . add ( input . nextLine ( ) ) ;
    ans -= s . indexOf ( "#" ) ;
    L . add ( s ) ;
  }
  double [ ] [ ] length = new double [ W ] [ H ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) for ( int j = 0 ;
  j < H ;
  j ++ ) length [ i ] [ j ] = Double . POSITIVE_INFINITY ;
  length [ 0 ] [ 0 ] = 0 ;
  /* Walk through the queue until we reach the goal */
  while ( ! q . isEmpty ( ) ) {
    List < String > m = q . poll ( ) ;
    int x = m . get ( 0 ) ;
    int y = m . get ( 1 ) ;
    if ( Arrays . equals ( x , y ) == goal ) break ;
    if ( y - 1 >= 0 ) {
      if ( length [ y - 1 ] [ x ] > length [ y ] [ x ] + 1 ) {
        if ( L [ y - 1 ] [ x ] == "." ) {
          length [ y - 1 ] [ x ] = length [ y ] [ x ] + 1 ;
          q . add ( new ArrayList < String > ( ) ) ;
        }
      }
    }
    if ( y + 1 <= H - 1 ) {
      if ( length [ y + 1 ] [ x ] > length [ y ] [ x ] + 1 ) {
        if ( L [ y + 1 ] [ x ] == "." ) {
          length [ y + 1 ] [ x ] = length [ y ] [ x ] + 1 ;
          q . add ( new ArrayList < String > ( ) ) ;
        }
      }
    }
    if ( x - 1 >= 0 ) {
      if ( length [ y ] [ x - 1 ] > length [ y ] [ x ] + 1 ) {
        if ( L [ y ] [ x - 1 ] == "." ) {
          length [ y ] [ x - 1 ] = length [ y ] [ x ] + 1 ;
          q . add ( new ArrayList < String > ( ) ) ;
        }
      }
    }
    return length [ H -