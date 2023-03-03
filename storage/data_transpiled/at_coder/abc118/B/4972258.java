public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  Set < Integer > S = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    S . add ( i + 1 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Set < Integer > A = new HashSet < Integer > ( ) ;
    A . add ( i ) ;
    S = S . toArray ( A ) ;
  }
  System . out . println ( S . size ( ) ) ;
}
