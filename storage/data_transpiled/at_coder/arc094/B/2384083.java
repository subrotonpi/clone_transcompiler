@ VisibleForTesting static int from ( Scanner input ) {
  int Q = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = A * B ;
    if ( A == B ) {
      System . out . println ( 2 * A - 2 ) ;
    }
    else if ( A == B + 1 ) {
      System . out . println ( 2 * A - 2 ) ;
    }
    else {
      int C = ceil ( sqrt ( s ) ) - 1 ;
      if ( C * ( C + 1 ) >= s ) {
        System . out . println ( 2 * C - 2 ) ;
      }
      else {
        System . out . println ( 2 * C - 1 ) ;
      }
    }
  }
  return Q ;
}
