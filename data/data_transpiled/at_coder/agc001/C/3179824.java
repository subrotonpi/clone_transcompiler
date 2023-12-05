@ VisibleForTesting static int reachableEdges ( int rootE ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Tuple [ ] es = new Tuple [ N - 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] = Tuple . of ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
  }
  List < Tuple > tr = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tr . add ( new Tuple ( i , i ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = es [ i ] . getA ( ) ;
    final int b = es [ i ] . getB ( ) ;
    tr . get ( a ) . add ( new Tuple ( b , i ) ) ;
    tr . get ( b ) . add ( new Tuple ( a , i ) ) ;
  }
  return 0 ;
}
