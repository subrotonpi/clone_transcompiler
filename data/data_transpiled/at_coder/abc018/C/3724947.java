@ VisibleForTesting static void input ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > inputs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    inputs . add ( input . nextLine ( ) ) ;
  }
  Queue < Integer > que = new LinkedList < > ( ) ;
  int result = 0 ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) {
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      if ( inputs . get ( r ) . charAt ( c ) == 'x' ) {
        que . add ( new Integer ( r ) ) ;
      }
    }
  }
  for ( int k = 0 ;
  k < K - 1 ;
  k ++ ) {
    Queue < Integer > tmpque = new LinkedList < > ( ) ;
    while ( que . size ( ) > 0 ) {
      int r = que . poll ( ) ;
      int c = que . poll ( ) ;
      for ( int i = r + 1 , j = c - 1 ;
      i < R ;
      i ++ , j ++ ) {
        if ( 0 <= i && j < C && inputs . get ( i ) . charAt ( j ) == 'o' ) {
          inputs . set ( i , j ) ;
        }
      }
    }
    que = tmpque ;
  }
  for ( int x = K - 1 ;
  x <= R - K + 1 ;
  x ++ ) {
    for ( int y = K - 1 ;
    y <= C - K + 1 ;
    y ++ ) {
      if ( inputs . get ( x ) . charAt ( y ) == 'o' ) {
        result ++ ;
      }
    }
  }
  System . out . println ( result ) ;
}
