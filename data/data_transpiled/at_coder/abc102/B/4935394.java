static final int [ ] [ ] A ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < int [ ] > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( A . get ( i ) ) ;
  }
  int X = 0 ;
  for ( int [ ] v : A ) {
    if ( Math . abs ( v [ 0 ] - v [ 1 ] ) > X ) X = Math . abs ( v [ 0 ] - v [ 1 ] ) ;
  }
  System . out . println ( X ) ;
}
