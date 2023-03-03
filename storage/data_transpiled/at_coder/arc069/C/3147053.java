static final int [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  A = Ordering . natural ( ) . reverse ( ) ;
  A . add ( 0 ) ;
  int [ ] ans = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
  }
  return ans ;
}
