public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  Set < Integer > ans = new HashSet < > ( ) ;
  for ( int x = 1 ;
  x <= Math . min ( N + 1 , 9 * 18 ) ;
  x ++ ) {
    if ( N == N - x + Integer . valueOf ( Integer . parseInt ( input ) ) ) {
      ans . add ( N - x ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  if ( ans . size ( ) > 0 ) {
    System . out . println ( ( ( Integer ) ans . toArray ( ) [ 0 ] ) . toString ( ) ) ;
  }
}
