public static void print ( int N ) {
  IntFunction f = new IntFunction ( ) {
    @ Override public int apply ( String str ) {
      return Integer . parseInt ( str ) ;
    }
  }
  ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int x = Math . max ( 1 , N - 162 ) ;
  x < N ;
  x ++ ) {
    if ( x + f . apply ( x ) == N ) {
      l . add ( x ) ;
    }
  }
  System . out . println ( l . size ( ) ) ;
  for ( Integer l_i : l ) {
    System . out . println ( l_i ) ;
  }
}
