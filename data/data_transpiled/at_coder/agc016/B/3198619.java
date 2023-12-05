public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ma = Collections . max ( A ) ;
  int mi = Collections . min ( A ) ;
  if ( ma - mi > 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( ma - mi == 0 && N - 1 == ma ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
  int d = N - ma ;
  int cma = A . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  if ( d + 1 <= cma && cma <= d * 2 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return A . toArray ( ) ;
}
