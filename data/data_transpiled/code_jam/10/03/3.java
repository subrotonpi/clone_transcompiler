static final int solve ( ) {
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    final int R = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] l = new int [ R ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      l [ j ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] [ ] n = new int [ R ] [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int t = ( j + 1 ) % N ;
      int s = l [ j ] ;
      int ss = 1 ;
      while ( ( t != j ) ) {
        if ( ( s + l [ t ] > k ) && ( s + l [ t ] > k ) ) break ;
        s += l [ t ] ;
        ss ++ ;
        t = ( t + 1 ) % N ;
      }
      n [ j ] [ s ] = ss ;
    }
    int s = 0 ;
    int cur = 0 ;
    final int [ ] las = new int [ N ] ;
    las [ 0 ] = - 1 ;
    int [ ] ss = new int [ N ] ;
    int j = 0 ;
    while ( j < R ) {
      if ( las [ cur ] != - 1 ) break ;
      las [ cur ] = j ;
      s += n [ cur ] [ 0 ] ;
      ss [ j ] = s ;
      cur = ( cur + n [ cur ] [ 1 ] ) % N ;
      j ++ ;
    }
    final int period = j - las [ cur ] ;
    final int points = s - ss [ las [ cur ] ] ;
    s = ss [ las [ cur ] ] + points * ( ( R - las [ cur ] ) / period ) + ss [ las [ cur ] + ( ( R - las [ cur ] ) % period ) ] - ss [ las [ cur ] ] ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + s ) ;
  }
  return T ;
}
