static final void print ( ) {
  System . setOut ( new PrintStream ( System . out ) ) ;
  String s = input . nextLine ( ) ;
  int K = Integer . MAX_VALUE ;
  if ( Arrays . equals ( s , '0' ) ) {
    K = s . length ( ) ;
  }
  else if ( Arrays . equals ( s , '1' ) ) {
    K = s . length ( ) ;
  }
  else {
    for ( int k = 1 ;
    k < s . length ( ) ;
    k ++ ) {
      if ( s . charAt ( k ) != s . charAt ( k - 1 ) ) {
        K = Math . min ( K , Math . max ( k , s . length ( ) - k ) ) ;
      }
      else {
        continue ;
      }
    }
  }
}
