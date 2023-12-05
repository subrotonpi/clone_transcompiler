@ VisibleForTesting static int reachableEdges ( int rootE ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > es = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    es . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < List < Integer >> tr = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . get ( i ) . add ( i ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . get ( i ) . add ( i ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es . get ( i ) . add ( i ) ;
  }
  return 0 ;
}
