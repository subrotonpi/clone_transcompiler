@ CollectionsFunction public static int solve ( int N , int M , int [ ] [ ] P ) throws IOException {
  int ori = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int dis = P [ i ] [ 1 ] - P [ i ] [ 0 ] ;
    int start = N ;
    int end = N + 1 - dis ;
    ori += P [ i ] [ 2 ] * ( start + end ) * dis / 2 ;
  }
  List < Integer > times = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    times . add ( P [ i ] [ 0 ] + 1 ) ;
  }
  times = Collections . unmodifiableList ( times ) ;
  Collections . sort ( times ) ;
  Map < Integer , Integer > pool = new HashMap < Integer , Integer > ( ) ;
  int spent = 0 ;
  for ( int t : times ) {
    int up = 0 ;
    for ( int i = 0 ;
    i < P . length ;
    i ++ ) {
      if ( P [ i ] [ 0 ] == t ) {
        up += P [ i ] [ 2 ] ;
      }
    }
    int down = 0 ;
    for ( int i = 0 ;
    i < P . length ;
    i ++ ) {
      if ( P [ i ] [ 1 ] == t ) {
        down += P [ i ] [ 2 ] ;
      }
    }
    if ( up > down ) {
      up = up - down ;
      down = 0 ;
    }
    else if ( up <= down ) {
      down = down - up ;
      up = 0 ;
    }
    if ( up > 0 ) {
      pool . put ( t , up ) ;
    }
    while ( down > 0 ) {
      int index = new Integer ( pool . size ( ) - 1 ) ;
      if ( down >= pool . get ( index ) ) {
        int dis = t - index ;
        int start = N ;
        int end = N + 1 - dis ;
        spent += pool . get ( index ) * ( start + end ) * dis / 2 ;
        down -= pool . get ( index ) ;
        pool . remove ( index ) ;
      }
      else {
        int dis = t - index ;
        int start = N ;
        int end = N + 1 - dis ;
        spent += down * ( start + end ) * dis / 2 ;
        pool . remove ( index ) ;
        down = 0 ;
      }
    }
  }
  return ( ori - spent ) % 1000002013 ;
}
