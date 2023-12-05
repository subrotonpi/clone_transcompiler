static final int [ ] [ ] getStrings ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    S . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  Queue < Integer > QUE = new LinkedList < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( S . get ( i ) . get ( j ) . equals ( "x" ) ) {
        QUE . add ( new Integer ( i ) ) ;
      }
    }
  }
  for ( int k = 0 ;
  k < K - 1 ;
  k ++ ) {
    Queue < Integer > NQUE = new LinkedList < > ( ) ;
    while ( QUE . size ( ) > 0 ) {
      int x = QUE . poll ( ) ;
      int y = QUE . poll ( ) ;
      for ( int i = x + 1 , j = y ;
      i <= R ;
      j += 1 ) {
        if ( 0 <= i && i <= R - 1 && 0 <= j && j <= C - 1 && S . get ( i ) . get ( j ) . equals ( "o" ) ) {
          S . set ( i , j ) ;
        }
      }
    }
    QUE = new ArrayDeque < > ( NQUE ) ;
  }
  for ( int i = K - 1 ;
  i <= R - K + 1 ;
  i ++ ) {
    for ( int j = K - 1 ;
    j <= C - K + 1 ;
    j ++ ) {
      if ( S . get ( i ) . get ( j ) . equals ( "o" ) ) ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return S ;
}
