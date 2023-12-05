@ VisibleForTesting static LinkedHashMap < Integer , Integer > queue ;
int K = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] G = new int [ K ] [ K ] ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  G [ i ] = new int [ K ] ;
}
for ( int i = 0 ;
i < K ;
i ++ ) {
  G [ i ] [ 0 ] = new int [ ] {
    ( ( i + 1 ) % K ) , 1 }
    ;
    G [ i ] [ 1 ] = new int [ ] {
      10 * i % K , 0 }
      ;
    }
    visited = new boolean [ K ] ;
    Queue < Integer > queue = new LinkedList < > ( ) ;
    queue . add ( new Integer ( 1 ) ) ;
    while ( queue . size ( ) > 0 ) {
      int now = queue . poll ( ) ;
      int cost = queue . poll ( ) ;
      if ( now == 0 ) {
        System . out . println ( cost ) ;
        break ;
      }
      visited [ now ] = 1 ;
      for ( int i = 0 ;
      i < K ;
      i ++ ) {
        int n = G [ now ] [ i ] ;
        if ( visited [ n ] ) continue ;
        if ( n == 0 ) queue . add ( new Integer ( n ) ) ;
        else queue . add ( new Integer ( n ) ) ;
        cost = queue . poll ( ) ;
      }
    }
    return queue ;
  }
  