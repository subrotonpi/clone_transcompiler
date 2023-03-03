public static void input ( ) {
  String s = input ( ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  Set < String > strs = new HashSet < String > ( ) ;
  for ( int k = 1 ;
  k <= K ;
  k ++ ) {
    for ( int i = 0 ;
    i < s . length ( ) + 1 - k ;
    i ++ ) {
      strs . add ( s . substring ( i , i + k ) ) ;
    }
  }
  System . out . println ( new ArrayList ( Collections . list ( strs ) ) . get ( K - 1 ) ) ;
}
