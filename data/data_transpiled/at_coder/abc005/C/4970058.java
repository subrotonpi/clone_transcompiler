public static int T = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int b : B ) {
    while ( A . size ( ) > 0 ) {
      int a = A . removeFirst ( ) ;
      if ( b >= a && b <= a + T + 1 ) {
        break ;
      }
    }
    else {
      System . out . println ( "no" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "yes" ) ;
  }
  return M ;
}
