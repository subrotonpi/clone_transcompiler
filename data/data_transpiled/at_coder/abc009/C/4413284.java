@ VisibleForTesting static String from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  String s = input . substring ( 0 , N ) ;
  TreeSet < String > cand = new TreeSet < String > ( s ) ;
  int mismatch = 0 ;
  String ans = "" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Map < String , Integer > count = new TreeMap < String , Integer > ( s . substring ( 0 , i + 1 ) ) - new TreeMap < String , Integer > ( new LinkedList < String > ( ) ) ;
    int sum_ = new Integer ( count . values ( ) . length ) ;
    for ( String cj : Collections . list ( cand ) ) {
      int miss = mismatch + ( cj != s . charAt ( i ) ) ? 1 : 0 ;
      int dif = sum_ - ( count . get ( cj ) > 0 ) ? 1 : 0 ;
      if ( miss + dif <= K ) {
        ans += cj ;
        cand . remove ( cj ) ;
        mismatch = miss ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
