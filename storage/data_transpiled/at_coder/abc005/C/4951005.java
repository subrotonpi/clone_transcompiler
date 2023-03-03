public static void print ( int T ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    B . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( N < M ) {
    System . out . println ( "no" ) ;
    quit ( ) ;
  }
  Collections . sort ( A ) ;
  Collections . sort ( B ) ;
  for ( int b : B ) {
    for ( int i = 0 ;
    i < A . size ( ) ;
    i ++ ) {
      int a = A . get ( i ) ;
      if ( b - a >= 0 && b - a <= T ) {
        A . remove ( i ) ;
        break ;
      }
    }
  }
  if ( N - A . size ( ) == M ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
