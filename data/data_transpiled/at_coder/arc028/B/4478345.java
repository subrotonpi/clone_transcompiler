static final int [ ] getSortValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( i ) ;
  }
  return L . toArray ( ) ;
}
