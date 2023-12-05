static String testCase ( ) {
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int W = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int L = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] r = new int [ N ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    r [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  final TreeSet < int [ ] > rs = new TreeSet < > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    rs . add ( new int [ ] {
      r [ i ] , i }
      ) ;
    }
    final int [ ] [ ] a = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i <= N ;
    i ++ ) {
      a [ i ] = 0 ;
    }
    int x = 0 ;
    int y = 0 ;
    int ny = 0 ;
    for ( int [ ] ss : rs ) {
      final int s = ss [ 0 ] ;
      if ( x + 2 * s > W ) {
        y = ny ;
        x = 0 ;
      }
      final int sx = x == 0 ? 0 : x + s ;
      final int sy = y == 0 ? 0 : y + s ;
      a [ ss [ 1 ] ] = sx ;
      if ( x == 0 ) ny += 2 * s ;
      x = sx + s ;
    }
    String ans = "" ;
    for ( int [ ] aa : a ) {
      ans += " " + aa [ 0 ] + " " + aa [ 1 ] ;
    }
    return ans ;
  }
  