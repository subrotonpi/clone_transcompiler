@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) public static int from ( String input ) {
  String x = input . trim ( ) ;
  Deque < Character > q = new ArrayDeque < Character > ( x . charAt ( 0 ) ) ;
  for ( int i = 1 ;
  i < x . length ( ) ;
  i ++ ) {
  }
  return q . size ( ) ;
}
