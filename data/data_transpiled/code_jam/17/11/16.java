public static int _T = Integer . parseInt ( Scanner in ) {
  for ( int _t = 1 ;
  _t <= _T ;
  _t ++ ) {
    int R = Integer . parseInt ( in . nextLine ( ) ) ;
    int C = Integer . parseInt ( in . nextLine ( ) ) ;
    List < List < String >> G = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      G . add ( new LinkedList < > ( ) ) ;
    }
    int lasti = - 1 ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      int lastj = - 1 ;
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        if ( G . get ( i ) . get ( j ) != '?' ) {
          for ( int k = j - 1 ;
          k > lastj ;
          k -- ) {
            G . set ( i , k , G . get ( i ) . get ( j ) ) ;
          }
          lastj = j ;
        }
      }
      if ( lastj > - 1 ) {
        for ( int k = C - 1 ;
        k > lastj ;
        k -- ) {
          G . set ( i , k , G . get ( i ) . get ( lastj ) ) ;
        }
        for ( int k = i - 1 ;
        k > lasti ;
        k -- ) {
          G . set ( k , G . get ( i ) ) ;
        }
        lasti = i ;
      }
    }
    for ( int k = R - 1 ;
    k > lasti ;
    k -- ) {
      G . set ( k , G . get ( lasti ) ) ;
    }
    System . out . println ( "Case #" + _t + ":" ) ;
    for ( List < String > l : G ) {
      System . out . println ( l ) ;
    }
  }
  return _T ;
}
