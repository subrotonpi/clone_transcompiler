@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) public static void bfs ( int a , int b ) {
  final LinkedList < int [ ] > queue = new LinkedList < > ( ) ;
  queue . add ( new int [ ] {
    a , 0 }
    ) ;
    while ( queue . size ( ) > 0 ) {
      a = queue . removeFirst ( ) ;
      int [ ] d = queue . removeFirst ( ) ;
      if ( a == b ) {
        return d ;
      }
      for ( int i = 1 ;
      i <= - 1 ;
      i ++ ) {
        int new_a = a + i ;
        int new_d = d . length + 1 ;
        queue . add ( new int [ ] {
          new_a , new_d }
          ) ;
        }
      }
      if ( getClass ( ) . equals ( String . class ) ) {
        a = Integer . parseInt ( input ( ) ) ;
        b = Integer . parseInt ( input ( ) ) ;
        System . out . println ( bfs ( a , b ) ) ;
      }
    }
    