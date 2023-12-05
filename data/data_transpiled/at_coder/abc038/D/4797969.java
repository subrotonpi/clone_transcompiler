static final int [ ] getSortValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Pair [ ] D = new Pair [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int h = Integer . parseInt ( input . nextLine ( ) ) ;
    D [ i ] = new Pair ( w , - h ) ;
  }
  Arrays . sort ( D ) ;
  int h = - D [ 0 ] . value ;
  int L = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    h = - D [ i ] . value ;
  }
  return L ;
}
