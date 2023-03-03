static final int [ ] [ ] getStrings ( ) {
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < String >> S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) S . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > QUE = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( S . get ( i ) . get ( j ) . equals ( "x" ) ) QUE . add ( new Integer ( i ) ) ;
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
      i < R ;
      i ++ , j ++ ) {
        if ( 0 <= i && i < R && 0 <= j && j < C && S . get ( i ) . get ( j ) . equals ( "o" ) ) {
          S . set ( i , j ) ;
        }
      }
    }
    QUE = new ArrayDeque < > ( NQUE ) ;
  }
  int ANS = 0 ;
  for ( int i = K - 1 ;
  i <= R - K ;
  i ++ ) {
    for ( int j = K - 1 ;
    j <= C - K ;
    j ++ ) {
      if ( S . get ( i ) . get ( j ) . equals ( "o" ) ) ANS ++ ;
    }
  }
  System . out . println ( ANS ) ;
  return S ;
}
