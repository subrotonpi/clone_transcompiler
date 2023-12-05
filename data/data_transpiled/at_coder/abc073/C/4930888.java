public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  Set < Integer > paper = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    if ( ! paper . contains ( A ) ) {
      paper . add ( A ) ;
    }
    else {
      paper . remove ( A ) ;
    }
  }
  System . out . println ( paper . size ( ) ) ;
}
