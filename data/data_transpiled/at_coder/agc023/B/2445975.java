static final int [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] S = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] [ i ] = input . nextLine ( ) ;
  }
  DenseMatrix64F S_mat = new DenseMatrix64F ( S ) ;
  int ret = 0 ;
  for ( int A = 0 ;
  A < N ;
  A ++ ) {
    List < Integer > A_changeList = new LinkedList < Integer > ( ) ;
    A_changeList . add ( A ) ;
    List < Integer > moved = S_mat . getQuick ( A_changeList , 0 ) ;
    if ( MatrixOps . equals ( moved , moved . toArray ( ) ) ) {
      ret ++ ;
    }
  }
  System . out . println ( N * ret ) ;
  return S ;
}
