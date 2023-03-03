static final int [ ] [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Pair < Integer , Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( new Pair < > ( Integer . parseInt ( input . nextLine ( ) ) , i ) ) ;
  }
  Collections . sort ( A ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ A . get ( i ) . second ] = i ;
  }
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] = A [ B . get ( i ) . first ] ;
  }
  Set < Integer > Candi = new HashSet < > ( ) ;
  int ctr = 0 ;
  while ( Candi . size ( ) >= Q ) {
    List < Integer > T = Candi ;
    ans . add ( new Pair < > ( Collections . unmodifiableList ( T ) , C ) ) ;
    Candi . remove ( ctr ) ;
  }
  return C ;
}
