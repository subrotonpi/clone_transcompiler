public static int testCases = Integer . parseInt ( Scanner in ) {
  final int testCases = in . nextInt ( ) ;
  for ( int tc = 1 ;
  tc <= testCases ;
  tc ++ ) {
    final int n = in . nextInt ( ) ;
    final int w = in . nextInt ( ) ;
    final int l = in . nextInt ( ) ;
    final int [ ] r = in . nextInt ( ) ;
    for ( int t = 0 ;
    t < 10 ;
    t ++ ) {
      final List < Point > places = new LinkedList < > ( ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        boolean done1 = false ;
        for ( int j = 0 ;
        j < 10 ;
        j ++ ) {
          boolean done2 = true ;
          final int x = in . nextInt ( w ) ;
          final int y = in . nextInt ( l ) ;
          for ( int k = 0 ;
          k < places . size ( ) ;
          k ++ ) {
            if ( Math . abs ( x - places . get ( k ) . x ) < r [ i ] + r [ k ] && Math . abs ( y - places . get ( k ) . y ) < r [ i ] + r [ k ] ) {
              done2 = false ;
              break ;
            }
          }
          if ( done2 ) {
            places . add ( new Point ( x , y ) ) ;
            done1 = true ;
            break ;
          }
        }
        if ( ! done1 ) {
          System . out . println ( "couldn't do it..." ) ;
          break ;
        }
      }
      else break ;
    }
    System . out . println ( "Case #" + tc + ": " + Joiner . on ( " " ) . join ( places ) ) ;
  }
  return testCases ;
}
