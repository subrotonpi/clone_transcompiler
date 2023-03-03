@ GwtIncompatible ( "collections.deque" ) private static LinkedList < Pair > comb ( String s ) {
  LinkedList < Pair > p = new LinkedList < Pair > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 * i ;
    j ++ ) {
      Pair e = p . removeFirst ( ) ;
      p . addLast ( new Pair ( e . first + s . charAt ( i ) , e . second ) ) ;
      p . addLast ( new Pair ( e . first , e . second + s . charAt ( i ) ) ) ;
    }
  }
  return p ;
}
